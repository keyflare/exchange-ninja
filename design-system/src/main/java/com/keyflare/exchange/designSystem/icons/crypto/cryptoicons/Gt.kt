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

public val CryptoIcons.Gt: ImageVector
    get() {
        if (_gt != null) {
            return _gt!!
        }
        _gt = Builder(name = "Gt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth =
                32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF4F4F4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8357f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1643f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1643f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8357f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD45657)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.5941f, 11.3228f)
                lineTo(19.5004f, 14.5126f)
                verticalLineTo(18.2566f)
                lineTo(21.6063f, 17.1172f)
                verticalLineTo(19.3206f)
                lineTo(15.4505f, 22.5747f)
                lineTo(10.8908f, 19.9324f)
                curveTo(10.2147f, 19.54f, 9.798f, 18.8174f, 9.798f, 18.0327f)
                verticalLineTo(12.4533f)
                lineTo(14.6946f, 9.5583f)
                curveTo(15.2821f, 9.2103f, 16.0113f, 9.2081f, 16.6032f, 9.5494f)
                lineTo(21.6284f, 12.4533f)
                lineTo(24.6298f, 10.6356f)
                lineTo(16.8914f, 6.251f)
                curveTo(16.1842f, 5.852f, 15.3197f, 5.8542f, 14.6171f, 6.2599f)
                lineTo(6.8276f, 10.7465f)
                verticalLineTo(19.5821f)
                curveTo(6.8276f, 20.4555f, 7.2909f, 21.2668f, 8.0446f, 21.7101f)
                lineTo(15.6456f, 26.1768f)
                lineTo(23.4749f, 21.6259f)
                curveTo(24.1909f, 21.2092f, 24.6298f, 20.4444f, 24.6298f, 19.6176f)
                verticalLineTo(15.4768f)
                lineTo(25.5941f, 14.9559f)
                verticalLineTo(11.3228f)
                close()
            }
        }
        .build()
        return _gt!!
    }

private var _gt: ImageVector? = null
