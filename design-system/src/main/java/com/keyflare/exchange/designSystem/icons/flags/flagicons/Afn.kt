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

public val FlagIcons.Afn: ImageVector
    get() {
        if (_afn != null) {
            return _afn!!
        }
        _afn = Builder(name = "Afn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(367.304f, 25.402f)
                curveToRelative(-33.656f, -16.274f, -71.414f, -25.402f, -111.304f, -25.402f)
                reflectiveCurveToRelative(-77.648f, 9.128f, -111.304f, 25.402f)
                lineToRelative(-22.261f, 230.598f)
                lineToRelative(22.261f, 230.598f)
                curveToRelative(33.656f, 16.274f, 71.414f, 25.402f, 111.304f, 25.402f)
                reflectiveCurveToRelative(77.648f, -9.128f, 111.304f, -25.402f)
                lineToRelative(22.261f, -230.598f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(144.696f, 25.411f)
                curveToRelative(-85.63f, 41.407f, -144.696f, 129.096f, -144.696f, 230.589f)
                reflectiveCurveToRelative(59.066f, 189.182f, 144.696f, 230.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(367.304f, 25.411f)
                verticalLineToRelative(461.178f)
                curveToRelative(85.63f, -41.407f, 144.696f, -129.096f, 144.696f, -230.589f)
                reflectiveCurveToRelative(-59.066f, -189.182f, -144.696f, -230.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 166.957f)
                curveToRelative(-49.178f, 0.0f, -89.043f, 39.866f, -89.043f, 89.043f)
                reflectiveCurveToRelative(39.866f, 89.043f, 89.043f, 89.043f)
                reflectiveCurveToRelative(89.043f, -39.866f, 89.043f, -89.043f)
                reflectiveCurveToRelative(-39.865f, -89.043f, -89.043f, -89.043f)
                close()
                moveTo(256.0f, 311.652f)
                curveToRelative(-30.736f, 0.0f, -55.652f, -24.917f, -55.652f, -55.652f)
                reflectiveCurveToRelative(24.917f, -55.652f, 55.652f, -55.652f)
                reflectiveCurveToRelative(55.652f, 24.917f, 55.652f, 55.652f)
                reflectiveCurveToRelative(-24.916f, 55.652f, -55.652f, 55.652f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 222.609f)
                curveToRelative(-12.295f, 0.0f, -22.261f, 9.966f, -22.261f, 22.261f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(44.522f)
                verticalLineToRelative(-33.391f)
                curveToRelative(0.0f, -12.295f, -9.966f, -22.261f, -22.261f, -22.261f)
                close()
            }
        }
        .build()
        return _afn!!
    }

private var _afn: ImageVector? = null
