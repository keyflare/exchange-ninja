package com.keyflare.exchange.mainScreen.internal.domain

import com.keyflare.exchange.entities.Currency
import com.keyflare.exchange.mainScreen.api.mainScreenId
import com.keyflare.exchange.navigation.core.api.NavigationEntry
import com.keyflare.exchange.navigation.core.api.NavigationEntryId
import com.keyflare.exchange.navigation.core.api.NavigationParams
import com.keyflare.exchange.navigation.core.api.PushResult

internal data class MainScreenState(
    override val id: NavigationEntryId<NavigationParams.None, PushResult.None> = mainScreenId,
    val ratesState: MainScreenRatesState,
    val latestExchanges: Unit, // TODO Exchange history module (use as sub screen)
) : NavigationEntry<NavigationParams.None, PushResult.None>() {

    companion object {
        val initial: MainScreenState = MainScreenState(
            ratesState = MainScreenRatesState(
                baseCurrency = Currency.RUB,
                currency1 = Currency.USD,
                currency2 = Currency.EUR,
                currency3 = Currency.TRY,
                rate1 = 0f,
                rate2 = 0f,
                rate3 = 0f,
            ),
            latestExchanges = Unit,
        )
    }
}

internal data class MainScreenRatesState(
    val baseCurrency: Currency,
    val currency1: Currency,
    val currency2: Currency,
    val currency3: Currency,
    val rate1: Float,
    val rate2: Float,
    val rate3: Float,
)
