package com.keyflare.exchange.navigation.core.api

import kotlinx.coroutines.flow.Flow

interface Navigator {

    fun <P : NavigationParams> push(
        backstackId: BackstackId,
        destination: NavigationEntryId<P, *>,
        params: P,
    )

    fun push(
        backstackId: BackstackId,
        destination: NavigationEntryId<NavigationParams.None, *>,
    )

    fun pop(backstackId: BackstackId)

    fun <P : NavigationParams, R : PushResult> pushForResult(
        request: PushForResultRequest<R>,
        destination: NavigationEntryId<P, R>,
        params: P,
    ): Flow<PushResult>

    fun <R : PushResult> popWithResult(
        request: PushForResultRequest<R>,
        result: R,
    )
}
