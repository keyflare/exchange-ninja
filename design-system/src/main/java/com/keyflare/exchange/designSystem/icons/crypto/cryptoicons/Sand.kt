package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons

public val CryptoIcons.Sand: ImageVector
    get() {
        if (_sand != null) {
            return _sand!!
        }
        _sand = Builder(name = "Sand", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF00ADEF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8365f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1633f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1633f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8365f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.3644f, 11.9344f)
                verticalLineTo(7.685f)
                lineTo(22.29f, 5.6102f)
                horizontalLineTo(9.6764f)
                lineTo(7.6355f, 7.685f)
                verticalLineTo(15.9777f)
                lineTo(9.7768f, 18.0569f)
                horizontalLineTo(18.0744f)
                verticalLineTo(22.1733f)
                horizontalLineTo(13.9591f)
                verticalLineTo(20.1982f)
                horizontalLineTo(7.6355f)
                verticalLineTo(24.2814f)
                lineTo(9.7434f, 26.3872f)
                horizontalLineTo(22.1898f)
                lineTo(24.3644f, 24.2127f)
                verticalLineTo(15.9777f)
                lineTo(22.2257f, 13.8386f)
                horizontalLineTo(14.0261f)
                verticalLineTo(9.7931f)
                horizontalLineTo(18.1414f)
                verticalLineTo(11.9344f)
                horizontalLineTo(24.3644f)
                close()
            }
        }
        .build()
        return _sand!!
    }

private var _sand: ImageVector? = null
