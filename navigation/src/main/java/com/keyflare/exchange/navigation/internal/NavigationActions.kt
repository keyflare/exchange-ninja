package com.keyflare.exchange.navigation.internal

import com.keyflare.exchange.navigation.api.*
import com.keyflare.exchange.redux.api.Action

internal data class NavigationPushAction<P: NavigationParams>(
    val backstack: BackstackId,
    val destination: NavigationEntryId<P>,
    val params: P,
) : Action

internal data class NavigationPopAction(
    val backstack: BackstackId,
) : Action

internal data class NavigationPushForResultAction<P: NavigationParams, R : PushResult>(
    val request: PushForResultRequest<R>,
    val destination: NavigationEntryWithResultId<P, R>,
    val params: P,
) : Action

internal data class NavigationPopWithResultAction<R : PushResult>(
    val request: PushForResultRequest<R>,
    val result: R,
) : Action

internal data class NavigationProcessResultAction<R : PushResult>(
    val request: PushForResultRequest<R>,
) : Action
