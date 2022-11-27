package com.keyflare.exchange.navigation.internal

import com.keyflare.exchange.navigation.api.*
import com.keyflare.exchange.redux.api.Reducer

internal val navigationReducerInternal: Reducer<out NavigationState> = Reducer { state, action ->
    when (action) {
        is NavigationPushAction<*> -> state.push(action)
        is NavigationPushForResultAction<*, *> -> state.pushForResultMap(action)
        else -> state
    }
}

private fun <P: NavigationParams> NavigationState.push(
    action: NavigationPushAction<P>,
): NavigationState {
    return copy(
        root = root.pushDestination(
            backstack = action.backstack,
            destination = action.destination,
            params = action.params
        )
    )
}

private fun <P: NavigationParams, R : PushResult> NavigationState.pushForResultMap(
    action: NavigationPushForResultAction<P, R>
): NavigationState {
    return copy(
        root = root.pushDestination(
            backstack = action.request.backstack,
            destination = action.destination,
            params = action.params,
        ),
    )
}

private fun <P: NavigationParams> Backstack.pushDestination(
    backstack: BackstackId,
    destination: NavigationEntryId<P>,
    params: P,
): Backstack {
    TODO()
}

private fun <P: NavigationParams> getDestination(
    id: NavigationEntryId<P>,
    params: NavigationParams,
): NavigationEntry<P> {
    TODO()
}

private fun <P: NavigationParams, R : PushResult> getDestinationForResult(
    id: NavigationEntryWithResultId<P, R>,
    request: PushForResultRequest<R>,
    params: P,
): NavigationEntryWithResult<P, R> {
    TODO()
}
