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

public val FlagIcons.Gyd: ImageVector
    get() {
        if (_gyd != null) {
            return _gyd!!
        }
        _gyd = Builder(name = "Gyd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-45.261f, 0.0f, -87.769f, 11.762f, -124.661f, 32.372f)
                verticalLineToRelative(447.256f)
                curveToRelative(36.893f, 20.61f, 79.4f, 32.372f, 124.661f, 32.372f)
                curveToRelative(141.384f, 0.0f, 256.0f, -114.616f, 256.0f, -256.0f)
                reflectiveCurveToRelative(-114.616f, -256.0f, -256.0f, -256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(132.092f, 31.951f)
                curveToRelative(-16.105f, 8.925f, -31.143f, 19.533f, -44.882f, 31.593f)
                curveToRelative(1.389f, -1.218f, 2.792f, -2.422f, 4.206f, -3.61f)
                lineToRelative(196.065f, 196.066f)
                lineToRelative(-196.066f, 196.066f)
                curveToRelative(-1.415f, -1.188f, -2.817f, -2.392f, -4.206f, -3.61f)
                curveToRelative(13.739f, 12.06f, 28.778f, 22.667f, 44.882f, 31.593f)
                lineToRelative(379.909f, -224.049f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(110.47f, 45.382f)
                curveToRelative(-7.807f, 5.406f, -15.305f, 11.223f, -22.45f, 17.44f)
                lineToRelative(167.98f, 193.178f)
                lineToRelative(-167.981f, 193.178f)
                curveToRelative(7.145f, 6.217f, 14.643f, 12.035f, 22.45f, 17.44f)
                lineToRelative(357.709f, -210.618f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(91.415f, 59.934f)
                curveToRelative(-5.691f, 4.782f, -11.183f, 9.795f, -16.435f, 15.046f)
                lineToRelative(158.759f, 181.02f)
                lineToRelative(-158.759f, 181.02f)
                curveToRelative(5.252f, 5.252f, 10.743f, 10.266f, 16.435f, 15.046f)
                lineToRelative(196.066f, -196.066f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 74.98f)
                curveToRelative(-99.974f, 99.974f, -99.974f, 262.065f, 0.0f, 362.04f)
                curveToRelative(41.313f, -41.313f, 81.046f, -81.046f, 181.02f, -181.02f)
                close()
            }
        }
        .build()
        return _gyd!!
    }

private var _gyd: ImageVector? = null
