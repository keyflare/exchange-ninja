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

public val FlagIcons.Ron: ImageVector
    get() {
        if (_ron != null) {
            return _ron!!
        }
        _ron = Builder(name = "Ron", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.043f, 15.922f)
                curveToRelative(-27.734f, -10.289f, -57.729f, -15.922f, -89.043f, -15.922f)
                curveToRelative(-31.314f, -0.001f, -61.31f, 5.633f, -89.043f, 15.922f)
                lineToRelative(-22.261f, 240.077f)
                lineToRelative(22.261f, 240.077f)
                curveToRelative(27.732f, 10.292f, 57.728f, 15.924f, 89.043f, 15.924f)
                curveToRelative(31.313f, 0.0f, 61.31f, -5.632f, 89.043f, -15.924f)
                lineToRelative(22.26f, -240.076f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -110.07f, -69.472f, -203.907f, -166.957f, -240.077f)
                verticalLineToRelative(480.156f)
                curveToRelative(97.485f, -36.174f, 166.956f, -130.007f, 166.957f, -240.079f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 255.999f)
                curveToRelative(0.0f, 110.073f, 69.472f, 203.906f, 166.955f, 240.079f)
                lineToRelative(0.001f, -480.154f)
                curveToRelative(-97.484f, 36.17f, -166.956f, 130.004f, -166.956f, 240.075f)
                close()
            }
        }
        .build()
        return _ron!!
    }

private var _ron: ImageVector? = null
