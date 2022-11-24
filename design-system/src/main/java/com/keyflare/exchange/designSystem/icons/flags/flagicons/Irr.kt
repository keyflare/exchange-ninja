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

public val FlagIcons.Irr: ImageVector
    get() {
        if (_irr != null) {
            return _irr!!
        }
        _irr = Builder(name = "Irr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(339.147f, 189.217f)
                horizontalLineToRelative(-33.494f)
                curveToRelative(0.277f, 3.681f, 0.434f, 7.395f, 0.434f, 11.13f)
                curveToRelative(0.0f, 24.764f, -6.19f, 48.767f, -16.981f, 65.853f)
                curveToRelative(-3.329f, 5.27f, -8.923f, 12.712f, -16.411f, 17.732f)
                verticalLineToRelative(-94.716f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(94.716f)
                curveToRelative(-7.487f, -5.02f, -13.082f, -12.461f, -16.411f, -17.732f)
                curveToRelative(-10.792f, -17.086f, -16.981f, -41.089f, -16.981f, -65.853f)
                curveToRelative(0.0f, -3.735f, 0.158f, -7.45f, 0.434f, -11.13f)
                horizontalLineToRelative(-33.494f)
                curveToRelative(-0.215f, 3.663f, -0.332f, 7.373f, -0.332f, 11.13f)
                curveToRelative(0.0f, 68.656f, 36.668f, 122.435f, 83.478f, 122.435f)
                reflectiveCurveToRelative(83.478f, -53.779f, 83.478f, -122.435f)
                curveToRelative(0.002f, -3.757f, -0.115f, -7.467f, -0.329f, -11.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(105.739f, 122.435f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(80.337f)
                curveToRelative(-41.405f, -85.631f, -129.102f, -144.696f, -230.595f, -144.696f)
                reflectiveCurveToRelative(-189.19f, 59.065f, -230.598f, 144.696f)
                horizontalLineToRelative(80.337f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(406.261f, 367.304f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-33.394f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-80.337f)
                curveToRelative(41.408f, 85.631f, 129.104f, 144.696f, 230.598f, 144.696f)
                reflectiveCurveToRelative(189.19f, -59.065f, 230.598f, -144.696f)
                close()
            }
        }
        .build()
        return _irr!!
    }

private var _irr: ImageVector? = null
