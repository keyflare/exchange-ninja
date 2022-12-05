package com.keyflare.exchange.navigation.internal

import com.keyflare.exchange.navigation.api.*
import com.keyflare.exchange.navigation.core.api.*
import com.keyflare.exchange.redux.api.Dispatcher
import com.keyflare.exchange.redux.api.StateProvider
import kotlinx.coroutines.flow.*

internal class ReduxNavigator(
    private val stateProvider: StateProvider<NavigationState>,
    private val dispatcher: Dispatcher,
) : Navigator {

    internal fun acceptDestinations(destinations: NavigationDestinationsSet) {
        dispatcher.dispatch(NavigationAcceptDestinationsAction(destinations))
    }

    override fun push(
        backstackId: BackstackId,
        destination: NavigationEntryId<NavigationParams.None, *>,
    ) {
        push(backstackId, destination, params = NavigationParams.None)
    }

    override fun <P : NavigationParams> push(
        backstackId: BackstackId,
        destination: NavigationEntryId<P, *>,
        params: P,
    ) {
        dispatcher.dispatch(
            NavigationPushAction(
                backstackId = backstackId,
                destination = destination,
                params = params,
            )
        )
    }

    override fun pop(backstackId: BackstackId) {
        dispatcher.dispatch(NavigationPopAction(backstackId = backstackId))
    }

    override fun <P : NavigationParams, R : PushResult> pushForResult(
        request: PushForResultRequest<R>,
        destination: NavigationEntryId<P, R>,
        params: P,
    ): Flow<PushResult> {
        return stateProvider.states
            .mapNotNull { state -> state.pushForResultMap[request] }
            .take(1)
            .onEach { dispatcher.dispatch(NavigationProcessResultAction(request)) }
            .onStart {
                dispatcher.dispatch(
                    NavigationPushForResultAction(request, destination, params)
                )
            }
    }

    override fun <R : PushResult> popWithResult(request: PushForResultRequest<R>, result: R) {
        dispatcher.dispatch(NavigationPopWithResultAction(request, result))
    }
}
