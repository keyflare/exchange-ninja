package com.keyflare.exchange.navigation.api

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.keyflare.exchange.common.extensions.cast
import com.keyflare.exchange.navigation.core.api.*
import com.keyflare.exchange.navigation.internal.ReduxNavigator
import com.keyflare.exchange.navigation.internal.navigationReducerInternal
import com.keyflare.exchange.navigation.internal.presentation.LocalNavigationDestinations
import com.keyflare.exchange.navigation.internal.presentation.composablesMap
import com.keyflare.exchange.redux.api.Dispatcher
import com.keyflare.exchange.redux.api.StateProvider

object NavigationApi {

    val navigationReducer = navigationReducerInternal

    fun createNavigator(
        stateProvider: StateProvider<NavigationState>,
        dispatcher: Dispatcher,
    ): Navigator = ReduxNavigator(stateProvider, dispatcher)

    @Composable
    fun InitNavigationWith(
        navigator: Navigator,
        destinations: NavigationDestinationsSet,
        content: @Composable () -> Unit,
    ) {
        navigator.cast<ReduxNavigator>().acceptDestinations(destinations)

        CompositionLocalProvider(
            LocalNavigationDestinations provides destinations.composablesMap(),
            content = content,
        )
    }
}
