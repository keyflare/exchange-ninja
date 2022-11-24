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

public val CryptoIcons.Luna: ImageVector
    get() {
        if (_luna != null) {
            return _luna!!
        }
        _luna = Builder(name = "Luna", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF172852)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8357f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1643f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1643f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8357f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF6F03)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.0662f, 14.1225f)
                curveTo(24.6096f, 13.8144f, 21.9873f, 12.8413f, 20.5974f, 12.3425f)
                curveTo(20.6972f, 12.8413f, 21.0585f, 14.0472f, 22.2954f, 14.9715f)
                curveTo(23.6564f, 15.9845f, 24.8446f, 16.9976f, 25.1704f, 17.2769f)
                curveTo(25.2281f, 16.8601f, 25.2569f, 16.4345f, 25.2569f, 16.0001f)
                curveTo(25.2569f, 15.3572f, 25.1926f, 14.7299f, 25.0662f, 14.1225f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD83D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0001f, 6.7432f)
                curveTo(14.9893f, 6.7432f, 13.7657f, 6.8541f, 12.8591f, 7.3373f)
                curveTo(12.398f, 7.5834f, 11.4914f, 8.1597f, 11.9879f, 8.7693f)
                curveTo(12.0522f, 8.8513f, 12.1364f, 8.9178f, 12.2229f, 8.9776f)
                curveTo(13.4487f, 9.8311f, 17.124f, 11.2608f, 19.7441f, 12.0433f)
                curveTo(19.815f, 12.0655f, 20.1386f, 12.1785f, 20.5975f, 12.3425f)
                curveTo(21.9873f, 12.8413f, 24.6097f, 13.8144f, 25.0663f, 14.1226f)
                curveTo(24.1996f, 9.9109f, 20.4689f, 6.7432f, 16.0001f, 6.7432f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD83D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5098f, 18.2034f)
                curveTo(11.0258f, 15.5921f, 10.1369f, 10.3519f, 9.995f, 8.9554f)
                curveTo(8.0044f, 10.6534f, 6.7432f, 13.1804f, 6.7432f, 16.0f)
                curveTo(6.7432f, 21.1117f, 10.8883f, 25.2568f, 16.0f, 25.2568f)
                curveTo(20.1829f, 25.2568f, 23.7185f, 22.4816f, 24.8667f, 18.6711f)
                curveTo(22.8983f, 19.3139f, 19.8171f, 19.7772f, 16.5098f, 18.2034f)
                close()
            }
        }
        .build()
        return _luna!!
    }

private var _luna: ImageVector? = null
