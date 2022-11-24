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

public val CryptoIcons.Bnb: ImageVector
    get() {
        if (_bnb != null) {
            return _bnb!!
        }
        _bnb = Builder(name = "Bnb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF3BA2F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8371f, 24.8367f, 32.0f, 16.0001f, 32.0f)
                curveTo(7.1636f, 32.0f, 0.0f, 24.8371f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1629f, 7.1636f, 0.0f, 16.0001f, 0.0f)
                curveTo(24.8367f, 0.0f, 32.0f, 7.1629f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0061f, 10.5598f)
                lineTo(19.8699f, 14.4121f)
                lineTo(22.1126f, 12.1829f)
                lineTo(16.0061f, 6.0813f)
                lineTo(9.8997f, 12.1829f)
                lineTo(12.1424f, 14.4121f)
                lineTo(16.0061f, 10.5598f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0061f, 21.4399f)
                lineTo(12.1424f, 17.5876f)
                lineTo(9.8997f, 19.8169f)
                lineTo(16.0061f, 25.9185f)
                lineTo(22.1126f, 19.8169f)
                lineTo(19.8699f, 17.5876f)
                lineTo(16.0061f, 21.4399f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3267f, 13.7488f)
                lineTo(6.0764f, 16.0003f)
                lineTo(8.3267f, 18.2495f)
                lineTo(10.577f, 16.0003f)
                lineTo(8.3267f, 13.7488f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7559f, 16.0003f)
                lineTo(16.0061f, 18.2495f)
                lineTo(18.2562f, 16.0003f)
                lineTo(16.0061f, 13.7488f)
                lineTo(13.7559f, 16.0003f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.6736f, 13.7488f)
                lineTo(21.4236f, 16.0003f)
                lineTo(23.6736f, 18.2495f)
                lineTo(25.9239f, 16.0003f)
                lineTo(23.6736f, 13.7488f)
                close()
            }
        }
        .build()
        return _bnb!!
    }

private var _bnb: ImageVector? = null
