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

public val FlagIcons.Zmw: ImageVector
    get() {
        if (_zmw != null) {
            return _zmw!!
        }
        _zmw = Builder(name = "Zmw", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(356.174f, 256.0f)
                horizontalLineToRelative(-100.174f)
                verticalLineToRelative(256.0f)
                curveToRelative(29.924f, 0.0f, 58.641f, -5.151f, 85.333f, -14.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(426.666f, 446.793f)
                curveToRelative(52.368f, -46.874f, 85.334f, -114.98f, 85.334f, -190.793f)
                horizontalLineToRelative(-100.174f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(341.333f, 256.0f)
                verticalLineToRelative(241.414f)
                curveToRelative(31.797f, -11.241f, 60.711f, -28.58f, 85.334f, -50.62f)
                verticalLineToRelative(-190.794f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(473.043f, 166.957f)
                horizontalLineToRelative(-66.783f)
                curveToRelative(0.0f, -12.294f, -9.967f, -22.261f, -22.261f, -22.261f)
                reflectiveCurveToRelative(-22.261f, 9.967f, -22.261f, 22.261f)
                horizontalLineToRelative(-66.783f)
                curveToRelative(0.0f, 12.295f, 10.709f, 22.261f, 23.002f, 22.261f)
                horizontalLineToRelative(-0.741f)
                curveToRelative(0.0f, 12.295f, 9.965f, 22.261f, 22.261f, 22.261f)
                curveToRelative(0.0f, 12.295f, 9.965f, 22.261f, 22.261f, 22.261f)
                horizontalLineToRelative(44.522f)
                curveToRelative(12.294f, 0.0f, 22.261f, -9.966f, 22.261f, -22.261f)
                curveToRelative(12.294f, 0.0f, 22.261f, -9.966f, 22.261f, -22.261f)
                horizontalLineToRelative(-0.741f)
                curveToRelative(12.294f, -0.001f, 23.002f, -9.967f, 23.002f, -22.261f)
                close()
            }
        }
        .build()
        return _zmw!!
    }

private var _zmw: ImageVector? = null
