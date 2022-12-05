package com.keyflare.exchange.navigation.internal.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalNavigationDestinations = staticCompositionLocalOf {
    emptyMap<Int, @Composable (Any) -> Unit>()
}
