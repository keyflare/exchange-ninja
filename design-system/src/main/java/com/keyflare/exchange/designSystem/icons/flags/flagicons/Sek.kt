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

public val FlagIcons.Sek: ImageVector
    get() {
        if (_sek != null) {
            return _sek!!
        }
        _sek = Builder(name = "Sek", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(200.349f, 222.609f)
                horizontalLineToRelative(309.484f)
                curveToRelative(-16.363f, -125.607f, -123.766f, -222.609f, -253.833f, -222.609f)
                curveToRelative(-19.114f, 0.0f, -37.733f, 2.113f, -55.652f, 6.085f)
                verticalLineToRelative(216.524f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(133.565f, 222.608f)
                verticalLineToRelative(-191.481f)
                curveToRelative(-70.294f, 38.354f, -120.615f, 108.705f, -131.398f, 191.482f)
                horizontalLineToRelative(131.398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(133.564f, 289.391f)
                horizontalLineToRelative(-131.397f)
                curveToRelative(10.783f, 82.777f, 61.104f, 153.128f, 131.398f, 191.481f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(200.348f, 289.392f)
                verticalLineToRelative(216.523f)
                curveToRelative(17.919f, 3.972f, 36.538f, 6.085f, 55.652f, 6.085f)
                curveToRelative(130.067f, 0.0f, 237.47f, -97.002f, 253.833f, -222.609f)
                horizontalLineToRelative(-309.485f)
                close()
            }
        }
        .build()
        return _sek!!
    }

private var _sek: ImageVector? = null
