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

public val CryptoIcons.Usdt: ImageVector
    get() {
        if (_usdt != null) {
            return _usdt!!
        }
        _usdt = Builder(name = "Usdt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF50AF95)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8371f, 24.8364f, 32.0f, 15.9999f, 32.0f)
                curveTo(7.1633f, 32.0f, 0.0f, 24.8371f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1629f, 7.1633f, 0.0f, 15.9999f, 0.0f)
                curveTo(24.8364f, 0.0f, 32.0f, 7.1629f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0715f, 16.675f)
                curveTo(17.4047f, 16.7061f, 16.7115f, 16.7216f, 15.9999f, 16.7216f)
                curveTo(15.2883f, 16.7216f, 14.5952f, 16.7061f, 13.9284f, 16.675f)
                curveTo(9.7021f, 16.4907f, 6.5433f, 15.7513f, 6.5433f, 14.8676f)
                curveTo(6.5433f, 13.9839f, 9.7021f, 13.2445f, 13.9284f, 13.0603f)
                verticalLineTo(15.9778f)
                curveTo(14.5952f, 16.0f, 15.2883f, 16.0133f, 15.9999f, 16.0133f)
                curveTo(16.7115f, 16.0133f, 17.4047f, 16.0f, 18.0715f, 15.9778f)
                verticalLineTo(13.0603f)
                curveTo(22.298f, 13.2445f, 25.4568f, 13.9839f, 25.4568f, 14.8676f)
                curveTo(25.4568f, 15.7513f, 22.298f, 16.4907f, 18.0715f, 16.675f)
                close()
                moveTo(18.0715f, 12.7671f)
                verticalLineTo(10.3247f)
                horizontalLineTo(23.9064f)
                verticalLineTo(6.4058f)
                horizontalLineTo(8.0935f)
                verticalLineTo(10.3247f)
                horizontalLineTo(13.9284f)
                verticalLineTo(12.7671f)
                curveTo(9.1894f, 12.9847f, 5.6218f, 13.9329f, 5.6218f, 15.0697f)
                curveTo(5.6218f, 16.2043f, 9.1894f, 17.1524f, 13.9284f, 17.37f)
                verticalLineTo(25.5942f)
                horizontalLineTo(18.0715f)
                verticalLineTo(17.37f)
                curveTo(22.8107f, 17.1524f, 26.378f, 16.2043f, 26.378f, 15.0697f)
                curveTo(26.378f, 13.9329f, 22.8107f, 12.9847f, 18.0715f, 12.7671f)
                close()
            }
        }
        .build()
        return _usdt!!
    }

private var _usdt: ImageVector? = null
