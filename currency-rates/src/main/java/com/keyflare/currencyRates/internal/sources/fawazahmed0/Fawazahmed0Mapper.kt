package com.keyflare.currencyRates.internal.sources.fawazahmed0

import com.keyflare.exchnage.entities.Currency
import com.keyflare.exchnage.entities.CurrencyRatesData
import kotlinx.serialization.json.jsonObject

internal fun Fawazahmed0AllRatesResponse.toModel(): List<CurrencyRatesData> {
    return ratesToDollar
        .jsonObject
        .entries
        .map { it.key to it.value.toString() }
        .map {
        CurrencyRatesData(
            currency = fawazahmed0CurrencyMap[it.first] ?: Currency.UNKNOWN,
            rateToDollar = it.second.toFloat(),
        )
    }
}
