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

public val CryptoIcons.Neo: ImageVector
    get() {
        if (_neo != null) {
            return _neo!!
        }
        _neo = Builder(name = "Neo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF7F7F7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1625f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0011f)
                curveTo(0.0f, 24.8357f, 7.1625f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8374f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0011f)
                curveTo(32.0f, 7.1643f, 24.8374f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00E599)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0403f, 9.6074f)
                verticalLineTo(22.8336f)
                lineTo(15.626f, 25.9136f)
                verticalLineTo(12.5671f)
                lineTo(24.96f, 9.1107f)
                lineTo(16.5592f, 6.0865f)
                lineTo(7.0403f, 9.6074f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00AF92)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.96f, 9.7456f)
                verticalLineTo(23.2524f)
                lineTo(16.3408f, 20.2326f)
                verticalLineTo(12.9503f)
                lineTo(24.96f, 9.7456f)
                close()
            }
        }
        .build()
        return _neo!!
    }

private var _neo: ImageVector? = null
