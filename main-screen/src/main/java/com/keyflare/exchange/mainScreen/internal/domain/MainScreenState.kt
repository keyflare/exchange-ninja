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
                rates = listOf(
                    MainScreenRatesState.CurrencyRateState(
                        currency = Currency.USD,
                        rate = 0f,
                    ),
                    MainScreenRatesState.CurrencyRateState(
                        currency = Currency.EUR,
                        rate = 0f,
                    ),
                    MainScreenRatesState.CurrencyRateState(
                        currency = Currency.TRY,
                        rate = 0f,
                    )
                ),
                settingsMode = true,
            ),
            latestExchanges = Unit,
        )
    }
}

internal data class MainScreenRatesState(
    val baseCurrency: Currency,
    val rates: List<CurrencyRateState>,
    val settingsMode: Boolean,
) {
    data class CurrencyRateState(
        val currency: Currency,
        val rate: Float,
    )
}
