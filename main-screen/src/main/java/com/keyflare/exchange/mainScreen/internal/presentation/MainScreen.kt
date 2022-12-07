@file:OptIn(ExperimentalComposeUiApi::class)

package com.keyflare.exchange.mainScreen.internal.presentation

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.keyflare.exchange.designSystem.common.BackPressedCallback
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.common.addIf
import com.keyflare.exchange.designSystem.component.DsCard
import com.keyflare.exchange.designSystem.component.DsLookaheadLayout
import com.keyflare.exchange.designSystem.component.rememberLookaheadContent
import com.keyflare.exchange.designSystem.icons.getIcon
import com.keyflare.exchange.designSystem.theme.ExchangeTheme
import com.keyflare.exchange.entities.Currency
import com.keyflare.exchange.mainScreen.R
import com.keyflare.exchange.mainScreen.internal.domain.MainScreenState

private const val ratesBarAnimationDuration = 400

@Composable
internal fun MainScreen(state: MainScreenState) {

    MainScreenUi(
        state = state.toViewState(),
        onRatesClick = {},
        onApplyRatesSettingsClick = {},
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
    onApplyRatesSettingsClick: () -> Unit,
    onConverterClick: () -> Unit,
    onExchangeClick: () -> Unit,
    onHistoryClick: () -> Unit,
) {
    val scrollState = rememberScrollState()

    val ratesBar = rememberLookaheadContent {
        Rates(state = state.rates, onClick = onRatesClick)
    }

    val ratesSettingsMode by rememberUpdatedState(
        newValue = state.rates is MainScreenRatesViewState.Settings
    )

    val tintColor by animateColorAsState(
        targetValue = if (ratesSettingsMode) CustomTheme.colors.tint else Color.Transparent,
        animationSpec = tween(durationMillis = ratesBarAnimationDuration),
    )

    BackPressedCallback(enabled = ratesSettingsMode) {
        onApplyRatesSettingsClick()
    }

    DsLookaheadLayout {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = CustomTheme.colors.background)
                .padding(horizontal = 16.dp)
                .verticalScroll(scrollState)
        ) {
            Spacer(
                modifier = Modifier
                    .statusBarsPadding()
                    .size(8.dp)
            )
            Row(modifier = Modifier.zIndex(1f)) {
                Box(
                    modifier = Modifier
                        .zIndex(1f)
                        .weight(1f)
                        .height(40.dp)
                        .drawBehind {
                            drawRect(
                                color = tintColor,
                                size = Size(10_000f, 10_000f),
                                topLeft = Offset(-1000f, -1000f)
                            )
                        }
                ) {
                    if (!ratesSettingsMode) {
                        ratesBar()
                    }
                }
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
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .addIf(ratesSettingsMode) {
                    clickable(
                        interactionSource = MutableInteractionSource(),
                        indication = null,
                        enabled = ratesSettingsMode,
                        onClick = onApplyRatesSettingsClick,
                    )
                }
        ) {
            if (ratesSettingsMode) {
                Box(modifier = Modifier.size(310.dp, 244.dp)) {
                    ratesBar()
                }
            }
        }
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
    var ratesSettingsMode by remember { mutableStateOf(false) }

    val state = MainScreenViewState(
        rates = if (ratesSettingsMode) {
            MainScreenRatesViewState.Settings(
                baseCurrency = MainScreenRatesViewState.Settings.CurrencyItem(
                    ticker = Currency.RUB.ticker,
                    icon = Currency.RUB.getIcon(),
                ),
                currencies = listOf(
                    MainScreenRatesViewState.Settings.CurrencyItem(
                        ticker = Currency.USD.ticker,
                        icon = Currency.USD.getIcon(),
                    ),
                    MainScreenRatesViewState.Settings.CurrencyItem(
                        ticker = Currency.TRY.ticker,
                        icon = Currency.TRY.getIcon(),
                    ),
                    MainScreenRatesViewState.Settings.CurrencyItem(
                        ticker = Currency.UZS.ticker,
                        icon = Currency.UZS.getIcon(),
                    ),
                ),
            )
        } else {
            MainScreenRatesViewState.Bar(
                items = listOf(
                    MainScreenRatesViewState.Bar.RateItem(
                        icon = Currency.RUB.getIcon(),
                        rate = "64.69",
                    ),
                    MainScreenRatesViewState.Bar.RateItem(
                        icon = Currency.TRY.getIcon(),
                        rate = "18.53",
                    ),
                    MainScreenRatesViewState.Bar.RateItem(
                        icon = Currency.UZS.getIcon(),
                        rate = "11 213",
                    )
                )
            )
        }
    )

    ExchangeTheme {
        MainScreenUi(
            state,
            onRatesClick = { ratesSettingsMode = true },
            onSettingsClick = {},
            onConverterClick = {},
            onExchangeClick = {},
            onHistoryClick = {},
            onApplyRatesSettingsClick = { ratesSettingsMode = false }
        )
    }
}
