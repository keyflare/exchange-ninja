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
internal data class MainScreenRatesViewState(
    val icon1: ImageVector,
    val icon2: ImageVector,
    val icon3: ImageVector,
    val value1: String,
    val value2: String,
    val value3: String,
)

internal fun MainScreenState.toViewState() = MainScreenViewState(
    rates = MainScreenRatesViewState(
        icon1 = ratesState.currency1.getIcon(),
        icon2 = ratesState.currency2.getIcon(),
        icon3 = ratesState.currency3.getIcon(),
        value1 = ratesState.rate1.toPrettyString(),
        value2 = ratesState.rate2.toPrettyString(),
        value3 = ratesState.rate3.toPrettyString(),
    ),
)

private fun Float.toPrettyString(): String {
    return "%.${2}f".format(this)
}
