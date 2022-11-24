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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons

public val CryptoIcons.Sol: ImageVector
    get() {
        if (_sol != null) {
            return _sol!!
        }
        _sol = Builder(name = "Sol", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF272727)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 15.9989f)
                curveTo(32.0f, 24.8367f, 24.8367f, 32.0f, 15.9989f, 32.0f)
                curveTo(7.1633f, 32.0f, 0.0f, 24.8367f, 0.0f, 15.9989f)
                curveTo(0.0f, 7.1633f, 7.1633f, 0.0f, 15.9989f, 0.0f)
                curveTo(24.8367f, 0.0f, 32.0f, 7.1633f, 32.0f, 15.9989f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF00FFA3), 1.0f to Color(0xFFDC1FFF),
                        start = Offset(23.3334f,7.26956f), end = Offset(13.067f,26.5346f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.9237f, 19.9905f)
                    curveTo(10.0324f, 19.8796f, 10.1817f, 19.8149f, 10.3401f, 19.8149f)
                    horizontalLineTo(24.7057f)
                    curveTo(24.9683f, 19.8149f, 25.0995f, 20.1383f, 24.9139f, 20.3277f)
                    lineTo(22.0761f, 23.2244f)
                    curveTo(21.9675f, 23.3352f, 21.8181f, 23.3999f, 21.6597f, 23.3999f)
                    horizontalLineTo(7.2941f)
                    curveTo(7.0316f, 23.3999f, 6.9004f, 23.0765f, 7.0859f, 22.8871f)
                    lineTo(9.9237f, 19.9905f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF00FFA3), 1.0f to Color(0xFFDC1FFF),
                        start = Offset(18.9864f,4.95297f), end = Offset(8.71998f,24.218f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.924f, 9.1756f)
                    curveTo(10.0371f, 9.0647f, 10.1865f, 9.0f, 10.3404f, 9.0f)
                    horizontalLineTo(24.706f)
                    curveTo(24.9685f, 9.0f, 25.0997f, 9.3234f, 24.9142f, 9.5128f)
                    lineTo(22.0764f, 12.4094f)
                    curveTo(21.9677f, 12.5203f, 21.8184f, 12.585f, 21.66f, 12.585f)
                    horizontalLineTo(7.2944f)
                    curveTo(7.0319f, 12.585f, 6.9006f, 12.2616f, 7.0862f, 12.0722f)
                    lineTo(9.924f, 9.1756f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF00FFA3), 1.0f to Color(0xFFDC1FFF),
                        start = Offset(21.146f,6.10411f), end = Offset(10.8795f,25.3692f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.0761f, 14.5486f)
                    curveTo(21.9675f, 14.4377f, 21.8181f, 14.373f, 21.6597f, 14.373f)
                    horizontalLineTo(7.2941f)
                    curveTo(7.0316f, 14.373f, 6.9004f, 14.6964f, 7.0859f, 14.8858f)
                    lineTo(9.9237f, 17.7825f)
                    curveTo(10.0324f, 17.8934f, 10.1817f, 17.958f, 10.3401f, 17.958f)
                    horizontalLineTo(24.7057f)
                    curveTo(24.9683f, 17.958f, 25.0995f, 17.6346f, 24.9139f, 17.4452f)
                    lineTo(22.0761f, 14.5486f)
                    close()
                }
            }
        }
        .build()
        return _sol!!
    }

private var _sol: ImageVector? = null
