package com.keyflare.exchange.designSystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.theme.ExchangeTheme

@Composable
fun DsAppBar(
    title: String,
    subtitle: String? = null,
    caption: String? = null,
    dividerVisible: Boolean = false,
    onBackClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(color = CustomTheme.colors.background)
        ) {
            Spacer(Modifier.size(8.dp))
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = CustomTheme.colors.textPrimary,
                )
            }
            Spacer(Modifier.size(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    color = CustomTheme.colors.textPrimary,
                    style = CustomTheme.type.heading1,
                )
                if (subtitle != null) {
                    Text(
                        text = subtitle,
                        color = CustomTheme.colors.textSecondary,
                        style = CustomTheme.type.body2,
                    )
                }
            }
            if (caption != null) {
                Text(
                    text = caption,
                    color = CustomTheme.colors.textPrimaryVariant,
                    style = CustomTheme.type.body2,
                    modifier = Modifier.padding(end = 12.dp, top = 4.dp),
                )
            }
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

@Preview
@Composable
private fun DsAppBarPreview() {
    Column {
        ExchangeTheme(darkTheme = false) {
            DsAppBar(
                title = "Converter",
                subtitle = "January 10, 2022",
                caption = "1 USD = 62.3 RUB",
                onBackClick = {},
            )
        }
        ExchangeTheme(darkTheme = true) {
            DsAppBar(
                title = "Converter",
                subtitle = "January 10, 2022",
                caption = "1 USD = 62.3 RUB",
                onBackClick = {},
            )
        }
    }
}
