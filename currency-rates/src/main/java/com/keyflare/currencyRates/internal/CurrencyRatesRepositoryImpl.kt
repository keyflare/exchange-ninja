package com.keyflare.currencyRates.internal

import com.keyflare.currencyRates.api.CurrencyRatesRepository
import com.keyflare.currencyRates.internal.sources.fawazahmed0.Fawazahmed0Source
import com.keyflare.currencyRates.internal.sources.fawazahmed0.toModel
import com.keyflare.exchange.entities.CurrenciesPairData
import com.keyflare.exchange.entities.Currency
import com.keyflare.exchange.entities.CurrencyRatesData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class CurrencyRatesRepositoryImpl(
    private val ratesNetworkSource: Fawazahmed0Source,
) : CurrencyRatesRepository {

    private var allRates: List<CurrencyRatesData>? = null

    override fun getAllRates(): Flow<List<CurrencyRatesData>> {
        return flow {
            if (allRates == null) {
                allRates = ratesNetworkSource.getAllRates().toModel()
            }
            emit(requireNotNull(allRates))
        }
    }

    override fun getCurrenciesPair(from: Currency, to: Currency): Flow<CurrenciesPairData> = flow {
        val rates = allRates ?: return@flow
        val fromRate = rates.first { it.currency == from }.rateToDollar
        val toRate = rates.first { it.currency == to }.rateToDollar
        val rate = toRate / fromRate

        emit(CurrenciesPairData(from, to, rate))
    }
}
