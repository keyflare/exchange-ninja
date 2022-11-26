package com.keyflare.exchange.currencyChooser.internal.presentation

import androidx.compose.runtime.Immutable
import com.keyflare.exchange.currencyChooser.internal.domain.CurrencyChooserScreenState
import com.keyflare.exchange.entities.Currency

@Immutable
data class CurrencyChooserScreenViewState(
    val searchRequest: String,
    val relevantCurrencies: List<Currency>,
)

internal fun CurrencyChooserScreenState.toViewState(): CurrencyChooserScreenViewState {
    return CurrencyChooserScreenViewState(
        searchRequest = searchRequest,
        relevantCurrencies = relevantCurrencies,
    )
}
