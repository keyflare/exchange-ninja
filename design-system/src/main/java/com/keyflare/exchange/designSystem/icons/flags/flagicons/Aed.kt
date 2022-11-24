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

public val FlagIcons.Aed: ImageVector
    get() {
        if (_aed != null) {
            return _aed!!
        }
        _aed = Builder(name = "Aed", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(144.696f, 345.043f)
                lineToRelative(22.261f, 151.036f)
                curveToRelative(27.732f, 10.291f, 57.729f, 15.921f, 89.043f, 15.921f)
                curveToRelative(110.07f, 0.0f, 203.906f, -69.472f, 240.076f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(144.696f, 166.957f)
                lineToRelative(22.261f, -151.036f)
                curveToRelative(27.732f, -10.291f, 57.729f, -15.921f, 89.043f, -15.921f)
                curveToRelative(110.07f, 0.0f, 203.906f, 69.472f, 240.076f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 110.071f, 69.473f, 203.906f, 166.957f, 240.077f)
                verticalLineToRelative(-480.154f)
                curveToRelative(-97.484f, 36.171f, -166.957f, 130.006f, -166.957f, 240.077f)
                close()
            }
        }
        .build()
        return _aed!!
    }

private var _aed: ImageVector? = null
