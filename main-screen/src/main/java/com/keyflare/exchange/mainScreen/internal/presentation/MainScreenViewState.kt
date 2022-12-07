package com.keyflare.exchange.mainScreen.internal.presentation

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.vector.ImageVector
import com.keyflare.exchange.designSystem.icons.getIcon
import com.keyflare.exchange.mainScreen.internal.domain.MainScreenState

@Immutable
internal data class MainScreenViewState(
    val rates: MainScreenRatesViewState,
)

@Immutable
internal sealed interface MainScreenRatesViewState {

    @Immutable
    data class Bar(
        val items: List<RateItem>,
    ) : MainScreenRatesViewState {

        @Immutable
        data class RateItem(
            val icon: ImageVector,
            val rate: String,
        )
    }

    @Immutable
    data class Settings(
        val currencies: List<CurrencyItem>,
        val baseCurrency: CurrencyItem,
    ) : MainScreenRatesViewState {

        @Immutable
        data class CurrencyItem(
            val ticker: String,
            val icon: ImageVector,
        )
    }
}

internal fun MainScreenState.toViewState() = MainScreenViewState(
    rates = if (ratesState.settingsMode) {
        MainScreenRatesViewState.Settings(
            currencies = ratesState.rates.map { rate ->
                MainScreenRatesViewState.Settings.CurrencyItem(
                    ticker = rate.currency.ticker,
                    icon = rate.currency.getIcon(),
                )
            },
            baseCurrency = MainScreenRatesViewState.Settings.CurrencyItem(
                ticker = ratesState.baseCurrency.ticker,
                icon = ratesState.baseCurrency.getIcon(),
            )
        )
    } else {
        MainScreenRatesViewState.Bar(
            items = ratesState.rates.map { rate ->
                MainScreenRatesViewState.Bar.RateItem(
                    icon = rate.currency.getIcon(),
                    rate = rate.rate.toPrettyString(),
                )
            }
        )
    },
)

private fun Float.toPrettyString(): String {
    return "%.${2}f".format(this)
}
