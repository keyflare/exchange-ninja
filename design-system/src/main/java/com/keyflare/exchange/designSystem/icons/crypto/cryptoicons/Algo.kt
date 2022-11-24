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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons

public val CryptoIcons.Algo: ImageVector
    get() {
        if (_algo != null) {
            return _algo!!
        }
        _algo = Builder(name = "Algo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
            viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFA01584), 1.0f to Color(0xFFE84E1D), start =
            Offset(4.28408E-7f,14.5f), end = Offset(32.0f,16.5f)), stroke = null,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                moveToRelative(-16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero) {
                moveTo(23.9012f, 23.9927f)
                lineTo(21.2612f, 14.0683f)
                lineTo(23.1624f, 10.7749f)
                horizontalLineTo(20.3857f)
                lineTo(19.2268f, 6.4214f)
                horizontalLineTo(16.5679f)
                lineTo(6.4214f, 23.9927f)
                horizontalLineTo(9.4454f)
                lineTo(17.4356f, 10.1533f)
                lineTo(18.4008f, 13.7848f)
                lineTo(12.5077f, 23.9927f)
                horizontalLineTo(15.5309f)
                lineTo(19.3552f, 17.3694f)
                lineTo(21.116f, 23.9927f)
                horizontalLineTo(23.9012f)
                close()
            }
        }
            .build()
        return _algo!!
    }

private var _algo: ImageVector? = null
