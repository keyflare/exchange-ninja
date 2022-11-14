package com.keyflare.currencyRates.internal.sources.fawazahmed0

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*

/*
 *  Currency rates API by https://github.com/fawazahmed0/currency-api
 */

internal class Fawazahmed0Source {

    private val client = HttpClient(Android) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(
                kotlinx.serialization.json.Json {
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            )
        }
    }

    suspend fun getAllRates(): Fawazahmed0AllRatesResponse = client.get { url(baseUrl) }

    private companion object {
        const val baseUrl = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/usd.min.json"
    }
}
