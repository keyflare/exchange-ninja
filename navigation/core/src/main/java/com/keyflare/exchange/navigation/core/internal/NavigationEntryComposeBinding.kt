package com.keyflare.exchange.navigation.core.internal

import androidx.compose.runtime.Composable
import com.keyflare.exchange.common.extensions.cast
import com.keyflare.exchange.navigation.core.api.*
import com.keyflare.exchange.navigation.internal.presentation.LocalNavigationDestinations

@Composable
internal fun NavigationEntryComposeBinding(entry: NavigationEntry<*, *>) {
    val node = requireNotNull(LocalNavigationDestinations.current[entry.id.id])
    node.invoke(entry.cast())
}
