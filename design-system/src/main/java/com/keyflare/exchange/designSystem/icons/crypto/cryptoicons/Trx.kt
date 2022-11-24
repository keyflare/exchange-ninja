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

public val CryptoIcons.Trx: ImageVector
    get() {
        if (_trx != null) {
            return _trx!!
        }
        _trx = Builder(name = "Trx", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFFF0013)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0011f)
                curveTo(32.0f, 24.8368f, 24.8368f, 32.0f, 16.0011f, 32.0f)
                curveTo(7.1632f, 32.0f, 0.0f, 24.8368f, 0.0f, 16.0011f)
                curveTo(0.0f, 7.1631f, 7.1632f, 0.0f, 16.0011f, 0.0f)
                curveTo(24.8368f, 0.0f, 32.0f, 7.1631f, 32.0f, 16.0011f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3814f, 25.4298f)
                lineTo(16.5453f, 16.001f)
                lineTo(24.1394f, 14.6884f)
                lineTo(15.3814f, 25.4298f)
                close()
                moveTo(14.3464f, 25.05f)
                lineTo(8.1849f, 9.482f)
                lineTo(15.4636f, 15.4635f)
                lineTo(14.3464f, 25.05f)
                close()
                moveTo(20.4723f, 10.6726f)
                lineTo(16.0011f, 14.4551f)
                lineTo(8.7602f, 8.5447f)
                lineTo(20.4723f, 10.6726f)
                close()
                moveTo(24.2194f, 13.6711f)
                lineTo(17.2294f, 14.8238f)
                lineTo(21.5273f, 11.2123f)
                lineTo(24.2194f, 13.6711f)
                close()
                moveTo(21.7872f, 9.9063f)
                lineTo(5.9504f, 6.9588f)
                lineTo(14.4996f, 28.3018f)
                lineTo(26.2117f, 13.9243f)
                lineTo(21.7872f, 9.9063f)
                close()
            }
        }
        .build()
        return _trx!!
    }

private var _trx: ImageVector? = null
