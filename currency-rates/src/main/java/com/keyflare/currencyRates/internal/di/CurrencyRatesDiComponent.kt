package com.keyflare.currencyRates.internal.di

import com.keyflare.currencyRates.api.CurrencyRatesRepository
import com.keyflare.currencyRates.internal.CurrencyRatesRepositoryImpl
import com.keyflare.currencyRates.internal.sources.fawazahmed0.Fawazahmed0Source

internal class CurrencyRatesDiComponent {

    private val ratesNetworkSource: Fawazahmed0Source = Fawazahmed0Source()

    val ratesRepository: CurrencyRatesRepository = CurrencyRatesRepositoryImpl(
        ratesNetworkSource = ratesNetworkSource,
    )
}
