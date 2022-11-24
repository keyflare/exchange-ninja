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

public val CryptoIcons.Theta: ImageVector
    get() {
        if (_theta != null) {
            return _theta!!
        }
        _theta = Builder(name = "Theta", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF1B1F2B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1643f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.1643f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8379f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8379f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2EE1C0), 1.0f to Color(0xFF2ABAE4), start =
                    Offset(20.8035f,24.0842f), end = Offset(12.1922f,9.56028f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.6487f, 23.0047f)
                horizontalLineTo(12.3535f)
                verticalLineTo(8.9953f)
                horizontalLineTo(19.6487f)
                verticalLineTo(23.0047f)
                close()
                moveTo(20.5242f, 7.3594f)
                horizontalLineTo(11.4779f)
                lineTo(10.6245f, 8.2372f)
                verticalLineTo(23.7318f)
                lineTo(11.4779f, 24.6406f)
                horizontalLineTo(11.6243f)
                horizontalLineTo(12.3535f)
                horizontalLineTo(19.6487f)
                horizontalLineTo(20.3713f)
                horizontalLineTo(20.5242f)
                lineTo(21.3754f, 23.7318f)
                verticalLineTo(8.2372f)
                lineTo(20.5242f, 7.3594f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2EE1C0), 1.0f to Color(0xFF2ABAE4), start =
                    Offset(21.4464f,23.7031f), end = Offset(12.8352f,9.17925f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7155f, 13.6682f)
                horizontalLineTo(16.8491f)
                verticalLineTo(11.7353f)
                horizontalLineTo(15.1511f)
                verticalLineTo(13.6682f)
                horizontalLineTo(13.2869f)
                verticalLineTo(15.3662f)
                horizontalLineTo(18.7155f)
                verticalLineTo(13.6682f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2EE1C0), 1.0f to Color(0xFF2ABAE4), start =
                    Offset(20.1142f,24.4944f), end = Offset(11.5029f,9.9705f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.1511f, 20.3403f)
                horizontalLineTo(16.8491f)
                verticalLineTo(18.4052f)
                horizontalLineTo(18.7155f)
                verticalLineTo(16.7072f)
                horizontalLineTo(13.2869f)
                verticalLineTo(18.4052f)
                horizontalLineTo(15.1511f)
                verticalLineTo(20.3403f)
                close()
            }
        }
        .build()
        return _theta!!
    }

private var _theta: ImageVector? = null
