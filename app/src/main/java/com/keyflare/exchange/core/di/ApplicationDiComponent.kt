package com.keyflare.exchange.core.di

import android.content.Context
import com.keyflare.exchange.common.utils.mapState
import com.keyflare.exchange.core.navigation.appDestinations
import com.keyflare.exchange.core.redux.ReduxDiComponent
import com.keyflare.exchange.navigation.api.NavigationApi
import com.keyflare.exchange.navigation.api.NavigationState
import com.keyflare.exchange.navigation.core.api.NavigationDestinationsSet
import com.keyflare.exchange.navigation.core.api.Navigator
import com.keyflare.exchange.redux.api.StateProvider
import kotlinx.coroutines.flow.StateFlow

class ApplicationDiComponent(
    val applicationContext: Context,
) : ReduxDiComponent() {

    private val navigationStateProvider: StateProvider<NavigationState> =
        object : StateProvider<NavigationState> {
            override val currentState: NavigationState = store.currentState.navigation
            override val states: StateFlow<NavigationState> =
                store.states.mapState { it.navigation }
        }

    val navigationDestinations: NavigationDestinationsSet = appDestinations

    val navigator: Navigator = NavigationApi.createNavigator(
        dispatcher = store,
        stateProvider = navigationStateProvider,
    )
}
