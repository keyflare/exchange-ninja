package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.geometry.Offset
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

public val CryptoIcons.Zec: ImageVector
    get() {
        if (_zec != null) {
            return _zec!!
        }
        _zec = Builder(name = "Zec", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF242424)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8373f, 32.0f, 16.001f, 32.0f)
                curveTo(7.1625f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1625f, 0.0f, 16.001f, 0.0f)
                curveTo(24.8373f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFD48C26), 1.0f to Color(0xFFFCCF58), start =
                    Offset(5.93465f,23.4976f), end = Offset(25.7313f,8.75271f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(28.3158f, 16.0008f)
                curveTo(28.3158f, 22.8016f, 22.8025f, 28.3145f, 16.0012f, 28.3145f)
                curveTo(9.2f, 28.3145f, 3.6846f, 22.8016f, 3.6846f, 16.0008f)
                curveTo(3.6846f, 9.2f, 9.2f, 3.6871f, 16.0012f, 3.6871f)
                curveTo(22.8025f, 3.6871f, 28.3158f, 9.2f, 28.3158f, 16.0008f)
                close()
            }
            path(fill = SolidColor(Color(0xFF242424)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9776f, 19.7815f)
                horizontalLineTo(15.5998f)
                lineTo(21.7559f, 11.582f)
                verticalLineTo(8.6006f)
                horizontalLineTo(17.6282f)
                verticalLineTo(5.8386f)
                horizontalLineTo(14.2741f)
                verticalLineTo(8.6006f)
                horizontalLineTo(10.4634f)
                verticalLineTo(11.582f)
                verticalLineTo(12.3823f)
                horizontalLineTo(16.4821f)
                lineTo(10.0222f, 20.8323f)
                verticalLineTo(23.5366f)
                horizontalLineTo(11.9265f)
                horizontalLineTo(14.2741f)
                verticalLineTo(26.1611f)
                horizontalLineTo(17.6282f)
                verticalLineTo(23.5366f)
                horizontalLineTo(21.9776f)
                verticalLineTo(19.7815f)
                close()
            }
        }
        .build()
        return _zec!!
    }

private var _zec: ImageVector? = null
