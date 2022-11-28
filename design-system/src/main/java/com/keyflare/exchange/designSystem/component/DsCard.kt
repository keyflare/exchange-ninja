package com.keyflare.exchange.designSystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.common.trueShadow
import com.keyflare.exchange.designSystem.theme.ExchangeTheme

@Composable
fun DsCard(
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 20.dp,
    onClick: (() -> Unit)? = null,
    content: @Composable BoxScope.() -> Unit,
) {
    val shape = RoundedCornerShape(size = cornerRadius)

    Box(
        modifier = modifier
            .trueShadow(
                shape = shape,
                offset = DpOffset(x = 0.dp, y = 4.dp),
                radius = 40.dp,
                color = Color(0, 0, 0, 18)
            )
            .clip(shape = shape)
            .background(color = CustomTheme.colors.surface)
            .clickable(
                enabled = onClick != null,
                onClick = { onClick?.invoke() }
            ),
        content = content,
    )
}

@Preview
@Composable
private fun DsCardPreview() {
    @Composable
    fun Panels() {
        Column(
            Modifier
                .background(color = CustomTheme.colors.background)
                .padding(16.dp)
        ) {
            DsCard(
                cornerRadius = 16.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
            ) {}
            Spacer(modifier = Modifier.height(16.dp))
            DsCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {}
            Spacer(modifier = Modifier.height(16.dp))
            DsCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {}
        }
    }

    Column {
        ExchangeTheme(darkTheme = false) {
            Panels()
        }
        ExchangeTheme(darkTheme = true) {
            Panels()
        }
    }
}
