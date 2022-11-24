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

public val FlagIcons.Srd: ImageVector
    get() {
        if (_srd != null) {
            return _srd!!
        }
        _srd = Builder(name = "Srd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(496.076f, 166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(-10.289f, 27.734f, -15.922f, 57.729f, -15.922f, 89.043f)
                reflectiveCurveToRelative(5.633f, 61.311f, 15.922f, 89.043f)
                horizontalLineToRelative(480.155f)
                curveToRelative(10.291f, -27.732f, 15.923f, -57.729f, 15.923f, -89.043f)
                reflectiveCurveToRelative(-5.632f, -61.309f, -15.924f, -89.043f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.741f, 512.0f)
                curveToRelative(87.682f, 0.0f, 165.058f, -44.092f, 211.196f, -111.304f)
                horizontalLineToRelative(-422.391f)
                curveToRelative(46.138f, 67.212f, 123.512f, 111.304f, 211.195f, 111.304f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.741f, 0.002f)
                curveToRelative(87.682f, 0.0f, 165.058f, 44.092f, 211.196f, 111.304f)
                horizontalLineToRelative(-422.391f)
                curveToRelative(46.138f, -67.212f, 123.512f, -111.304f, 211.195f, -111.304f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 166.957f)
                lineToRelative(22.101f, 68.02f)
                horizontalLineToRelative(71.525f)
                lineToRelative(-57.864f, 42.044f)
                lineToRelative(22.103f, 68.022f)
                lineToRelative(-57.865f, -42.039f)
                lineToRelative(-57.865f, 42.039f)
                lineToRelative(22.104f, -68.022f)
                lineToRelative(-57.865f, -42.044f)
                horizontalLineToRelative(71.525f)
                close()
            }
        }
        .build()
        return _srd!!
    }

private var _srd: ImageVector? = null
