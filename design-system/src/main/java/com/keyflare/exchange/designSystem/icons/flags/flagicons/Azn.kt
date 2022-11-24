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

public val FlagIcons.Azn: ImageVector
    get() {
        if (_azn != null) {
            return _azn!!
        }
        _azn = Builder(name = "Azn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -31.314f, -5.632f, -61.311f, -15.923f, -89.043f)
                lineToRelative(-240.077f, -11.131f)
                lineToRelative(-240.077f, 11.13f)
                curveToRelative(-10.29f, 27.733f, -15.923f, 57.73f, -15.923f, 89.044f)
                reflectiveCurveToRelative(5.633f, 61.311f, 15.923f, 89.043f)
                lineToRelative(240.077f, 11.131f)
                lineToRelative(240.077f, -11.13f)
                curveToRelative(10.291f, -27.733f, 15.923f, -57.73f, 15.923f, -89.044f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(110.071f, 0.0f, 203.906f, -69.472f, 240.077f, -166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(36.171f, 97.485f, 130.006f, 166.957f, 240.077f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.923f, 166.957f)
                horizontalLineToRelative(480.155f)
                curveToRelative(-36.172f, -97.485f, -130.007f, -166.957f, -240.078f, -166.957f)
                reflectiveCurveToRelative(-203.906f, 69.472f, -240.077f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(261.565f, 328.348f)
                curveToRelative(-39.956f, 0.0f, -72.348f, -32.392f, -72.348f, -72.348f)
                reflectiveCurveToRelative(32.392f, -72.348f, 72.348f, -72.348f)
                curveToRelative(12.458f, 0.0f, 24.181f, 3.15f, 34.415f, 8.696f)
                curveToRelative(-16.056f, -15.701f, -38.012f, -25.392f, -62.241f, -25.392f)
                curveToRelative(-49.178f, 0.0f, -89.043f, 39.866f, -89.043f, 89.043f)
                reflectiveCurveToRelative(39.866f, 89.043f, 89.043f, 89.043f)
                curveToRelative(24.23f, 0.0f, 46.186f, -9.691f, 62.241f, -25.392f)
                curveToRelative(-10.234f, 5.548f, -21.957f, 8.698f, -34.415f, 8.698f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(317.217f, 205.913f)
                lineToRelative(9.583f, 26.951f)
                lineToRelative(25.834f, -12.282f)
                lineToRelative(-12.281f, 25.834f)
                lineToRelative(26.951f, 9.584f)
                lineToRelative(-26.951f, 9.584f)
                lineToRelative(12.281f, 25.834f)
                lineToRelative(-25.834f, -12.282f)
                lineToRelative(-9.583f, 26.951f)
                lineToRelative(-9.582f, -26.951f)
                lineToRelative(-25.835f, 12.282f)
                lineToRelative(12.282f, -25.834f)
                lineToRelative(-26.952f, -9.584f)
                lineToRelative(26.952f, -9.584f)
                lineToRelative(-12.282f, -25.834f)
                lineToRelative(25.835f, 12.282f)
                close()
            }
        }
        .build()
        return _azn!!
    }

private var _azn: ImageVector? = null
