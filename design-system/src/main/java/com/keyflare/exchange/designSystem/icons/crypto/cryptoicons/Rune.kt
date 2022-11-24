package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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

public val CryptoIcons.Rune: ImageVector
    get() {
        if (_rune != null) {
            return _rune!!
        }
        _rune = Builder(name = "Rune", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1642f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8379f, 7.1642f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8357f, 32.0f, 32.0f, 24.8379f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8357f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF02CEFB), 1.0f to Color(0xFF32FE9C), start =
                    Offset(7.14222f,16.9487f), end = Offset(21.0771f,10.5197f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.562f, 11.1653f)
                lineTo(17.022f, 15.6719f)
                lineTo(24.9422f, 5.9539f)
                lineTo(12.562f, 11.1653f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF02CEFB), 1.0f to Color(0xFF32FE9C), start =
                    Offset(9.6358f,22.353f), end = Offset(23.5706f,15.9241f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0218f, 15.6719f)
                lineTo(21.4596f, 20.1718f)
                lineTo(7.428f, 26.0903f)
                lineTo(17.0218f, 15.6719f)
                close()
            }
        }
        .build()
        return _rune!!
    }

private var _rune: ImageVector? = null
