package com.keyflare.exchange.designSystem.icons.flags.flagicons

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
import com.keyflare.exchange.designSystem.icons.flags.FlagIcons

public val FlagIcons.Kpw: ImageVector
    get() {
        if (_kpw != null) {
            return _kpw!!
        }
        _kpw = Builder(name = "Kpw", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-77.591f, 0.0f, -147.114f, 34.524f, -194.061f, 89.043f)
                horizontalLineToRelative(388.121f)
                curveToRelative(-46.946f, -54.519f, -116.469f, -89.043f, -194.06f, -89.043f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(450.061f, 422.957f)
                horizontalLineToRelative(-388.122f)
                curveToRelative(46.947f, 54.519f, 116.47f, 89.043f, 194.061f, 89.043f)
                reflectiveCurveToRelative(147.114f, -34.524f, 194.061f, -89.043f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(474.426f, 122.435f)
                horizontalLineToRelative(-436.852f)
                curveToRelative(-23.829f, 38.885f, -37.574f, 84.618f, -37.574f, 133.565f)
                reflectiveCurveToRelative(13.745f, 94.681f, 37.574f, 133.565f)
                horizontalLineToRelative(436.852f)
                curveToRelative(23.829f, -38.884f, 37.574f, -84.618f, 37.574f, -133.565f)
                reflectiveCurveToRelative(-13.745f, -94.68f, -37.574f, -133.565f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.496f, 256.0f)
                moveToRelative(-98.504f, 0.0f)
                arcToRelative(98.504f, 98.504f, 0.0f, true, true, 197.008f, 0.0f)
                arcToRelative(98.504f, 98.504f, 0.0f, true, true, -197.008f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(157.496f, 157.496f)
                lineToRelative(22.101f, 68.021f)
                horizontalLineToRelative(71.638f)
                lineToRelative(-57.977f, 42.042f)
                lineToRelative(22.274f, 68.224f)
                lineToRelative(-58.036f, -42.242f)
                lineToRelative(-57.948f, 42.163f)
                lineToRelative(22.186f, -68.145f)
                lineToRelative(-57.925f, -42.042f)
                horizontalLineToRelative(71.585f)
                close()
            }
        }
        .build()
        return _kpw!!
    }

private var _kpw: ImageVector? = null
