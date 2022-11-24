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

public val FlagIcons.Brl: ImageVector
    get() {
        if (_brl != null) {
            return _brl!!
        }
        _brl = Builder(name = "Brl", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 100.174f)
                lineToRelative(211.478f, 155.826f)
                lineToRelative(-211.478f, 155.826f)
                lineToRelative(-211.478f, -155.826f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-89.043f, 0.0f)
                arcToRelative(89.043f, 89.043f, 0.0f, true, true, 178.086f, 0.0f)
                arcToRelative(89.043f, 89.043f, 0.0f, true, true, -178.086f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(211.478f, 250.435f)
                curveToRelative(-15.484f, 0.0f, -30.427f, 2.355f, -44.493f, 6.725f)
                curveToRelative(0.623f, 48.64f, 40.227f, 87.884f, 89.015f, 87.884f)
                curveToRelative(30.168f, 0.0f, 56.812f, -15.017f, 72.919f, -37.968f)
                curveToRelative(-27.557f, -34.497f, -69.958f, -56.641f, -117.441f, -56.641f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(343.393f, 273.06f)
                curveToRelative(1.072f, -5.524f, 1.651f, -11.223f, 1.651f, -17.06f)
                curveToRelative(0.0f, -49.178f, -39.866f, -89.043f, -89.043f, -89.043f)
                curveToRelative(-36.694f, 0.0f, -68.194f, 22.201f, -81.826f, 53.899f)
                curveToRelative(12.05f, -2.497f, 24.526f, -3.812f, 37.305f, -3.812f)
                curveToRelative(51.717f, -0.001f, 98.503f, 21.497f, 131.913f, 56.016f)
                close()
            }
        }
        .build()
        return _brl!!
    }

private var _brl: ImageVector? = null
