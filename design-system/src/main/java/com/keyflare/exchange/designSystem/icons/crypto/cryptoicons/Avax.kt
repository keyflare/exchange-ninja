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

public val CryptoIcons.Avax: ImageVector
    get() {
        if (_avax != null) {
            return _avax!!
        }
        _avax = Builder(name = "Avax", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFE84143)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0011f)
                curveTo(32.0f, 24.8374f, 24.8379f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1643f, 32.0f, 0.0f, 24.8374f, 0.0f, 16.0011f)
                curveTo(0.0f, 7.1626f, 7.1643f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8379f, 0.0f, 32.0f, 7.1626f, 32.0f, 16.0011f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.2499f, 22.6782f)
                lineTo(23.5636f, 16.1784f)
                curveTo(23.1579f, 15.4624f, 22.1272f, 15.4624f, 21.7215f, 16.1784f)
                lineTo(18.0351f, 22.6782f)
                curveTo(17.6339f, 23.3831f, 18.1438f, 24.2588f, 18.9551f, 24.2588f)
                horizontalLineTo(26.33f)
                curveTo(27.1413f, 24.2588f, 27.6511f, 23.3831f, 27.2499f, 22.6782f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4092f, 8.9693f)
                lineTo(16.84f, 4.4381f)
                curveTo(16.4322f, 3.7198f, 15.397f, 3.7198f, 14.9891f, 4.4381f)
                lineTo(4.6882f, 22.6006f)
                curveTo(4.2693f, 23.341f, 4.8035f, 24.2588f, 5.6547f, 24.2588f)
                horizontalLineTo(10.5691f)
                curveTo(11.8747f, 24.2588f, 13.0783f, 23.5583f, 13.7234f, 22.421f)
                lineTo(19.4092f, 12.3965f)
                curveTo(20.0121f, 11.3347f, 20.0121f, 10.0333f, 19.4092f, 8.9693f)
                close()
            }
        }
        .build()
        return _avax!!
    }

private var _avax: ImageVector? = null
