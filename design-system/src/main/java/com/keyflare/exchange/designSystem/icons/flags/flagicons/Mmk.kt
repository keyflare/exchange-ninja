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

public val FlagIcons.Mmk: ImageVector
    get() {
        if (_mmk != null) {
            return _mmk!!
        }
        _mmk = Builder(name = "Mmk", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(496.077f, 345.043f)
                curveToRelative(10.291f, -27.732f, 15.923f, -57.729f, 15.923f, -89.043f)
                reflectiveCurveToRelative(-5.632f, -61.311f, -15.923f, -89.043f)
                lineToRelative(-240.077f, -22.261f)
                lineToRelative(-240.077f, 22.261f)
                curveToRelative(-10.29f, 27.732f, -15.923f, 57.729f, -15.923f, 89.043f)
                reflectiveCurveToRelative(5.633f, 61.311f, 15.923f, 89.043f)
                lineToRelative(240.077f, 22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(496.077f, 166.957f)
                curveToRelative(-36.171f, -97.485f, -130.006f, -166.957f, -240.077f, -166.957f)
                reflectiveCurveToRelative(-203.906f, 69.472f, -240.077f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(110.071f, 0.0f, 203.906f, -69.472f, 240.077f, -166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(36.171f, 97.485f, 130.006f, 166.957f, 240.077f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(431.549f, 216.586f)
                horizontalLineToRelative(-134.107f)
                lineToRelative(-41.442f, -127.543f)
                lineToRelative(-41.442f, 127.543f)
                horizontalLineToRelative(-134.107f)
                lineToRelative(108.495f, 78.826f)
                lineToRelative(-41.442f, 127.545f)
                lineToRelative(108.496f, -77.914f)
                lineToRelative(108.496f, 77.913f)
                lineToRelative(-41.441f, -127.545f)
                close()
            }
        }
        .build()
        return _mmk!!
    }

private var _mmk: ImageVector? = null
