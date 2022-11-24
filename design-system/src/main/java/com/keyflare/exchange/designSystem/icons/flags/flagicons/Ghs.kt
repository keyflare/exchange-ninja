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

public val FlagIcons.Ghs: ImageVector
    get() {
        if (_ghs != null) {
            return _ghs!!
        }
        _ghs = Builder(name = "Ghs", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 31.314f, 5.633f, 61.31f, 15.923f, 89.043f)
                lineToRelative(240.077f, 11.131f)
                lineToRelative(240.077f, -11.13f)
                curveToRelative(10.291f, -27.734f, 15.923f, -57.73f, 15.923f, -89.044f)
                reflectiveCurveToRelative(-5.632f, -61.31f, -15.923f, -89.043f)
                lineToRelative(-240.077f, -11.131f)
                lineToRelative(-240.077f, 11.13f)
                curveToRelative(-10.29f, 27.734f, -15.923f, 57.73f, -15.923f, 89.044f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-110.071f, 0.0f, -203.906f, 69.472f, -240.077f, 166.957f)
                horizontalLineToRelative(480.155f)
                curveToRelative(-36.172f, -97.485f, -130.007f, -166.957f, -240.078f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(496.077f, 345.043f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(36.171f, 97.484f, 130.006f, 166.957f, 240.077f, 166.957f)
                reflectiveCurveToRelative(203.906f, -69.473f, 240.077f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(255.998f, 166.957f)
                lineToRelative(22.1f, 68.02f)
                horizontalLineToRelative(71.528f)
                lineToRelative(-57.863f, 42.043f)
                lineToRelative(22.1f, 68.023f)
                lineToRelative(-57.865f, -42.04f)
                lineToRelative(-57.865f, 42.04f)
                lineToRelative(22.104f, -68.023f)
                lineToRelative(-57.863f, -42.043f)
                horizontalLineToRelative(71.524f)
                close()
            }
        }
        .build()
        return _ghs!!
    }

private var _ghs: ImageVector? = null
