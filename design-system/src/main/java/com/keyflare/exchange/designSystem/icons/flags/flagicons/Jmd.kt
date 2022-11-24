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

public val FlagIcons.Jmd: ImageVector
    get() {
        if (_jmd != null) {
            return _jmd!!
        }
        _jmd = Builder(name = "Jmd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(411.856f, 52.92f)
                curveToRelative(-43.167f, -33.181f, -97.202f, -52.92f, -155.856f, -52.92f)
                reflectiveCurveToRelative(-112.69f, 19.74f, -155.857f, 52.92f)
                lineToRelative(155.857f, 155.856f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(52.919f, 100.144f)
                curveToRelative(-33.179f, 43.167f, -52.919f, 97.202f, -52.919f, 155.856f)
                reflectiveCurveToRelative(19.74f, 112.69f, 52.92f, 155.858f)
                lineToRelative(155.857f, -155.858f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(100.143f, 459.08f)
                curveToRelative(43.168f, 33.181f, 97.203f, 52.92f, 155.857f, 52.92f)
                reflectiveCurveToRelative(112.689f, -19.74f, 155.857f, -52.92f)
                lineToRelative(-155.857f, -155.856f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(459.08f, 411.856f)
                curveToRelative(33.181f, -43.167f, 52.92f, -97.202f, 52.92f, -155.856f)
                reflectiveCurveToRelative(-19.739f, -112.689f, -52.92f, -155.856f)
                lineToRelative(-155.856f, 155.856f)
                close()
            }
        }
        .build()
        return _jmd!!
    }

private var _jmd: ImageVector? = null
