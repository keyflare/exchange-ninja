@file:OptIn(ExperimentalComposeUiApi::class)

package com.keyflare.exchange.mainScreen.internal.presentation

import androidx.compose.animation.*
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.LookaheadLayoutScope
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.component.DsCard
import com.keyflare.exchange.designSystem.component.sharedElement
import com.keyflare.exchange.mainScreen.R

@Composable
internal fun LookaheadLayoutScope.Rates(
    state: MainScreenRatesViewState,
    onClick: () -> Unit,
) {
    val cornerRadius by animateDpAsState(
        targetValue = when (state) {
            is MainScreenRatesViewState.Bar -> 16.dp
            is MainScreenRatesViewState.Settings -> 20.dp
        }
    )

    DsCard(
        cornerRadius = cornerRadius,
        modifier = Modifier
            .sharedElement(
                lookaheadScope = this,
                sizeAnimationSpec = tween(500),
                offsetAnimationSpec = tween(500),
            )
            .fillMaxSize()
            .clickable(
                interactionSource = MutableInteractionSource(),
                indication = null,
                onClick = onClick,
                enabled = state is MainScreenRatesViewState.Bar
            ),
    ) {
        Crossfade(
            targetState = state,
            animationSpec = tween(300)
        ) { targetState ->
            when (targetState) {
                is MainScreenRatesViewState.Bar -> RatesBar(state = targetState)
                is MainScreenRatesViewState.Settings -> RatesSettings(state = targetState)
            }
        }
    }
}

@Composable
private fun RatesBar(state: MainScreenRatesViewState.Bar) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomTheme.colors.surface)
            .padding(horizontal = 16.dp),
    ) {
        state.items.forEach {
            RateItem(icon = it.icon, value = it.rate)
        }
    }
}

@Composable
private fun RatesSettings(state: MainScreenRatesViewState.Settings) {
    Column(
        Modifier
            .requiredSize(310.dp, 244.dp)
            .background(color = CustomTheme.colors.surface)
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.title_rates_settings),
            color = CustomTheme.colors.textPrimary,
            style = CustomTheme.type.heading3,
        )
        Spacer(Modifier.size(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            state.currencies.forEach {
                RateSettingsCurrencyItem(it)
                Spacer(modifier = Modifier.size(8.dp))
            }
        }
        Spacer(Modifier.size(16.dp))
        Text(
            text = stringResource(id = R.string.title_base_currency),
            color = CustomTheme.colors.textPrimaryVariant,
            style = CustomTheme.type.body2,
        )
        Spacer(Modifier.size(12.dp))
        Row {
            RateSettingsCurrencyItem(state = state.baseCurrency)
        }
    }
}

@Composable
private fun RateItem(icon: ImageVector, value: String) {
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
private fun RateSettingsCurrencyItem(state: MainScreenRatesViewState.Settings.CurrencyItem) {
    Box(
        modifier = Modifier
            .size(77.dp, 64.dp)
            .background(
                color = CustomTheme.colors.surfaceSecondary,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(8.dp)
    ) {
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = state.ticker,
                style = CustomTheme.type.body2,
                color = CustomTheme.colors.textPrimaryVariant,
            )
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                imageVector = state.icon,
                contentDescription = null,
                modifier = Modifier.size(32.dp),
            )
        }
    }
}
