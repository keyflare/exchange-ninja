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

public val FlagIcons.Zar: ImageVector
    get() {
        if (_zar != null) {
            return _zar!!
        }
        _zar = Builder(name = "Zar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(74.98f, 437.02f)
                curveToRelative(-99.974f, -99.975f, -99.974f, -262.065f, 0.0f, -362.04f)
                curveToRelative(-0.007f, 0.011f, 147.629f, 181.02f, 147.629f, 181.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(222.609f, 256.0f)
                lineToRelative(-188.656f, -127.487f)
                curveToRelative(-5.849f, 10.167f, -11.007f, 20.779f, -15.439f, 31.763f)
                lineToRelative(95.509f, 95.725f)
                lineToRelative(-95.506f, 95.73f)
                curveToRelative(4.428f, 10.976f, 9.581f, 21.581f, 15.426f, 31.741f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(509.833f, 222.609f)
                horizontalLineToRelative(-287.231f)
                lineToRelative(-147.624f, -147.625f)
                curveToRelative(-15.908f, 15.908f, -29.729f, 33.899f, -41.025f, 53.53f)
                lineToRelative(127.239f, 127.486f)
                lineToRelative(-127.249f, 127.47f)
                curveToRelative(11.296f, 19.636f, 25.123f, 37.633f, 41.035f, 53.545f)
                lineToRelative(147.624f, -147.624f)
                horizontalLineToRelative(287.231f)
                curveToRelative(1.423f, -10.93f, 2.167f, -22.074f, 2.167f, -33.391f)
                reflectiveCurveToRelative(-0.744f, -22.461f, -2.167f, -33.391f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(100.138f, 459.077f)
                curveToRelative(43.169f, 33.182f, 97.206f, 52.923f, 155.862f, 52.923f)
                curveToRelative(118.279f, 0.0f, 217.805f, -80.221f, 247.181f, -189.217f)
                horizontalLineToRelative(-266.748f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(503.181f, 189.217f)
                curveToRelative(-29.376f, -108.996f, -128.902f, -189.217f, -247.181f, -189.217f)
                curveToRelative(-58.656f, 0.0f, -112.693f, 19.741f, -155.862f, 52.923f)
                lineToRelative(136.294f, 136.294f)
                close()
            }
        }
        .build()
        return _zar!!
    }

private var _zar: ImageVector? = null
