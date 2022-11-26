package com.keyflare.exchange.designSystem.component

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import me.onebone.toolbar.*

@Composable
fun DsCollapsingToolbarScaffold(
    collapsedHeight: Dp = 0.dp,
    toolbar: @Composable CollapsingToolbarScope.(CollapsingToolbarState) -> Unit,
    body: @Composable CollapsingToolbarScaffoldScope.() -> Unit,
) {
    val collapsingToolbarScaffoldState = rememberCollapsingToolbarScaffoldState()

    CollapsingToolbarScaffold(
        state = collapsingToolbarScaffoldState,
        scrollStrategy = ScrollStrategy.EnterAlways,
        body = body,
        toolbar = {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(collapsedHeight)
            )
            toolbar(collapsingToolbarScaffoldState.toolbarState)
        },
        modifier = Modifier
            .fillMaxSize()
            .clip(RectangleShape),
    )
}
