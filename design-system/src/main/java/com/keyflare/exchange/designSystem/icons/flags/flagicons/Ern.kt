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

public val FlagIcons.Ern: ImageVector
    get() {
        if (_ern != null) {
            return _ern!!
        }
        _ern = Builder(name = "Ern", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(233.739f, 233.739f)
                reflectiveCurveToRelative(-158.609f, 203.317f, -158.759f, 203.28f)
                curveToRelative(46.326f, 46.327f, 110.327f, 74.981f, 181.02f, 74.981f)
                curveToRelative(141.384f, 0.0f, 256.0f, -114.616f, 256.0f, -256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(233.739f, 256.0f)
                reflectiveCurveToRelative(-158.609f, -181.055f, -158.759f, -181.019f)
                curveToRelative(46.326f, -46.327f, 110.327f, -74.981f, 181.02f, -74.981f)
                curveToRelative(141.384f, 0.0f, 256.0f, 114.616f, 256.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 74.98f)
                curveToRelative(-99.974f, 99.974f, -99.974f, 262.065f, 0.0f, 362.04f)
                curveToRelative(-0.007f, 0.041f, 437.02f, -181.02f, 437.02f, -181.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(133.565f, 150.261f)
                curveToRelative(-49.099f, 0.0f, -89.043f, 39.945f, -89.043f, 89.043f)
                verticalLineToRelative(33.391f)
                curveToRelative(0.0f, 49.099f, 39.945f, 89.043f, 89.043f, 89.043f)
                reflectiveCurveToRelative(89.043f, -39.945f, 89.043f, -89.043f)
                verticalLineToRelative(-33.391f)
                curveToRelative(0.001f, -49.098f, -39.944f, -89.043f, -89.043f, -89.043f)
                close()
                moveTo(189.217f, 272.696f)
                curveToRelative(0.0f, 24.872f, -16.402f, 45.981f, -38.957f, 53.09f)
                verticalLineToRelative(-36.394f)
                lineToRelative(23.624f, -23.624f)
                lineToRelative(-23.611f, -23.611f)
                lineToRelative(-0.013f, -8.403f)
                verticalLineToRelative(-11.144f)
                horizontalLineToRelative(-33.39f)
                verticalLineToRelative(33.39f)
                lineToRelative(-23.608f, 23.607f)
                lineToRelative(23.608f, 23.607f)
                verticalLineToRelative(22.573f)
                curveToRelative(-22.555f, -7.109f, -38.957f, -28.218f, -38.957f, -53.09f)
                verticalLineToRelative(-33.391f)
                curveToRelative(0.0f, -30.687f, 24.966f, -55.652f, 55.652f, -55.652f)
                reflectiveCurveToRelative(55.652f, 24.966f, 55.652f, 55.652f)
                close()
            }
        }
        .build()
        return _ern!!
    }

private var _ern: ImageVector? = null
