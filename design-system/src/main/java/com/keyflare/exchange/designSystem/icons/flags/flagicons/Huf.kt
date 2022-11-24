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

public val FlagIcons.Huf: ImageVector
    get() {
        if (_huf != null) {
            return _huf!!
        }
        _huf = Builder(name = "Huf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.923f, 166.957f)
                curveToRelative(-10.29f, 27.734f, -15.923f, 57.729f, -15.923f, 89.043f)
                reflectiveCurveToRelative(5.633f, 61.311f, 15.923f, 89.043f)
                lineToRelative(240.077f, 22.261f)
                lineToRelative(240.077f, -22.261f)
                curveToRelative(10.29f, -27.732f, 15.923f, -57.729f, 15.923f, -89.043f)
                reflectiveCurveToRelative(-5.633f, -61.309f, -15.923f, -89.043f)
                lineToRelative(-240.077f, -22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-110.07f, 0.0f, -203.906f, 69.472f, -240.076f, 166.957f)
                horizontalLineToRelative(480.155f)
                curveToRelative(-36.173f, -97.485f, -130.007f, -166.957f, -240.079f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(110.072f, 0.0f, 203.906f, -69.472f, 240.078f, -166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(36.17f, 97.485f, 130.006f, 166.957f, 240.076f, 166.957f)
                close()
            }
        }
        .build()
        return _huf!!
    }

private var _huf: ImageVector? = null
