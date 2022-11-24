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

public val FlagIcons.Omr: ImageVector
    get() {
        if (_omr != null) {
            return _omr!!
        }
        _omr = Builder(name = "Omr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 97.035f, 53.99f, 181.455f, 133.565f, 224.873f)
                verticalLineToRelative(-449.746f)
                curveToRelative(-79.575f, 43.418f, -133.565f, 127.838f, -133.565f, 224.873f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(496.078f, 345.043f)
                curveToRelative(10.29f, -27.733f, 15.922f, -57.729f, 15.922f, -89.043f)
                reflectiveCurveToRelative(-5.632f, -61.311f, -15.922f, -89.043f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(-10.291f, 27.732f, -15.924f, 57.729f, -15.924f, 89.043f)
                reflectiveCurveToRelative(5.633f, 61.31f, 15.924f, 89.043f)
                lineToRelative(240.076f, 22.261f)
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
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 118.279f, 80.221f, 217.805f, 189.217f, 247.181f)
                verticalLineToRelative(-494.362f)
                curveToRelative(-108.996f, 29.376f, -189.217f, 128.902f, -189.217f, 247.181f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(156.617f, 112.654f)
                lineToRelative(-23.611f, -23.611f)
                lineToRelative(-15.74f, 15.742f)
                lineToRelative(-15.74f, -15.742f)
                lineToRelative(-23.611f, 23.611f)
                lineToRelative(15.741f, 15.741f)
                lineToRelative(-15.743f, 15.742f)
                lineToRelative(23.611f, 23.611f)
                lineToRelative(15.741f, -15.742f)
                lineToRelative(15.741f, 15.742f)
                lineToRelative(23.611f, -23.611f)
                lineToRelative(-15.741f, -15.742f)
                close()
            }
        }
        .build()
        return _omr!!
    }

private var _omr: ImageVector? = null
