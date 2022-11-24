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

public val FlagIcons.Crc: ImageVector
    get() {
        if (_crc != null) {
            return _crc!!
        }
        _crc = Builder(name = "Crc", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(496.077f, 166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(-10.29f, 27.733f, -15.923f, 57.729f, -15.923f, 89.043f)
                reflectiveCurveToRelative(5.633f, 61.31f, 15.923f, 89.043f)
                horizontalLineToRelative(480.155f)
                curveToRelative(10.29f, -27.733f, 15.922f, -57.729f, 15.922f, -89.043f)
                reflectiveCurveToRelative(-5.632f, -61.31f, -15.923f, -89.043f)
                close()
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
        }
        .build()
        return _crc!!
    }

private var _crc: ImageVector? = null
