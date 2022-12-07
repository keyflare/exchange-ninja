package com.keyflare.exchange.designSystem.common

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Immutable
data class CustomColors(
    val textPrimary: Color = Color.White,
    val textAction: Color = Color.White,
    val textPrimaryVariant: Color = Color.White,
    val textSecondary: Color = Color.White,
    val textAdditional: Color = Color.White,
    val textAlert: Color = Color.White,
    val textSuccess: Color = Color.White,
    val background: Color = Color.White,
    val surface: Color = Color.White,
    val surfaceSecondary: Color = Color.White,
    val surfaceSecondaryVariant: Color = Color.White,
    val surfaceAction: Color = Color.White,
    val surfaceAccent: Color = Color.White,
    val iconsPrimary: Color = Color.White,
    val iconsSecondary: Color = Color.White,
    val iconsAction: Color = Color.White,
    val divider: Color = Color.White,
    val tint: Color = Color.White,
)

@Immutable
data class CustomTypography(
    val digitL: TextStyle = TextStyle.Default,
    val digitM: TextStyle = TextStyle.Default,
    val digitS: TextStyle = TextStyle.Default,
    val heading1: TextStyle = TextStyle.Default,
    val heading2: TextStyle = TextStyle.Default,
    val heading3: TextStyle = TextStyle.Default,
    val heading4: TextStyle = TextStyle.Default,
    val body1: TextStyle = TextStyle.Default,
    val body2: TextStyle = TextStyle.Default,
    val body3: TextStyle = TextStyle.Default,
)

val LocalCustomColors = staticCompositionLocalOf { CustomColors() }
val LocalCustomTypography = staticCompositionLocalOf { CustomTypography() }

object CustomTheme {
    val colors @Composable get() = LocalCustomColors.current
    val type @Composable get() = LocalCustomTypography.current
}

@Composable
fun CustomTheme(
    colors: CustomColors,
    type: CustomTypography,
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalCustomColors provides colors,
        LocalCustomTypography provides type,
    ) {
        MaterialTheme(
            colors = if (darkTheme) darkColors() else lightColors(),
            content = content,
        )
    }
}
