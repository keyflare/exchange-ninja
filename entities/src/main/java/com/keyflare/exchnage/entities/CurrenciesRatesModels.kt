package com.keyflare.exchnage.entities

data class CurrencyRatesData(
    val currency: Currency,
    val rateToDollar: Float,
)

data class CurrenciesPairData(
    val from: Currency,
    val to: Currency,
    val rate: Float,
)
