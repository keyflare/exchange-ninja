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

public val CryptoIcons.Zil: ImageVector
    get() {
        if (_zil != null) {
            return _zil!!
        }
        _zil = Builder(name = "Zil", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF49C1BF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9999f, 0.0f)
                curveTo(7.1635f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.1635f, 32.0f, 15.9999f, 32.0f)
                curveTo(24.8365f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8365f, 0.0f, 15.9999f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF80D4D2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1472f, 7.3374f)
                lineTo(12.1067f, 6.2024f)
                lineTo(22.8526f, 11.4027f)
                lineTo(20.0944f, 12.6108f)
                lineTo(9.1472f, 7.3374f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFE9E8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0942f, 16.9466f)
                verticalLineTo(25.7979f)
                lineTo(22.8525f, 24.4767f)
                verticalLineTo(15.6211f)
                lineTo(20.0942f, 16.9466f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFE9E8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8525f, 11.4027f)
                lineTo(20.0942f, 12.6108f)
                verticalLineTo(15.5679f)
                lineTo(22.8525f, 14.2622f)
                verticalLineTo(11.4027f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0944f, 15.5679f)
                verticalLineTo(12.6108f)
                lineTo(9.1472f, 7.3373f)
                verticalLineTo(10.2168f)
                lineTo(16.6465f, 13.9031f)
                lineTo(9.1472f, 17.6294f)
                verticalLineTo(20.4534f)
                lineTo(20.0944f, 25.7979f)
                verticalLineTo(22.9228f)
                lineTo(12.7389f, 19.3052f)
                lineTo(20.0944f, 15.5679f)
                close()
            }
        }
        .build()
        return _zil!!
    }

private var _zil: ImageVector? = null
