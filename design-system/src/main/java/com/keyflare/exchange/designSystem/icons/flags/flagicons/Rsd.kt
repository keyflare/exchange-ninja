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

public val FlagIcons.Rsd: ImageVector
    get() {
        if (_rsd != null) {
            return _rsd!!
        }
        _rsd = Builder(name = "Rsd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-141.384f, 0.0f, -256.0f, 114.616f, -256.0f, 256.0f)
                curveToRelative(0.0f, 31.314f, 5.633f, 61.311f, 15.923f, 89.043f)
                horizontalLineToRelative(480.155f)
                curveToRelative(10.29f, -27.732f, 15.922f, -57.729f, 15.922f, -89.043f)
                curveToRelative(0.0f, -141.384f, -114.616f, -256.0f, -256.0f, -256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-110.071f, 0.0f, -203.906f, 69.472f, -240.077f, 166.957f)
                horizontalLineToRelative(480.155f)
                curveToRelative(-36.172f, -97.485f, -130.007f, -166.957f, -240.078f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(66.198f, 144.696f)
                verticalLineToRelative(127.706f)
                curveToRelative(0.0f, 72.644f, 94.901f, 94.903f, 94.901f, 94.903f)
                reflectiveCurveToRelative(94.9f, -22.259f, 94.9f, -94.903f)
                verticalLineToRelative(-127.706f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(105.446f, 166.957f)
                horizontalLineToRelative(111.305f)
                verticalLineToRelative(-44.522f)
                lineToRelative(-22.261f, 11.13f)
                lineToRelative(-33.391f, -33.391f)
                lineToRelative(-33.392f, 33.391f)
                lineToRelative(-22.261f, -11.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(233.739f, 290.183f)
                lineToRelative(-72.348f, -72.348f)
                lineToRelative(-72.348f, 72.348f)
                lineToRelative(23.611f, 23.611f)
                lineToRelative(48.737f, -48.737f)
                lineToRelative(48.737f, 48.737f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(233.739f, 222.609f)
                horizontalLineToRelative(-33.756f)
                curveToRelative(1.898f, -3.276f, 3.002f, -7.07f, 3.002f, -11.128f)
                curveToRelative(0.0f, -12.296f, -9.967f, -22.261f, -22.261f, -22.261f)
                curveToRelative(-8.495f, 0.0f, -15.872f, 4.758f, -19.625f, 11.753f)
                curveToRelative(-3.753f, -6.994f, -11.13f, -11.753f, -19.625f, -11.753f)
                curveToRelative(-12.294f, 0.0f, -22.261f, 9.965f, -22.261f, 22.261f)
                curveToRelative(0.0f, 4.058f, 1.104f, 7.853f, 3.002f, 11.128f)
                horizontalLineToRelative(-33.172f)
                curveToRelative(0.0f, 12.295f, 10.709f, 22.261f, 23.002f, 22.261f)
                horizontalLineToRelative(-0.741f)
                curveToRelative(0.0f, 12.295f, 9.966f, 22.261f, 22.261f, 22.261f)
                curveToRelative(0.0f, 10.886f, 7.818f, 19.93f, 18.143f, 21.866f)
                lineToRelative(-17.54f, 39.602f)
                curveToRelative(8.406f, 3.417f, 17.592f, 5.315f, 27.224f, 5.315f)
                reflectiveCurveToRelative(18.818f, -1.898f, 27.224f, -5.315f)
                lineToRelative(-17.54f, -39.602f)
                curveToRelative(10.325f, -1.934f, 18.143f, -10.979f, 18.143f, -21.866f)
                curveToRelative(12.295f, 0.0f, 22.261f, -9.966f, 22.261f, -22.261f)
                horizontalLineToRelative(-0.741f)
                curveToRelative(12.292f, 0.0f, 23.0f, -9.967f, 23.0f, -22.261f)
                close()
            }
        }
        .build()
        return _rsd!!
    }

private var _rsd: ImageVector? = null
