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

public val FlagIcons.Awg: ImageVector
    get() {
        if (_awg != null) {
            return _awg!!
        }
        _awg = Builder(name = "Awg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(77.591f, 0.0f, 147.114f, -34.524f, 194.061f, -89.043f)
                horizontalLineToRelative(-388.122f)
                curveToRelative(46.947f, 54.519f, 116.47f, 89.043f, 194.061f, 89.043f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -141.384f, -114.616f, -256.0f, -256.0f, -256.0f)
                reflectiveCurveToRelative(-256.0f, 114.616f, -256.0f, 256.0f)
                curveToRelative(0.0f, 23.107f, 3.08f, 45.489f, 8.819f, 66.783f)
                horizontalLineToRelative(494.363f)
                curveToRelative(5.738f, -21.294f, 8.818f, -43.676f, 8.818f, -66.783f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.349f, 356.174f)
                curveToRelative(4.935f, 11.596f, 10.704f, 22.748f, 17.225f, 33.391f)
                horizontalLineToRelative(436.852f)
                curveToRelative(6.521f, -10.644f, 12.29f, -21.796f, 17.227f, -33.391f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(117.317f, 161.463f)
                lineToRelative(-50.016f, -22.074f)
                lineToRelative(50.016f, -22.074f)
                lineToRelative(22.073f, -50.015f)
                lineToRelative(22.073f, 50.015f)
                lineToRelative(50.015f, 22.074f)
                lineToRelative(-50.015f, 22.074f)
                lineToRelative(-22.073f, 50.015f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(139.39f, 94.867f)
                lineToRelative(13.631f, 30.889f)
                lineToRelative(30.89f, 13.633f)
                lineToRelative(-30.89f, 13.632f)
                lineToRelative(-13.631f, 30.889f)
                lineToRelative(-13.633f, -30.889f)
                lineToRelative(-30.889f, -13.632f)
                lineToRelative(30.889f, -13.633f)
                close()
            }
        }
        .build()
        return _awg!!
    }

private var _awg: ImageVector? = null
