package com.keyflare.exchange.designSystem.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.keyflare.exchange.designSystem.icons.getIcon
import com.keyflare.exchange.entities.Currency

@Composable
fun DsCurrencyIcon(currency: Currency, modifier: Modifier = Modifier) {
    Image(
        imageVector = currency.getIcon(),
        contentDescription = null,
        modifier = modifier
    )
}

@Preview
@Composable
private fun DsCurrencyIconPreview() {
    DsCurrencyIcon(currency = Currency.USD)
}