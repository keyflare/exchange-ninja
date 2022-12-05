package com.keyflare.exchange.navigation.internal

import com.keyflare.exchange.navigation.core.api.*
import com.keyflare.exchange.redux.api.Action

internal data class NavigationPushAction<P : NavigationParams>(
    val backstackId: BackstackId,
    val destination: NavigationEntryId<P, *>,
    val params: P,
) : Action

internal data class NavigationPopAction(
    val backstackId: BackstackId,
) : Action

internal data class NavigationPushForResultAction<P : NavigationParams, R : PushResult>(
    val request: PushForResultRequest<R>,
    val destination: NavigationEntryId<P, R>,
    val params: P,
) : Action

internal data class NavigationPopWithResultAction<R : PushResult>(
    val request: PushForResultRequest<R>,
    val result: R,
) : Action

internal data class NavigationProcessResultAction<R : PushResult>(
    val request: PushForResultRequest<R>,
) : Action

internal data class NavigationAcceptDestinationsAction(
    val destinations: NavigationDestinationsSet
) : Action
