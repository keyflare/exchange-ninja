package com.keyflare.exchange.core.redux

import com.keyflare.exchange.navigation.api.NavigationApi
import com.keyflare.exchange.navigation.api.NavigationState
import com.keyflare.exchange.redux.api.Reducer
import com.keyflare.exchange.redux.api.State
import com.keyflare.exchange.redux.api.Store

typealias ApplicationStore = Store<ApplicationState>

data class ApplicationState(
    val navigation: NavigationState,
) : State {

    companion object {
        val initial = ApplicationState(
            navigation = NavigationState.initial,
        )
    }
}

val applicationReducer = Reducer<ApplicationState> { state, action ->
    state.copy(
        navigation = NavigationApi.navigationReducer.reduce(state.navigation, action),
    )
}
