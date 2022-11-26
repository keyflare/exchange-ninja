package com.keyflare.exchange.currencyChooser.internal.domain

import com.keyflare.exchange.entities.Currency

internal data class CurrencyChooserScreenState(
    val searchRequest: String,
    val allCurrencies: List<Currency>,
    val relevantCurrencies: List<Currency>,
)
