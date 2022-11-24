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

public val FlagIcons.Btn: ImageVector
    get() {
        if (_btn != null) {
            return _btn!!
        }
        _btn = Builder(name = "Btn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 437.02f)
                curveToRelative(-99.974f, -99.974f, -99.974f, -262.064f, 0.0f, -362.039f)
                reflectiveCurveToRelative(262.065f, -99.974f, 362.04f, 0.0f)
                curveToRelative(0.0f, 0.035f, 67.968f, 230.057f, -32.007f, 330.033f)
                curveToRelative(-99.973f, 99.975f, -329.963f, 32.076f, -330.033f, 32.006f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 437.02f)
                curveToRelative(99.974f, 99.974f, 262.065f, 99.974f, 362.04f, 0.0f)
                reflectiveCurveToRelative(99.974f, -262.064f, 0.0f, -362.039f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(400.816f, 144.695f)
                verticalLineToRelative(-44.522f)
                horizontalLineToRelative(-85.336f)
                lineToRelative(-6.52f, 6.519f)
                curveToRelative(-23.189f, 23.189f, -19.288f, 50.241f, -16.44f, 69.993f)
                curveToRelative(2.641f, 18.323f, 2.958f, 25.342f, -3.856f, 32.157f)
                curveToRelative(-6.814f, 6.813f, -13.835f, 6.497f, -32.156f, 3.854f)
                curveToRelative(-19.752f, -2.847f, -46.803f, -6.748f, -69.992f, 16.44f)
                curveToRelative(-23.188f, 23.188f, -19.285f, 50.238f, -16.435f, 69.989f)
                curveToRelative(2.643f, 18.321f, 2.961f, 25.34f, -3.851f, 32.151f)
                curveToRelative(-6.813f, 6.811f, -13.834f, 6.494f, -32.151f, 3.851f)
                curveToRelative(-7.142f, -1.031f, -14.527f, -2.095f, -22.411f, -2.183f)
                lineToRelative(-0.489f, 44.52f)
                curveToRelative(4.934f, 0.055f, 10.573f, 0.867f, 16.543f, 1.729f)
                curveToRelative(7.068f, 1.021f, 15.068f, 2.175f, 23.494f, 2.175f)
                curveToRelative(8.732f, 0.0f, 17.918f, -1.245f, 26.99f, -5.162f)
                verticalLineToRelative(35.621f)
                horizontalLineToRelative(66.783f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(22.261f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(-17.792f)
                curveToRelative(0.844f, -10.802f, -0.64f, -21.146f, -1.92f, -30.014f)
                curveToRelative(-2.643f, -18.321f, -2.961f, -25.34f, 3.851f, -32.15f)
                curveToRelative(6.814f, -6.814f, 13.832f, -6.498f, 32.156f, -3.856f)
                curveToRelative(14.393f, 2.075f, 32.661f, 4.697f, 50.488f, -2.999f)
                verticalLineToRelative(35.627f)
                horizontalLineToRelative(66.783f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(22.261f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(-17.791f)
                curveToRelative(0.845f, -10.803f, -0.638f, -21.146f, -1.918f, -30.017f)
                curveToRelative(-1.845f, -12.801f, -2.557f, -20.085f, -0.493f, -25.636f)
                horizontalLineToRelative(64.723f)
                close()
            }
        }
        .build()
        return _btn!!
    }

private var _btn: ImageVector? = null
