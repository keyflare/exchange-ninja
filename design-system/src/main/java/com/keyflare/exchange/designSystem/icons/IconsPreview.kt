package com.keyflare.exchange.designSystem.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.icons.crypto.AllIcons
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons
import com.keyflare.exchange.designSystem.icons.flags.AllIcons
import com.keyflare.exchange.designSystem.icons.flags.FlagIcons
import com.keyflare.exchange.designSystem.theme.ExchangeTheme

private const val ICONS_IN_ROW = 5

@Preview
@Composable
private fun IconsPreview() {
    ExchangeTheme {
        Column(
            Modifier
                .background(color = CustomTheme.colors.background)
                .padding(20.dp)
                .verticalScroll(state = rememberScrollState())
        ) {
            val icons = remember {
                FlagIcons.AllIcons.unflatten(ICONS_IN_ROW) +
                        CryptoIcons.AllIcons.unflatten(ICONS_IN_ROW)
            }

            icons.forEach { iconsRow ->
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                ) {
                    iconsRow.forEach { icon ->
                        Image(
                            imageVector = icon,
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }
            }
        }
    }
}

private fun <T> List<T>.unflatten(n: Int): List<List<T>> {
    val newList = mutableListOf<List<T>>()
    val rowsCount = size / n + if (size % n > 0) 1 else 0
    repeat(rowsCount) { iteration ->
        val index = iteration * n
        val row = mutableListOf<T>()
        repeat(n) { i ->
            getOrNull(index + i)?.let { row.add(it) }
        }
        newList.add(row)
    }
    return newList
}
