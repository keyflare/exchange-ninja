package com.keyflare.exchange.navigation.internal

import com.keyflare.exchange.common.extensions.cast
import com.keyflare.exchange.navigation.api.*
import com.keyflare.exchange.navigation.core.api.*
import com.keyflare.exchange.redux.api.Reducer

internal val navigationReducerInternal: Reducer<NavigationState> = Reducer { state, action ->
    when (action) {
        is NavigationPushAction<*> -> state.push(action)
        is NavigationPushForResultAction<*, *> -> state.pushForResultMap(action)
        is NavigationAcceptDestinationsAction -> state.acceptDestinations(action)
        else -> state
    }
}

private fun NavigationState.acceptDestinations(
    action: NavigationAcceptDestinationsAction
): NavigationState {
    return copy(
        entryFactories = action.destinations.destinations.associate {
            it.id.id to it.entryFactory
        }
    )
}

private fun <P : NavigationParams> NavigationState.push(
    action: NavigationPushAction<P>,
): NavigationState {
    return copy(
        root = root.mutate(backstackId = action.backstackId) { screens ->
            val entry = entryFactories[action.destination.id]?.invoke(action.params)
            screens.add(requireNotNull(entry).cast())
        }
    )
}

private fun <P : NavigationParams, R : PushResult> NavigationState.pushForResultMap(
    action: NavigationPushForResultAction<P, R>
): NavigationState {
    TODO()
}

private fun Backstack.mutate(
    backstackId: BackstackId,
    operation: (MutableList<NavigationEntry<out NavigationParams, out PushResult>>) -> Unit
): Backstack {
    val newScreens = screens.toMutableList()

    if (this.id == backstackId) {
        operation(newScreens)
    } else {
        newScreens.map {
            if (it is Backstack) {
                it.mutate(backstackId, operation)
            } else {
                it
            }
        }
    }

    return copy(screens = newScreens.toList())
}
