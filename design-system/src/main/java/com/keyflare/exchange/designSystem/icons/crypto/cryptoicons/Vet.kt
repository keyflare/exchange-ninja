package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val CryptoIcons.Vet: ImageVector
    get() {
        if (_vet != null) {
            return _vet!!
        }
        _vet = Builder(name = "Vet", defaultWidth = 34.0.dp, defaultHeight = 34.0.dp, viewportWidth
                = 34.0f, viewportHeight = 34.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF9B66BA), 1.0f to Color(0xFF5FB9EB), start =
                    Offset(9.18696f,3.5088f), end = Offset(24.7804f,30.4336f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.7576f, 19.7783f)
                curveTo(34.292f, 11.076f, 28.4813f, 2.7775f, 19.779f, 1.243f)
                curveTo(11.0767f, -0.2914f, 2.7782f, 5.5193f, 1.2437f, 14.2216f)
                curveTo(-0.2907f, 22.9239f, 5.5199f, 31.2224f, 14.2223f, 32.7569f)
                curveTo(22.9246f, 34.2913f, 31.2231f, 28.4806f, 32.7576f, 19.7783f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0657f, 9.8713f)
                horizontalLineTo(25.7374f)
                curveTo(25.5678f, 9.8713f, 25.4125f, 9.9682f, 25.3372f, 10.1205f)
                lineTo(19.4846f, 21.9991f)
                curveTo(19.4846f, 22.0004f, 19.1201f, 22.6898f, 18.2699f, 22.6898f)
                curveTo(17.4191f, 22.6898f, 17.0005f, 21.9285f, 16.9996f, 21.9277f)
                lineTo(11.1767f, 10.1093f)
                curveTo(11.1049f, 9.9639f, 10.9573f, 9.8713f, 10.7942f, 9.8713f)
                horizontalLineTo(8.0699f)
                curveTo(7.7597f, 9.8713f, 7.557f, 10.1984f, 7.6934f, 10.4772f)
                lineTo(15.6984f, 26.7227f)
                curveTo(15.9312f, 27.1965f, 16.4135f, 27.496f, 16.9411f, 27.496f)
                horizontalLineTo(17.0203f)
                curveTo(17.5207f, 27.496f, 17.979f, 27.212f, 18.2001f, 26.7615f)
                lineTo(26.32f, 10.281f)
                curveTo(26.4138f, 10.093f, 26.2761f, 9.8713f, 26.0657f, 9.8713f)
                close()
            }
        }
        .build()
        return _vet!!
    }

private var _vet: ImageVector? = null
