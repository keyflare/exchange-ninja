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

public val FlagIcons.Jep: ImageVector
    get() {
        if (_jep != null) {
            return _jep!!
        }
        _jep = Builder(name = "Jep", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(459.098f, 411.875f)
                lineToRelative(-155.875f, -155.874f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(155.876f, -155.877f)
                curveToRelative(-6.723f, -8.736f, -14.077f, -17.141f, -22.078f, -25.144f)
                curveToRelative(-8.003f, -8.002f, -16.407f, -15.357f, -25.144f, -22.078f)
                lineToRelative(-155.875f, 155.875f)
                lineToRelative(-0.001f, 0.001f)
                lineToRelative(-155.875f, -155.876f)
                curveToRelative(-8.735f, 6.722f, -17.141f, 14.075f, -25.144f, 22.078f)
                reflectiveCurveToRelative(-15.357f, 16.408f, -22.078f, 25.144f)
                lineToRelative(155.875f, 155.874f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(-155.877f, 155.877f)
                curveToRelative(6.723f, 8.736f, 14.077f, 17.141f, 22.078f, 25.144f)
                curveToRelative(8.003f, 8.002f, 16.407f, 15.357f, 25.144f, 22.078f)
                lineToRelative(155.876f, -155.875f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(155.875f, 155.875f)
                curveToRelative(8.735f, -6.722f, 17.141f, -14.076f, 25.144f, -22.078f)
                curveToRelative(8.003f, -8.003f, 15.356f, -16.408f, 22.078f, -25.144f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(211.478f, 77.913f)
                lineToRelative(44.522f, 11.13f)
                lineToRelative(44.522f, -11.13f)
                verticalLineToRelative(-37.843f)
                lineToRelative(-17.809f, 8.904f)
                lineToRelative(-26.713f, -26.713f)
                lineToRelative(-26.713f, 26.713f)
                lineToRelative(-17.809f, -8.904f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(211.478f, 77.913f)
                verticalLineToRelative(27.828f)
                curveToRelative(0.0f, 34.08f, 44.522f, 44.522f, 44.522f, 44.522f)
                reflectiveCurveToRelative(44.522f, -10.443f, 44.522f, -44.522f)
                verticalLineToRelative(-27.828f)
                close()
            }
        }
        .build()
        return _jep!!
    }

private var _jep: ImageVector? = null
