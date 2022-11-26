package com.keyflare.exchange.designSystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.keyflare.exchange.designSystem.common.CustomTheme

@Composable
fun ExchangeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) DarkColors else LightColors

    CustomTheme(
        colors = colors,
        type = Type,
        darkTheme = darkTheme,
        content = content,
    )
}
