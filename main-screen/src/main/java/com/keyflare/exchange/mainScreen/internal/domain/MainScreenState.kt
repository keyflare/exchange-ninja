package com.keyflare.exchange.mainScreen.internal.domain

import com.keyflare.exchange.entities.Currency
import com.keyflare.exchange.mainScreen.api.mainScreenId
import com.keyflare.exchange.navigation.api.NavigationEntry
import com.keyflare.exchange.navigation.api.NavigationEntryId
import com.keyflare.exchange.navigation.api.NavigationParams

internal data class MainScreenState(
    override val id: NavigationEntryId<NavigationParams.None> = mainScreenId,
    override val params: NavigationParams.None,
    val ratesState: MainScreenRatesState,
    val latestExchanges: Unit, // TODO Exchange history module (use as sub screen)
) : NavigationEntry<NavigationParams.None>

internal data class MainScreenRatesState(
    val baseCurrency: Currency,
    val currency1: Currency,
    val currency2: Currency,
    val currency3: Currency,
    val rate1: Float,
    val rate2: Float,
    val rate3: Float,
)
