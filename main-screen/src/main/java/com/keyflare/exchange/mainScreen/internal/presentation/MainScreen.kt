package com.keyflare.exchange.mainScreen.internal.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.component.DsCard
import com.keyflare.exchange.designSystem.icons.getIcon
import com.keyflare.exchange.designSystem.theme.ExchangeTheme
import com.keyflare.exchange.entities.Currency
import com.keyflare.exchange.mainScreen.R
import com.keyflare.exchange.mainScreen.internal.domain.MainScreenState

@Composable
internal fun MainScreen(state: MainScreenState) {

    MainScreenUi(
        state = state.toViewState(),
        onRatesClick = {},
        onSettingsClick = {},
        onConverterClick = {},
        onExchangeClick = {},
        onHistoryClick = {},
    )
}

@Composable
private fun MainScreenUi(
    state: MainScreenViewState,
    onRatesClick: () -> Unit,
    onSettingsClick: () -> Unit,
    onConverterClick: () -> Unit,
    onExchangeClick: () -> Unit,
    onHistoryClick: () -> Unit,
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomTheme.colors.background)
            .systemBarsPadding()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .verticalScroll(scrollState)
    ) {
        Spacer(modifier = Modifier.size(8.dp))
        Row {
            RatesPanel(
                state = state.rates,
                modifier = Modifier.weight(1f),
                onClick = onRatesClick,
            )
            IconButton(
                onClick = onSettingsClick,
                modifier = Modifier
                    .size(40.dp, 40.dp)
                    .offset(x = 8.dp),
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    tint = CustomTheme.colors.iconsAction,
                )
            }
        }
        Spacer(modifier = Modifier.size(16.dp))
        MainScreenCard(
            title = stringResource(id = R.string.title_converter),
            description = stringResource(id = R.string.description_converter),
            onClick = onConverterClick,
        )
        Spacer(modifier = Modifier.size(16.dp))
        MainScreenCard(
            title = stringResource(id = R.string.title_exchange),
            description = stringResource(id = R.string.description_exchange),
            onClick = onExchangeClick,
        )
        Spacer(modifier = Modifier.size(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = stringResource(id = R.string.header_latest_exchanges),
                style = CustomTheme.type.heading3,
                color = CustomTheme.colors.textPrimary,
            )
            TextButton(
                onClick = onHistoryClick,
                colors = ButtonDefaults.textButtonColors(
                    contentColor = CustomTheme.colors.textAction,
                ),
                shape = RoundedCornerShape(size = 12.dp),
                modifier = Modifier.offset(x = 8.dp),
            ) {
                Text(
                    text = stringResource(id = R.string.button_history),
                    style = CustomTheme.type.body2,
                    color = CustomTheme.colors.textAction,
                )
            }
        }
    }
}

@Composable
private fun RatesPanel(
    state: MainScreenRatesViewState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    DsCard(
        cornerRadius = 16.dp,
        modifier = modifier,
        onClick = onClick,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(horizontal = 16.dp),
        ) {
            RateItem(icon = state.icon1, value = state.value1)
            RateItem(icon = state.icon2, value = state.value2)
            RateItem(icon = state.icon3, value = state.value3)
        }
    }
}

@Composable
fun RateItem(icon: ImageVector, value: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .padding(end = 8.dp)
                .size(24.dp),
        )
        Text(
            text = value,
            style = CustomTheme.type.body2,
            color = CustomTheme.colors.textPrimaryVariant,
        )
    }
}

@Composable
private fun MainScreenCard(
    title: String,
    description: String,
    onClick: () -> Unit,
) {
    DsCard(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick,
    ) {
        Row(Modifier.padding(vertical = 12.dp, horizontal = 16.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = CustomTheme.type.heading2,
                    color = CustomTheme.colors.textPrimary,
                    modifier = Modifier.padding(bottom = 7.dp)
                )
                Text(
                    text = description,
                    style = CustomTheme.type.body2,
                    color = CustomTheme.colors.textSecondary,
                )
            }
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .background(
                        color = CustomTheme.colors.iconsAction,
                        shape = RoundedCornerShape(14.dp),
                    )
            )
        }
    }
}

@Preview
@Composable
private fun MainScreenUiPreview() {
    val state = MainScreenViewState(
        rates = MainScreenRatesViewState(
            icon1 = Currency.RUB.getIcon(),
            icon2 = Currency.TRY.getIcon(),
            icon3 = Currency.UZS.getIcon(),
            value1 = "13.53",
            value2 = "64.69",
            value3 = "11 213"
        )
    )
    ExchangeTheme {
        MainScreenUi(
            state,
            onRatesClick = {},
            onSettingsClick = {},
            onConverterClick = {},
            onExchangeClick = {},
            onHistoryClick = {},
        )
    }
}
