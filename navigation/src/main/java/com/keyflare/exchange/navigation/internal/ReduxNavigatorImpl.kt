package com.keyflare.exchange.navigation.internal

import com.keyflare.exchange.navigation.api.*
import com.keyflare.exchange.redux.api.Store
import kotlinx.coroutines.flow.*

internal class ReduxNavigatorImpl : ReduxNavigator {

    private lateinit var store: Store<out NavigationState>

    override fun push(
        backstack: BackstackId,
        destination: NavigationEntryId<NavigationParams.None>,
    ) {
        push(backstack, destination, params = NavigationParams.None)
    }

    override fun <P : NavigationParams> push(
        backstack: BackstackId,
        destination: NavigationEntryId<P>,
        params: P
    ) {
        store.dispatch(
            NavigationPushAction(
                backstack = backstack,
                destination = destination,
                params = params,
            )
        )
    }

    override fun pop(backstack: BackstackId) {
        store.dispatch(NavigationPopAction(backstack = backstack))
    }

    override fun <P : NavigationParams, R : PushResult> pushForResult(
        request: PushForResultRequest<R>,
        destination: NavigationEntryWithResultId<P, R>,
        params: P,
    ): Flow<PushResult> {
        return store.states
            .mapNotNull { state -> state.pushForResultMap[request] }
            .take(1)
            .onEach { store.dispatch(NavigationProcessResultAction(request)) }
            .onStart { store.dispatch(NavigationPushForResultAction(request, destination, params)) }
    }

    override fun <R : PushResult> popWithResult(request: PushForResultRequest<R>, result: R) {
        store.dispatch(NavigationPopWithResultAction(request, result))
    }
}
