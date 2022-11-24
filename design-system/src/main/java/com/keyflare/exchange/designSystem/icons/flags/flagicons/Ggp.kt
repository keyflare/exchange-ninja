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

public val FlagIcons.Ggp: ImageVector
    get() {
        if (_ggp != null) {
            return _ggp!!
        }
        _ggp = Builder(name = "Ggp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(509.833f, 222.609f)
                horizontalLineToRelative(-220.44f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(-220.442f)
                curveToRelative(-10.931f, -1.423f, -22.075f, -2.167f, -33.392f, -2.167f)
                reflectiveCurveToRelative(-22.461f, 0.744f, -33.391f, 2.167f)
                verticalLineToRelative(220.442f)
                horizontalLineToRelative(-220.442f)
                curveToRelative(-1.423f, 10.93f, -2.167f, 22.074f, -2.167f, 33.391f)
                reflectiveCurveToRelative(0.744f, 22.461f, 2.167f, 33.391f)
                horizontalLineToRelative(220.44f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(220.442f)
                curveToRelative(10.931f, 1.423f, 22.075f, 2.167f, 33.392f, 2.167f)
                reflectiveCurveToRelative(22.461f, -0.743f, 33.391f, -2.167f)
                verticalLineToRelative(-220.439f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(220.442f)
                curveToRelative(1.423f, -10.931f, 2.167f, -22.075f, 2.167f, -33.392f)
                reflectiveCurveToRelative(-0.744f, -22.461f, -2.167f, -33.391f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(328.348f, 267.13f)
                lineToRelative(16.695f, 11.131f)
                verticalLineToRelative(-44.522f)
                lineToRelative(-16.695f, 11.131f)
                horizontalLineToRelative(-61.218f)
                verticalLineToRelative(-61.218f)
                lineToRelative(11.131f, -16.695f)
                horizontalLineToRelative(-44.522f)
                lineToRelative(11.131f, 16.695f)
                verticalLineToRelative(61.218f)
                horizontalLineToRelative(-61.218f)
                lineToRelative(-16.695f, -11.131f)
                verticalLineToRelative(44.522f)
                lineToRelative(16.695f, -11.131f)
                horizontalLineToRelative(61.218f)
                verticalLineToRelative(61.218f)
                lineToRelative(-11.131f, 16.695f)
                horizontalLineToRelative(44.522f)
                lineToRelative(-11.131f, -16.695f)
                verticalLineToRelative(-61.218f)
                close()
            }
        }
        .build()
        return _ggp!!
    }

private var _ggp: ImageVector? = null
