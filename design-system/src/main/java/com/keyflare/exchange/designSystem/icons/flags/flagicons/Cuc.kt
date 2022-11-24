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

public val FlagIcons.Cuc: ImageVector
    get() {
        if (_cuc != null) {
            return _cuc!!
        }
        _cuc = Builder(name = "Cuc", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.001f, 44.522f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(422.956f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(-211.477f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.999f, 256.0f)
                moveToRelative(-255.999f, 0.0f)
                arcToRelative(255.999f, 255.999f, 0.0f, true, true, 511.998f, 0.0f)
                arcToRelative(255.999f, 255.999f, 0.0f, true, true, -511.998f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.001f, 0.002f)
                curveToRelative(-83.752f, 0.0f, -158.106f, 40.223f, -204.811f, 102.4f)
                horizontalLineToRelative(409.621f)
                curveToRelative(-46.704f, -62.178f, -121.059f, -102.4f, -204.81f, -102.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.001f, 511.999f)
                curveToRelative(83.752f, 0.0f, 158.106f, -40.223f, 204.811f, -102.4f)
                horizontalLineToRelative(-409.622f)
                curveToRelative(46.704f, 62.178f, 121.059f, 102.4f, 204.811f, 102.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.001f, 256.001f)
                curveToRelative(0.0f, 17.535f, 1.768f, 34.657f, 5.127f, 51.2f)
                horizontalLineToRelative(501.747f)
                curveToRelative(3.359f, -16.543f, 5.126f, -33.665f, 5.126f, -51.2f)
                reflectiveCurveToRelative(-1.768f, -34.657f, -5.126f, -51.2f)
                horizontalLineToRelative(-501.747f)
                curveToRelative(-3.359f, 16.543f, -5.127f, 33.665f, -5.127f, 51.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.981f, 74.982f)
                curveToRelative(-99.973f, 99.973f, -99.973f, 262.064f, 0.0f, 362.039f)
                curveToRelative(41.313f, -41.313f, 81.045f, -81.046f, 181.019f, -181.019f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(103.611f, 189.219f)
                lineToRelative(16.574f, 51.015f)
                horizontalLineToRelative(53.646f)
                lineToRelative(-43.397f, 31.532f)
                lineToRelative(16.574f, 51.016f)
                lineToRelative(-43.397f, -31.53f)
                lineToRelative(-43.399f, 31.53f)
                lineToRelative(16.578f, -51.016f)
                lineToRelative(-43.398f, -31.532f)
                horizontalLineToRelative(53.642f)
                close()
            }
        }
        .build()
        return _cuc!!
    }

private var _cuc: ImageVector? = null
