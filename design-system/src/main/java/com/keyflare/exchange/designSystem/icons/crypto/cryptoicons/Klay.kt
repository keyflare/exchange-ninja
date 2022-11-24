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

public val CryptoIcons.Klay: ImageVector
    get() {
        if (_klay != null) {
            return _klay!!
        }
        _klay = Builder(name = "Klay", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF4F6F5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1643f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.1643f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8379f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8379f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8655f, 15.8136f)
                curveTo(4.8655f, 15.8136f, 4.9165f, 20.5395f, 7.7826f, 23.3569f)
                lineTo(15.2639f, 5.4994f)
                lineTo(4.8655f, 15.8136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5166f, 23.8626f)
                lineTo(16.0001f, 27.0347f)
                lineTo(23.508f, 23.8626f)
                lineTo(16.0134f, 16.5076f)
                lineTo(8.5166f, 23.8626f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.1929f, 8.2946f)
                curveTo(24.1929f, 8.2946f, 27.1367f, 11.5864f, 27.1367f, 16.0508f)
                curveTo(27.1367f, 16.0508f, 27.0591f, 20.4885f, 24.1929f, 23.3569f)
                lineTo(16.634f, 15.8247f)
                lineTo(24.1929f, 8.2946f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2524f, 22.0869f)
                lineTo(23.5079f, 7.807f)
                lineTo(16.3813f, 4.9653f)
                lineTo(9.2524f, 22.0869f)
                close()
            }
        }
        .build()
        return _klay!!
    }

private var _klay: ImageVector? = null
