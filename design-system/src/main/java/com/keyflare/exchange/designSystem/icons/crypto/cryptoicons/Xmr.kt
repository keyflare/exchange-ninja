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

public val CryptoIcons.Xmr: ImageVector
    get() {
        if (_xmr != null) {
            return _xmr!!
        }
        _xmr = Builder(name = "Xmr", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF4C4C4C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8438f, 15.9208f)
                lineTo(16.0f, 22.7651f)
                lineTo(9.1563f, 15.9208f)
                verticalLineTo(24.3202f)
                horizontalLineTo(2.3325f)
                curveTo(5.1395f, 28.9254f, 10.2122f, 32.0f, 16.0f, 32.0f)
                curveTo(21.7878f, 32.0f, 26.8605f, 28.9254f, 29.6675f, 24.3202f)
                horizontalLineTo(22.8438f)
                verticalLineTo(15.9208f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF6600)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6474f, 7.5975f)
                lineTo(16.0f, 17.9508f)
                lineTo(26.3525f, 7.5975f)
                verticalLineTo(21.021f)
                horizontalLineTo(31.1957f)
                curveTo(31.717f, 19.4436f, 32.0f, 17.7548f, 32.0f, 16.0014f)
                curveTo(32.0f, 7.1653f, 24.8354f, 2.0E-4f, 16.0f, 2.0E-4f)
                curveTo(7.1646f, 2.0E-4f, 0.0f, 7.1653f, 0.0f, 16.0014f)
                curveTo(0.0f, 17.7548f, 0.2829f, 19.4436f, 0.8042f, 21.021f)
                horizontalLineTo(5.6474f)
                verticalLineTo(7.5975f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.3525f, 21.0207f)
                verticalLineTo(7.5972f)
                lineTo(16.0f, 17.9506f)
                lineTo(5.6474f, 7.5972f)
                verticalLineTo(21.0207f)
                horizontalLineTo(0.8042f)
                curveTo(1.1896f, 22.1859f, 1.7042f, 23.291f, 2.3325f, 24.3203f)
                horizontalLineTo(9.1562f)
                verticalLineTo(15.9209f)
                lineTo(16.0f, 22.7652f)
                lineTo(22.8438f, 15.9209f)
                verticalLineTo(24.3203f)
                horizontalLineTo(29.6675f)
                curveTo(30.2957f, 23.291f, 30.8103f, 22.1859f, 31.1957f, 21.0207f)
                horizontalLineTo(26.3525f)
                close()
            }
        }
        .build()
        return _xmr!!
    }

private var _xmr: ImageVector? = null
