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

public val FlagIcons.Xof: ImageVector
    get() {
        if (_xof != null) {
            return _xof!!
        }
        _xof = Builder(name = "Xof", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(31.314f, 0.0f, 61.311f, -5.632f, 89.043f, -15.923f)
                lineToRelative(11.131f, -240.077f)
                lineToRelative(-11.13f, -240.077f)
                curveToRelative(-27.733f, -10.29f, -57.73f, -15.923f, -89.044f, -15.923f)
                reflectiveCurveToRelative(-61.311f, 5.633f, -89.043f, 15.923f)
                lineToRelative(-11.131f, 240.077f)
                lineToRelative(11.13f, 240.077f)
                curveToRelative(27.733f, 10.291f, 57.73f, 15.923f, 89.044f, 15.923f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 110.071f, 69.472f, 203.906f, 166.957f, 240.077f)
                verticalLineToRelative(-480.154f)
                curveToRelative(-97.485f, 36.171f, -166.957f, 130.006f, -166.957f, 240.077f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.043f, 15.923f)
                verticalLineToRelative(480.155f)
                curveToRelative(97.485f, -36.172f, 166.957f, -130.007f, 166.957f, -240.078f)
                reflectiveCurveToRelative(-69.472f, -203.906f, -166.957f, -240.077f)
                close()
            }
        }
        .build()
        return _xof!!
    }

private var _xof: ImageVector? = null
