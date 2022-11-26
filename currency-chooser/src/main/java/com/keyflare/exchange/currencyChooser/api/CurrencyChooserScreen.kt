package com.keyflare.exchange.currencyChooser.api

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.currencyChooser.R
import com.keyflare.exchange.currencyChooser.internal.presentation.CurrencyChooserScreenViewState
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.component.*
import com.keyflare.exchange.designSystem.theme.ExchangeTheme
import com.keyflare.exchange.entities.Currency

@Composable
fun CurrencyChooserScreen(state: CurrencyChooserScreenViewState) {
    // TODO redux and so on

    CurrencyChooserScreenUi(
        state = state,
        onSearchRequestChanged = {},
        onCurrencyChosen = {},
        onBackClick = {},
    )
}

@Composable
private fun CurrencyChooserScreenUi(
    state: CurrencyChooserScreenViewState,
    onSearchRequestChanged: (String) -> Unit,
    onCurrencyChosen: (Currency) -> Unit,
    onBackClick: () -> Unit,
) {
    var appBarDividerVisible by remember { mutableStateOf(false) }
    var searchBarDividerVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomTheme.colors.background)
    ) {
        DsAppBar(
            onBackClick = onBackClick,
            title = stringResource(R.string.currency_screen_title),
            dividerVisible = appBarDividerVisible,
        )
        DsCollapsingToolbarScaffold(
            toolbar = { collapsingToolbarState ->
                SearchBar(
                    value = state.searchRequest,
                    collapseProgress = collapsingToolbarState.progress,
                    onValueChanges = onSearchRequestChanged,
                    dividerVisible = searchBarDividerVisible,
                    modifier = Modifier
                        .parallax(1f)
                        .progress(listener = { appBarDividerVisible = it == 0f })
                )
            }
        ) {
            val lazyColumnState = rememberLazyListState()
            val scrolledToTop by remember {
                derivedStateOf {
                    lazyColumnState.firstVisibleItemScrollOffset == 0 &&
                            lazyColumnState.firstVisibleItemIndex == 0
                }
            }

            LaunchedEffect(scrolledToTop) {
                searchBarDividerVisible = !scrolledToTop
            }

            LazyColumn(
                state = lazyColumnState,
                modifier = Modifier.fillMaxSize()
            ) {
                state.relevantCurrencies.forEach { currency ->
                    item(key = currency.ticker) {
                        CurrencyItem(
                            state = currency,
                            onClick = { onCurrencyChosen(currency) },
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SearchBar(
    value: String,
    collapseProgress: Float,
    dividerVisible: Boolean,
    onValueChanges: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    val barHeight = 60

    val dynamicBarHeight by rememberUpdatedState(
        newValue = (barHeight * collapseProgress).dp
    )
    val dynamicTextAlpha by rememberUpdatedState(
        newValue = (collapseProgress - 0.8f).coerceIn(0f..1f) / (1 - 0.8f)
    )

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = modifier
            .fillMaxWidth()
            .height(barHeight.dp)
            .background(color = CustomTheme.colors.background)
    ) {
        Box(
            modifier = Modifier
                .height(dynamicBarHeight)
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 8.dp,
                    bottom = 16.dp,
                )
        ) {
            DsTextField(
                value = value,
                onValueChange = onValueChanges,
                placeholder = stringResource(id = R.string.currency_search_placeholder),
                shape = RoundedCornerShape(size = 12.dp),
                contentAlpha = dynamicTextAlpha,
                modifier = Modifier.fillMaxSize(),
            )
        }
        if (dividerVisible) {
            Divider(
                color = CustomTheme.colors.divider,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
private fun CurrencyItem(
    state: Currency,
    onClick: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(48.dp)
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp)
    ) {
        DsCurrencyIcon(state, modifier = Modifier.size(32.dp))
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            text = state.displayName,
            style = CustomTheme.type.body1,
            color = CustomTheme.colors.textPrimaryVariant,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f),
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = state.ticker,
            style = CustomTheme.type.heading4,
            color = CustomTheme.colors.textAdditional,
        )
    }
}

@Preview
@Composable
private fun CurrencyChooserScreenUiPreview() {
    var state by remember {
        mutableStateOf(
            CurrencyChooserScreenViewState(
                searchRequest = "",
                relevantCurrencies = Currency.all.toList(),
            )
        )
    }

    ExchangeTheme {
        CurrencyChooserScreenUi(
            state = state,
            onSearchRequestChanged = {
                state = state.copy(searchRequest = it)
            },
            onCurrencyChosen = {},
            onBackClick = {},
        )
    }
}
