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

public val CryptoIcons.Lrc: ImageVector
    get() {
        if (_lrc != null) {
            return _lrc!!
        }
        _lrc = Builder(name = "Lrc", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF4F4F4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8379f, 24.8365f, 32.0f, 15.9999f, 32.0f)
                curveTo(7.1635f, 32.0f, 0.0f, 24.8379f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1635f, 0.0f, 15.9999f, 0.0f)
                curveTo(24.8365f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C60FE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.4398f, 15.4256f)
                curveTo(24.253f, 15.4256f, 21.0657f, 15.4256f, 17.8679f, 15.4256f)
                curveTo(18.5539f, 16.5184f, 19.2353f, 17.6024f, 19.9179f, 18.6886f)
                lineTo(12.5977f, 24.5317f)
                curveTo(12.613f, 24.5251f, 27.4579f, 15.4766f, 27.4398f, 15.4256f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C60FE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.637f, 18.693f)
                curveTo(4.6445f, 18.6975f, 12.2407f, 24.7091f, 12.2407f, 24.687f)
                curveTo(12.2407f, 18.6908f, 12.238f, 6.6299f, 12.2396f, 6.6299f)
                lineTo(4.637f, 18.693f)
                close()
            }
        }
        .build()
        return _lrc!!
    }

private var _lrc: ImageVector? = null
