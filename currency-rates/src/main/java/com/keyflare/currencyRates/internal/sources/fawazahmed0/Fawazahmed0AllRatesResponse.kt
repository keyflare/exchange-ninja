package com.keyflare.currencyRates.internal.sources.fawazahmed0

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
internal data class Fawazahmed0AllRatesResponse(
    @SerialName("date")
    val date: String,
    @SerialName("usd")
    val ratesToDollar: JsonElement
)
