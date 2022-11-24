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

public val FlagIcons.Nok: ImageVector
    get() {
        if (_nok != null) {
            return _nok!!
        }
        _nok = Builder(name = "Nok", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(8.819f, 322.783f)
                curveToRelative(14.812f, 54.959f, 47.457f, 102.593f, 91.355f, 136.322f)
                verticalLineToRelative(-136.322f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(233.739f, 511.026f)
                curveToRelative(7.338f, 0.632f, 14.759f, 0.974f, 22.261f, 0.974f)
                curveToRelative(118.279f, 0.0f, 217.805f, -80.221f, 247.181f, -189.217f)
                horizontalLineToRelative(-269.442f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(503.181f, 189.217f)
                curveToRelative(-29.376f, -108.996f, -128.902f, -189.217f, -247.181f, -189.217f)
                curveToRelative(-7.502f, 0.0f, -14.923f, 0.342f, -22.261f, 0.974f)
                verticalLineToRelative(188.243f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(100.174f, 52.895f)
                curveToRelative(-43.898f, 33.73f, -76.543f, 81.363f, -91.355f, 136.322f)
                horizontalLineToRelative(91.355f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(509.833f, 222.609f)
                horizontalLineToRelative(-309.484f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(-216.524f)
                curveToRelative(-23.658f, 5.246f, -46.087f, 13.749f, -66.783f, 25.042f)
                verticalLineToRelative(191.48f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(-131.398f)
                curveToRelative(-1.425f, 10.931f, -2.167f, 22.075f, -2.167f, 33.392f)
                reflectiveCurveToRelative(0.742f, 22.461f, 2.167f, 33.391f)
                horizontalLineToRelative(131.397f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(191.481f)
                curveToRelative(20.696f, 11.292f, 43.125f, 19.797f, 66.783f, 25.042f)
                verticalLineToRelative(-216.52f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(309.485f)
                curveToRelative(1.423f, -10.931f, 2.167f, -22.075f, 2.167f, -33.392f)
                reflectiveCurveToRelative(-0.744f, -22.461f, -2.167f, -33.391f)
                close()
            }
        }
        .build()
        return _nok!!
    }

private var _nok: ImageVector? = null
