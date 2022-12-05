package com.keyflare.exchange.mainScreen.api

import com.keyflare.exchange.mainScreen.internal.domain.MainScreenState
import com.keyflare.exchange.mainScreen.internal.presentation.MainScreen
import com.keyflare.exchange.navigation.core.api.*

val mainScreenId = NavigationEntryId.obtain<NavigationParams.None, PushResult.None>()

val mainScreenDestinations = NavigationDestinationsSet(
    listOf(
        destination(
            id = mainScreenId,
            entryFactory = { MainScreenState.initial },
            composable = { MainScreen(state = it) },
        )
    )
)
