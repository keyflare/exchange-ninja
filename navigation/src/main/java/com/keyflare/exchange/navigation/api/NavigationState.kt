package com.keyflare.exchange.navigation.api

import com.keyflare.exchange.navigation.core.api.Backstack
import com.keyflare.exchange.navigation.core.api.BackstackId
import com.keyflare.exchange.navigation.core.api.PushForResultRequest
import com.keyflare.exchange.navigation.core.api.PushResult
import com.keyflare.exchange.redux.api.State

data class NavigationState(
    val root: Backstack,
    val pushForResultMap: Map<PushForResultRequest<*>, PushResult>,
    val entryFactories: Map<Int, (Any) -> Any>,
) : State {

    companion object {
        val rootId: BackstackId = BackstackId.obtain()

        val initial = NavigationState(
            root = Backstack(id = rootId),
            pushForResultMap = emptyMap(),
            entryFactories = emptyMap(),
        )
    }
}