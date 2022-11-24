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

public val CryptoIcons.Stx: ImageVector
    get() {
        if (_stx != null) {
            return _stx!!
        }
        _stx = Builder(name = "Stx", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF5546FF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1628f, 0.0f, 0.0f, 7.1628f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8372f, 7.1628f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8372f, 32.0f, 32.0f, 24.8372f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1628f, 24.8372f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2128f, 13.0009f)
                lineTo(22.5325f, 7.7484f)
                horizontalLineTo(20.0255f)
                lineTo(16.0132f, 14.0006f)
                lineTo(12.0009f, 7.7484f)
                horizontalLineTo(9.5072f)
                lineTo(12.8804f, 13.0009f)
                horizontalLineTo(8.0667f)
                verticalLineTo(15.0137f)
                horizontalLineTo(23.9331f)
                verticalLineTo(13.0009f)
                horizontalLineTo(19.2128f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0667f, 18.999f)
                horizontalLineTo(12.7869f)
                lineTo(9.4672f, 24.2515f)
                horizontalLineTo(11.9742f)
                lineTo(15.9865f, 17.9993f)
                lineTo(19.9988f, 24.2515f)
                horizontalLineTo(22.4925f)
                lineTo(19.1193f, 18.999f)
                horizontalLineTo(23.9331f)
                verticalLineTo(16.9862f)
                horizontalLineTo(8.0667f)
                verticalLineTo(18.999f)
                close()
            }
        }
        .build()
        return _stx!!
    }

private var _stx: ImageVector? = null
