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

public val FlagIcons.Jod: ImageVector
    get() {
        if (_jod != null) {
            return _jod!!
        }
        _jod = Builder(name = "Jod", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(155.826f, 166.957f)
                horizontalLineToRelative(340.25f)
                curveToRelative(-36.17f, -97.485f, -130.006f, -166.957f, -240.076f, -166.957f)
                curveToRelative(-70.694f, 0.0f, -134.687f, 28.659f, -181.011f, 74.989f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(155.826f, 345.043f)
                horizontalLineToRelative(340.25f)
                curveToRelative(-36.17f, 97.485f, -130.006f, 166.957f, -240.076f, 166.957f)
                curveToRelative(-70.694f, 0.0f, -134.687f, -28.659f, -181.011f, -74.989f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 74.98f)
                curveToRelative(-99.974f, 99.974f, -99.974f, 262.065f, 0.0f, 362.04f)
                curveToRelative(41.313f, -41.313f, 81.046f, -81.046f, 181.02f, -181.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(101.605f, 200.348f)
                lineToRelative(14.049f, 29.379f)
                lineToRelative(31.729f, -7.333f)
                lineToRelative(-14.21f, 29.301f)
                lineToRelative(25.515f, 20.234f)
                lineToRelative(-31.767f, 7.159f)
                lineToRelative(0.088f, 32.564f)
                lineToRelative(-25.404f, -20.373f)
                lineToRelative(-25.405f, 20.373f)
                lineToRelative(0.089f, -32.564f)
                lineToRelative(-31.767f, -7.159f)
                lineToRelative(25.514f, -20.234f)
                lineToRelative(-14.208f, -29.301f)
                lineToRelative(31.727f, 7.333f)
                close()
            }
        }
        .build()
        return _jod!!
    }

private var _jod: ImageVector? = null
