package com.keyflare.exchange.navigation.core.api.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.keyflare.exchange.navigation.core.api.Backstack
import com.keyflare.exchange.navigation.core.internal.NavigationEntryComposeBinding

@Composable
fun NavigationReplaceContainer(
    backstack: Backstack,
    modifier: Modifier = Modifier,
) {
    val currentScreen = backstack.screens.lastOrNull()

    if (currentScreen != null) {
        Box(modifier = modifier) {
            NavigationEntryComposeBinding(entry = currentScreen)
        }
    }
}
