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

public val CryptoIcons.Busd: ImageVector
    get() {
        if (_busd != null) {
            return _busd!!
        }
        _busd = Builder(name = "Busd", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF4C41B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0011f)
                curveTo(32.0f, 24.8374f, 24.8357f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1643f, 32.0f, 0.0f, 24.8374f, 0.0f, 16.0011f)
                curveTo(0.0f, 7.1626f, 7.1643f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8357f, 0.0f, 32.0f, 7.1626f, 32.0f, 16.0011f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1938f, 8.8966f)
                lineTo(8.9331f, 20.2578f)
                lineTo(11.806f, 23.1042f)
                lineTo(23.0667f, 11.743f)
                lineTo(20.1938f, 8.8966f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.47f, 13.1351f)
                lineTo(13.2092f, 24.4964f)
                lineTo(16.082f, 27.3428f)
                lineTo(27.3428f, 15.9793f)
                lineTo(24.47f, 13.1351f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.791f, 7.5041f)
                lineTo(15.9182f, 4.6576f)
                lineTo(8.8958f, 11.7449f)
                lineTo(11.7686f, 14.5913f)
                lineTo(18.791f, 7.5041f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5034f, 13.1482f)
                lineTo(4.6572f, 16.0213f)
                lineTo(7.53f, 18.8677f)
                lineTo(10.3763f, 15.9947f)
                lineTo(7.5034f, 13.1482f)
                close()
            }
        }
        .build()
        return _busd!!
    }

private var _busd: ImageVector? = null
