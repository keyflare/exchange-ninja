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

public val FlagIcons.Nio: ImageVector
    get() {
        if (_nio != null) {
            return _nio!!
        }
        _nio = Builder(name = "Nio", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-101.494f, 0.0f, -189.19f, 59.065f, -230.598f, 144.696f)
                horizontalLineToRelative(461.195f)
                curveToRelative(-41.407f, -85.631f, -129.104f, -144.696f, -230.597f, -144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(101.493f, 0.0f, 189.19f, -59.065f, 230.598f, -144.696f)
                horizontalLineToRelative(-461.196f)
                curveToRelative(41.408f, 85.631f, 129.104f, 144.696f, 230.598f, 144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 178.087f)
                curveToRelative(-43.03f, 0.0f, -77.913f, 34.883f, -77.913f, 77.913f)
                reflectiveCurveToRelative(34.883f, 77.913f, 77.913f, 77.913f)
                reflectiveCurveToRelative(77.913f, -34.883f, 77.913f, -77.913f)
                reflectiveCurveToRelative(-34.883f, -77.913f, -77.913f, -77.913f)
                close()
                moveTo(256.0f, 300.522f)
                curveToRelative(-24.588f, 0.0f, -44.522f, -19.932f, -44.522f, -44.522f)
                reflectiveCurveToRelative(19.933f, -44.522f, 44.522f, -44.522f)
                reflectiveCurveToRelative(44.522f, 19.932f, 44.522f, 44.522f)
                reflectiveCurveToRelative(-19.934f, 44.522f, -44.522f, 44.522f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(294.558f, 267.13f)
                lineToRelative(-38.558f, -11.13f)
                lineToRelative(-38.558f, 11.13f)
                lineToRelative(-12.852f, 22.261f)
                horizontalLineToRelative(102.819f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 200.348f)
                lineToRelative(-25.705f, 44.522f)
                lineToRelative(25.705f, 11.13f)
                lineToRelative(25.705f, -11.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(217.442f, 267.13f)
                horizontalLineToRelative(77.116f)
                lineToRelative(-12.853f, -22.26f)
                horizontalLineToRelative(-51.41f)
                close()
            }
        }
        .build()
        return _nio!!
    }

private var _nio: ImageVector? = null
