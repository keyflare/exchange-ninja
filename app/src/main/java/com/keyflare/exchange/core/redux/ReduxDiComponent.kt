package com.keyflare.exchange.core.redux

import com.keyflare.exchange.redux.api.Middleware
import com.keyflare.exchange.redux.api.SideEffectsMiddleware

open class ReduxDiComponent {

    val sideEffectsMiddleware: SideEffectsMiddleware<ApplicationState> =
        SideEffectsMiddleware(
            globalEffects = listOf(
                // TODO globalEffects
            ),
        )

    private val middlewares = listOf<Middleware<ApplicationState>>(
        sideEffectsMiddleware,
    )

    val store: ApplicationStore = ApplicationStore(
        initialState = ApplicationState.initial,
        middlewares = middlewares,
        reducer = applicationReducer
    )
}
