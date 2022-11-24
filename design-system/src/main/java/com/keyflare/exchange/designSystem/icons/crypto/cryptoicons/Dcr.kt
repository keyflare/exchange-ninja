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

public val CryptoIcons.Dcr: ImageVector
    get() {
        if (_dcr != null) {
            return _dcr!!
        }
        _dcr = Builder(name = "Dcr", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8373f, 32.0f, 16.001f, 32.0f)
                curveTo(7.1625f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1625f, 0.0f, 16.001f, 0.0f)
                curveTo(24.8373f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2576F4), 1.0f to Color(0xFF3298DA), start =
                    Offset(7.49069f,22.0115f), end = Offset(16.1116f,10.3133f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.416f, 20.6992f)
                horizontalLineTo(12.7734f)
                curveTo(11.0199f, 20.6992f, 9.5967f, 19.2761f, 9.5967f, 17.5205f)
                curveTo(9.5967f, 15.7671f, 11.0199f, 14.344f, 12.7734f, 14.344f)
                horizontalLineTo(17.2603f)
                lineTo(14.7109f, 11.8103f)
                lineTo(10.7672f, 7.8713f)
                horizontalLineTo(6.3601f)
                lineTo(10.3682f, 11.9123f)
                curveTo(8.0804f, 12.38f, 6.3601f, 14.4039f, 6.3601f, 16.8289f)
                verticalLineTo(17.6335f)
                curveTo(6.3601f, 21.127f, 9.1932f, 23.96f, 12.6869f, 23.96f)
                horizontalLineTo(17.6039f)
                lineTo(14.416f, 20.6992f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF36BDB9), 1.0f to Color(0xFF39D8AA), start =
                    Offset(16.6614f,20.5795f), end = Offset(24.3999f,10.0787f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6959f, 19.9456f)
                curveTo(23.9571f, 19.5044f, 25.664f, 17.5161f, 25.664f, 15.1265f)
                verticalLineTo(14.2154f)
                curveTo(25.664f, 10.7131f, 22.8243f, 7.8713f, 19.3195f, 7.8713f)
                horizontalLineTo(14.4158f)
                lineTo(17.6569f, 11.1653f)
                horizontalLineTo(19.3549f)
                curveTo(21.1106f, 11.1653f, 22.5339f, 12.5884f, 22.5339f, 14.344f)
                curveTo(22.5339f, 16.0996f, 21.1106f, 17.5205f, 19.3549f, 17.5205f)
                horizontalLineTo(14.8702f)
                lineTo(21.2503f, 23.96f)
                horizontalLineTo(25.7793f)
                lineTo(21.6959f, 19.9456f)
                close()
            }
        }
        .build()
        return _dcr!!
    }

private var _dcr: ImageVector? = null
