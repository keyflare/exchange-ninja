package com.keyflare.currencyRates.api

import com.keyflare.currencyRates.internal.di.CurrencyRatesDiComponent
import com.keyflare.exchange.entities.CurrenciesPairData
import com.keyflare.exchange.entities.Currency
import com.keyflare.exchange.entities.CurrencyRatesData
import kotlinx.coroutines.flow.Flow

interface CurrencyRatesRepository {
    fun getAllRates(): Flow<List<CurrencyRatesData>>
    fun getCurrenciesPair(from: Currency, to: Currency): Flow<CurrenciesPairData>

    companion object {
        operator fun invoke(): CurrencyRatesRepository {
            return CurrencyRatesDiComponent().ratesRepository
        }
    }
}
