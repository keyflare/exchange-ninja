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

public val FlagIcons.Bwp: ImageVector
    get() {
        if (_bwp != null) {
            return _bwp!!
        }
        _bwp = Builder(name = "Bwp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.089f, 178.086f)
                curveToRelative(-7.842f, 24.569f, -12.089f, 50.742f, -12.088f, 77.913f)
                curveToRelative(-0.001f, 27.169f, 4.246f, 53.343f, 12.089f, 77.913f)
                lineToRelative(243.911f, 11.132f)
                lineToRelative(243.91f, -11.132f)
                curveToRelative(7.841f, -24.57f, 12.089f, -50.745f, 12.089f, -77.912f)
                curveToRelative(0.0f, -27.17f, -4.247f, -53.345f, -12.089f, -77.914f)
                lineToRelative(-243.911f, -11.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -15.187f, -1.33f, -30.063f, -3.867f, -44.523f)
                horizontalLineToRelative(-504.265f)
                curveToRelative(-2.538f, 14.46f, -3.868f, 29.334f, -3.868f, 44.522f)
                reflectiveCurveToRelative(1.331f, 30.062f, 3.868f, 44.522f)
                horizontalLineToRelative(504.265f)
                curveToRelative(2.536f, -14.461f, 3.867f, -29.335f, 3.867f, -44.521f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.001f, 511.999f)
                curveToRelative(114.216f, 0.0f, 210.946f, -74.803f, 243.91f, -178.088f)
                horizontalLineToRelative(-487.821f)
                curveToRelative(32.965f, 103.284f, 129.696f, 178.086f, 243.911f, 178.088f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.001f, 0.001f)
                curveToRelative(-114.215f, 0.0f, -210.945f, 74.803f, -243.912f, 178.085f)
                lineToRelative(487.82f, 0.001f)
                curveToRelative(-32.963f, -103.283f, -129.694f, -178.088f, -243.908f, -178.086f)
                close()
            }
        }
        .build()
        return _bwp!!
    }

private var _bwp: ImageVector? = null
