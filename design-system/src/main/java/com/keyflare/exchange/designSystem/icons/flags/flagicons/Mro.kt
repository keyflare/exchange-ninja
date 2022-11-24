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

public val FlagIcons.Mro: ImageVector
    get() {
        if (_mro != null) {
            return _mro!!
        }
        _mro = Builder(name = "Mro", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(256.0f, 295.751f)
                curveToRelative(-42.626f, 0.0f, -78.236f, -29.958f, -86.973f, -69.963f)
                curveToRelative(-1.342f, 6.15f, -2.07f, 12.527f, -2.07f, 19.081f)
                curveToRelative(0.0f, 49.179f, 39.865f, 89.043f, 89.043f, 89.043f)
                reflectiveCurveToRelative(89.043f, -39.865f, 89.043f, -89.043f)
                curveToRelative(0.0f, -6.554f, -0.728f, -12.931f, -2.07f, -19.082f)
                curveToRelative(-8.737f, 40.007f, -44.347f, 69.964f, -86.973f, 69.964f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(255.999f, 178.087f)
                lineToRelative(8.288f, 25.509f)
                horizontalLineToRelative(26.823f)
                lineToRelative(-21.699f, 15.765f)
                lineToRelative(8.288f, 25.509f)
                lineToRelative(-21.7f, -15.766f)
                lineToRelative(-21.699f, 15.766f)
                lineToRelative(8.289f, -25.509f)
                lineToRelative(-21.699f, -15.765f)
                horizontalLineToRelative(26.821f)
                close()
            }
        }
        .build()
        return _mro!!
    }

private var _mro: ImageVector? = null
