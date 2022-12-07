package com.keyflare.exchange.designSystem.component

import androidx.compose.animation.core.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.LookaheadLayout
import androidx.compose.ui.layout.LookaheadLayoutScope
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.round
import kotlinx.coroutines.launch

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun rememberLookaheadContent(
    content: @Composable LookaheadLayoutScope.() -> Unit
): @Composable LookaheadLayoutScope.() -> Unit {
    return remember { movableContentWithReceiverOf(content = content) }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun DsLookaheadLayout(
    modifier: Modifier = Modifier,
    content: @Composable LookaheadLayoutScope.() -> Unit
) {
    LookaheadLayout(
        modifier = modifier,
        content = content,
    ) { measurables, constraints ->
        val placeables = measurables.map { it.measure(constraints) }
        val maxWidth: Int = placeables.maxOf { it.width }
        val maxHeight = placeables.maxOf { it.height }

        layout(maxWidth, maxHeight) {
            placeables.forEach {
                it.place(0, 0)
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
fun Modifier.sharedElement(
    lookaheadScope: LookaheadLayoutScope,
    sizeAnimationSpec: AnimationSpec<IntSize> = tween(),
    offsetAnimationSpec: AnimationSpec<IntOffset> = tween(),
): Modifier {
    return animateTransformation(lookaheadScope, sizeAnimationSpec)
        .animateMovement(lookaheadScope, offsetAnimationSpec)
}

@OptIn(ExperimentalComposeUiApi::class)
fun Modifier.animateMovement(
    lookaheadScope: LookaheadLayoutScope,
    animationSpec: AnimationSpec<IntOffset> = tween()
) = composed {
    var placementOffset by remember { mutableStateOf(IntOffset.Zero) }
    var targetOffset: IntOffset? by remember { mutableStateOf(null) }

    var targetOffsetAnimation: Animatable<IntOffset, AnimationVector2D>? by remember {
        mutableStateOf(null)
    }

    LaunchedEffect(Unit) {
        snapshotFlow { targetOffset }.collect { target ->
            if (target != null && target != targetOffsetAnimation?.targetValue) {
                targetOffsetAnimation?.run {
                    launch {
                        animateTo(
                            targetValue = target,
                            animationSpec = animationSpec
                        )
                    }
                } ?: Animatable(
                    initialValue = target,
                    typeConverter = IntOffset.VectorConverter
                ).let { offsetAnimatable ->
                    targetOffsetAnimation = offsetAnimatable
                }
            }
        }
    }

    with(lookaheadScope) {
        this@composed
            .onPlaced { lookaheadScopeCoordinates, layoutCoordinates ->
                targetOffset = lookaheadScopeCoordinates
                    .localLookaheadPositionOf(sourceCoordinates = layoutCoordinates)
                    .round()

                placementOffset = lookaheadScopeCoordinates
                    .localPositionOf(
                        sourceCoordinates = layoutCoordinates,
                        relativeToSource = Offset.Zero
                    )
                    .round()
            }
            .intermediateLayout { measurable, constraints, _ ->
                val placeable = measurable.measure(constraints)
                layout(placeable.width, placeable.height) {
                    val (x, y) = (
                            targetOffsetAnimation?.value ?: targetOffset!!
                            ) - placementOffset
                    placeable.place(x, y)
                }
            }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
fun Modifier.animateTransformation(
    lookaheadScope: LookaheadLayoutScope,
    animationSpec: AnimationSpec<IntSize> = tween(),
) = composed {
    var targetSize: IntSize? by remember { mutableStateOf(null) }
    var targetSizeAnimation: Animatable<IntSize, AnimationVector2D>? by remember {
        mutableStateOf(null)
    }

    LaunchedEffect(Unit) {
        snapshotFlow { targetSize }.collect { target ->
            if (target != null && target != targetSizeAnimation?.targetValue) {
                targetSizeAnimation?.run {
                    launch {
                        animateTo(
                            targetValue = target,
                            animationSpec = animationSpec
                        )
                    }
                } ?: Animatable(
                    initialValue = target,
                    typeConverter = IntSize.VectorConverter
                ).let { sizeAnimatable ->
                    targetSizeAnimation = sizeAnimatable
                }
            }
        }
    }

    with(lookaheadScope) {
        this@composed.intermediateLayout { measurable, _, lookaheadSize ->
            targetSize = lookaheadSize

            val (width, height) = targetSizeAnimation?.value ?: lookaheadSize
            val animatedConstraints = Constraints.fixed(
                width = width.coerceAtLeast(0),
                height = height.coerceAtLeast(0)
            )

            val placeable = measurable.measure(animatedConstraints)
            layout(width = placeable.width, height = placeable.height) {
                placeable.place(x = 0, y = 0)
            }
        }
    }
}