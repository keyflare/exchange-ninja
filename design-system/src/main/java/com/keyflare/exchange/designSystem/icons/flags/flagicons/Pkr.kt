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

public val FlagIcons.Pkr: ImageVector
    get() {
        if (_pkr != null) {
            return _pkr!!
        }
        _pkr = Builder(name = "Pkr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 97.035f, 53.989f, 181.454f, 133.565f, 224.873f)
                verticalLineToRelative(-449.746f)
                curveToRelative(-79.576f, 43.419f, -133.565f, 127.838f, -133.565f, 224.873f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-44.35f, 0.0f, -86.064f, 11.283f, -122.435f, 31.127f)
                verticalLineToRelative(449.745f)
                curveToRelative(36.371f, 19.845f, 78.085f, 31.128f, 122.435f, 31.128f)
                curveToRelative(141.384f, 0.0f, 256.0f, -114.616f, 256.0f, -256.0f)
                reflectiveCurveToRelative(-114.616f, -256.0f, -256.0f, -256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(365.453f, 298.337f)
                curveToRelative(-32.387f, 23.401f, -77.613f, 16.117f, -101.013f, -16.269f)
                curveToRelative(-23.402f, -32.388f, -16.117f, -77.613f, 16.27f, -101.013f)
                curveToRelative(10.098f, -7.296f, 21.444f, -11.609f, 32.987f, -13.108f)
                curveToRelative(-22.207f, -3.321f, -45.682f, 1.683f, -65.319f, 15.872f)
                curveToRelative(-39.86f, 28.802f, -48.827f, 84.463f, -20.026f, 124.325f)
                curveToRelative(28.801f, 39.859f, 84.463f, 48.827f, 124.325f, 20.023f)
                curveToRelative(19.639f, -14.189f, 31.76f, -34.902f, 35.578f, -57.031f)
                curveToRelative(-5.046f, 10.486f, -12.703f, 19.904f, -22.802f, 27.201f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(364.066f, 166.959f)
                lineToRelative(18.244f, 19.661f)
                lineToRelative(24.336f, -11.272f)
                lineToRelative(-13.063f, 23.424f)
                lineToRelative(18.243f, 19.663f)
                lineToRelative(-26.316f, -5.185f)
                lineToRelative(-13.062f, 23.426f)
                lineToRelative(-3.201f, -26.63f)
                lineToRelative(-26.316f, -5.185f)
                lineToRelative(24.337f, -11.272f)
                close()
            }
        }
        .build()
        return _pkr!!
    }

private var _pkr: ImageVector? = null
