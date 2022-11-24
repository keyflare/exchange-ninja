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

public val FlagIcons.Lyd: ImageVector
    get() {
        if (_lyd != null) {
            return _lyd!!
        }
        _lyd = Builder(name = "Lyd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.402f, 144.696f)
                curveToRelative(-16.274f, 33.656f, -25.402f, 71.413f, -25.402f, 111.304f)
                reflectiveCurveToRelative(9.128f, 77.648f, 25.402f, 111.304f)
                lineToRelative(230.598f, 22.261f)
                lineToRelative(230.598f, -22.261f)
                curveToRelative(16.274f, -33.656f, 25.402f, -71.413f, 25.402f, -111.304f)
                reflectiveCurveToRelative(-9.128f, -77.648f, -25.402f, -111.304f)
                lineToRelative(-230.598f, -22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.411f, 367.304f)
                curveToRelative(41.406f, 85.631f, 129.095f, 144.696f, 230.589f, 144.696f)
                curveToRelative(101.493f, 0.0f, 189.183f, -59.065f, 230.589f, -144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.411f, 144.696f)
                horizontalLineToRelative(461.178f)
                curveToRelative(-41.406f, -85.631f, -129.096f, -144.696f, -230.589f, -144.696f)
                curveToRelative(-101.494f, 0.0f, -189.183f, 59.065f, -230.589f, 144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(315.586f, 209.186f)
                lineToRelative(21.004f, 28.945f)
                lineToRelative(34.017f, -11.03f)
                lineToRelative(-21.038f, 28.92f)
                lineToRelative(21.002f, 28.944f)
                lineToRelative(-34.004f, -11.072f)
                lineToRelative(-21.038f, 28.92f)
                lineToRelative(0.022f, -35.761f)
                lineToRelative(-34.006f, -11.072f)
                lineToRelative(34.018f, -11.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(258.261f, 328.348f)
                curveToRelative(-39.956f, 0.0f, -72.348f, -32.392f, -72.348f, -72.348f)
                reflectiveCurveToRelative(32.392f, -72.348f, 72.348f, -72.348f)
                curveToRelative(12.458f, 0.0f, 24.181f, 3.15f, 34.415f, 8.696f)
                curveToRelative(-16.056f, -15.701f, -38.012f, -25.392f, -62.241f, -25.392f)
                curveToRelative(-49.178f, 0.0f, -89.043f, 39.866f, -89.043f, 89.043f)
                reflectiveCurveToRelative(39.866f, 89.043f, 89.043f, 89.043f)
                curveToRelative(24.23f, 0.0f, 46.186f, -9.691f, 62.241f, -25.392f)
                curveToRelative(-10.235f, 5.548f, -21.956f, 8.698f, -34.415f, 8.698f)
                close()
            }
        }
        .build()
        return _lyd!!
    }

private var _lyd: ImageVector? = null
