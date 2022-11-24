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

public val CryptoIcons.Hbar: ImageVector
    get() {
        if (_hbar != null) {
            return _hbar!!
        }
        _hbar = Builder(name = "Hbar", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF2F2F2F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1642f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8379f, 7.1642f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8357f, 32.0f, 32.0f, 24.8379f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8357f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.507f, 17.1083f)
                verticalLineTo(14.8805f)
                horizontalLineTo(20.4935f)
                verticalLineTo(17.1083f)
                horizontalLineTo(11.507f)
                close()
                moveTo(20.4935f, 8.8511f)
                verticalLineTo(13.2845f)
                horizontalLineTo(11.507f)
                verticalLineTo(8.8267f)
                horizontalLineTo(9.3923f)
                verticalLineTo(23.1509f)
                horizontalLineTo(11.507f)
                verticalLineTo(18.7043f)
                horizontalLineTo(20.4935f)
                verticalLineTo(23.1731f)
                horizontalLineTo(22.6082f)
                verticalLineTo(8.8511f)
                horizontalLineTo(20.4935f)
                close()
            }
        }
        .build()
        return _hbar!!
    }

private var _hbar: ImageVector? = null
