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

public val CryptoIcons.Dash: ImageVector
    get() {
        if (_dash != null) {
            return _dash!!
        }
        _dash = Builder(name = "Dash", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF4886CE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8363f, 24.8369f, 32.0f, 15.9998f, 32.0f)
                curveTo(7.1636f, 32.0f, 0.0f, 24.8363f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1628f, 7.1636f, 0.0f, 15.9998f, 0.0f)
                curveTo(24.8369f, 0.0f, 32.0f, 7.1628f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3931f, 8.0713f)
                curveTo(18.5161f, 8.0713f, 11.8203f, 8.0713f, 11.8203f, 8.0713f)
                lineTo(11.2333f, 11.4037f)
                curveTo(11.2333f, 11.4037f, 17.5754f, 11.4037f, 18.177f, 11.4037f)
                curveTo(18.7781f, 11.4037f, 21.7624f, 11.538f, 21.6294f, 13.9749f)
                curveTo(21.4982f, 16.3465f, 21.2658f, 17.1564f, 21.1513f, 17.4529f)
                curveTo(21.0356f, 17.7489f, 20.3105f, 20.5516f, 16.6179f, 20.5516f)
                curveTo(14.1866f, 20.5516f, 11.3073f, 20.5516f, 9.6226f, 20.5516f)
                lineTo(9.0356f, 23.8841f)
                curveTo(9.8266f, 23.8841f, 13.6668f, 23.8841f, 16.7414f, 23.8841f)
                curveTo(23.1244f, 23.8841f, 24.5819f, 19.2637f, 24.7846f, 18.5278f)
                curveTo(24.9872f, 17.7911f, 25.6052f, 16.6662f, 25.6052f, 12.9116f)
                curveTo(25.6052f, 8.2903f, 20.2709f, 8.0713f, 19.3931f, 8.0713f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6311f, 16.2852f)
                lineTo(16.1191f, 14.353f)
                horizontalLineTo(8.4228f)
                curveTo(7.6013f, 14.353f, 6.884f, 14.9116f, 6.6826f, 15.7081f)
                lineTo(6.1946f, 17.6403f)
                horizontalLineTo(13.8905f)
                curveTo(14.7119f, 17.6403f, 15.4293f, 17.083f, 15.6311f, 16.2852f)
                close()
            }
        }
        .build()
        return _dash!!
    }

private var _dash: ImageVector? = null
