package com.keyflare.exchange.navigation.core.api

import androidx.compose.runtime.Composable
import com.keyflare.exchange.common.extensions.cast

inline fun <reified P : NavigationParams, R : PushResult, reified T : NavigationEntry<P, R>> destination(
    id: NavigationEntryId<P, R>,
    noinline entryFactory: (P) -> T,
    crossinline composable: @Composable (T) -> Unit,
): NavigationDestination {
    return NavigationDestination(
        id = id,
        entryFactory = { params -> entryFactory(params.cast()) },
        composable = @Composable { any -> composable(any.cast()) }
    )
}

class NavigationDestinationsSet(
    val destinations: List<NavigationDestination>
) {
    constructor(vararg sets: NavigationDestinationsSet)
            : this(destinations = sets.map { it.destinations }.flatten())
}

class NavigationDestination(
    val id: NavigationEntryId<*, *>,
    val entryFactory: (Any) -> Any,
    val composable: @Composable (Any) -> Unit,
)
