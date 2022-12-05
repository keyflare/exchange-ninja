package com.keyflare.exchange.navigation.internal.presentation

import androidx.compose.runtime.Composable
import com.keyflare.exchange.navigation.core.api.NavigationDestinationsSet

@Composable
internal fun NavigationDestinationsSet.composablesMap(): Map<Int, @Composable (Any) -> Unit> {
    return destinations.associate { it.id.id to it.composable }
}
