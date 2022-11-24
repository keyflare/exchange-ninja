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

public val FlagIcons.Try: ImageVector
    get() {
        if (_try != null) {
            return _try!!
        }
        _try = Builder(name = "Try", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(245.518f, 209.186f)
                lineToRelative(21.005f, 28.945f)
                lineToRelative(34.017f, -11.03f)
                lineToRelative(-21.038f, 28.92f)
                lineToRelative(21.002f, 28.944f)
                lineToRelative(-34.005f, -11.072f)
                lineToRelative(-21.037f, 28.92f)
                lineToRelative(0.022f, -35.761f)
                lineToRelative(-34.006f, -11.072f)
                lineToRelative(34.018f, -11.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(188.194f, 328.348f)
                curveToRelative(-39.956f, 0.0f, -72.348f, -32.392f, -72.348f, -72.348f)
                reflectiveCurveToRelative(32.392f, -72.348f, 72.348f, -72.348f)
                curveToRelative(12.458f, 0.0f, 24.18f, 3.151f, 34.414f, 8.696f)
                curveToRelative(-16.055f, -15.702f, -38.012f, -25.392f, -62.24f, -25.392f)
                curveToRelative(-49.178f, 0.0f, -89.043f, 39.866f, -89.043f, 89.043f)
                reflectiveCurveToRelative(39.866f, 89.043f, 89.043f, 89.043f)
                curveToRelative(24.23f, 0.0f, 46.186f, -9.691f, 62.24f, -25.392f)
                curveToRelative(-10.234f, 5.547f, -21.956f, 8.698f, -34.414f, 8.698f)
                close()
            }
        }
        .build()
        return _try!!
    }

private var _try: ImageVector? = null
