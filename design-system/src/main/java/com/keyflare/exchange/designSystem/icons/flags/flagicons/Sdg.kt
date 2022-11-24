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

public val FlagIcons.Sdg: ImageVector
    get() {
        if (_sdg != null) {
            return _sdg!!
        }
        _sdg = Builder(name = "Sdg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.402f, 144.696f)
                curveToRelative(-16.274f, 33.656f, -25.402f, 71.413f, -25.402f, 111.304f)
                reflectiveCurveToRelative(9.128f, 77.648f, 25.402f, 111.304f)
                lineToRelative(230.598f, 22.261f)
                lineToRelative(230.598f, -22.261f)
                curveToRelative(16.274f, -33.656f, 25.402f, -71.413f, 25.402f, -111.304f)
                reflectiveCurveToRelative(-9.128f, -77.648f, -25.402f, -111.304f)
                lineToRelative(-230.598f, -22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.411f, 367.304f)
                curveToRelative(41.406f, 85.631f, 129.095f, 144.696f, 230.589f, 144.696f)
                reflectiveCurveToRelative(189.183f, -59.065f, 230.589f, -144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.411f, 144.696f)
                horizontalLineToRelative(461.178f)
                curveToRelative(-41.406f, -85.631f, -129.095f, -144.696f, -230.589f, -144.696f)
                reflectiveCurveToRelative(-189.183f, 59.065f, -230.589f, 144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 74.98f)
                curveToRelative(-99.974f, 99.974f, -99.974f, 262.065f, 0.0f, 362.04f)
                curveToRelative(41.313f, -41.313f, 81.046f, -81.046f, 181.02f, -181.02f)
                close()
            }
        }
        .build()
        return _sdg!!
    }

private var _sdg: ImageVector? = null
