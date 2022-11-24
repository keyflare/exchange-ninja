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

public val CryptoIcons.Kda: ImageVector
    get() {
        if (_kda != null) {
            return _kda!!
        }
        _kda = Builder(name = "Kda", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF181818)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9989f, 0.0f)
                curveTo(7.1626f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.1626f, 32.0f, 15.9989f, 32.0f)
                curveTo(24.8374f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8374f, 0.0f, 15.9989f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED098F), 1.0f to Color(0xFF6A0097), start =
                    Offset(16.2185f,15.9691f), end = Offset(22.3749f,23.9413f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.781f, 24.3237f)
                horizontalLineTo(24.5538f)
                lineTo(17.808f, 14.2844f)
                lineTo(14.9971f, 17.2038f)
                lineTo(19.781f, 24.3237f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED098F), 0.0570418f to Color(0xFFED098F),
                    1.0f to Color(0xFF6A0097), start = Offset(12.5363f,16.8558f), end =
                    Offset(22.4822f,7.44977f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                    = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    NonZero) {
                moveTo(17.8079f, 14.2845f)
                lineTo(24.1702f, 7.6765f)
                horizontalLineTo(19.271f)
                lineTo(13.5161f, 13.6549f)
                verticalLineTo(18.7422f)
                lineTo(14.997f, 17.2038f)
                lineTo(17.8079f, 14.2845f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6A0097)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5161f, 7.6765f)
                horizontalLineTo(9.3928f)
                verticalLineTo(24.3237f)
                horizontalLineTo(13.5161f)
                verticalLineTo(18.7421f)
                verticalLineTo(13.6548f)
                verticalLineTo(7.6765f)
                close()
            }
        }
        .build()
        return _kda!!
    }

private var _kda: ImageVector? = null
