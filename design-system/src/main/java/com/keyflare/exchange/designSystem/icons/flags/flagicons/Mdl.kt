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

public val FlagIcons.Mdl: ImageVector
    get() {
        if (_mdl != null) {
            return _mdl!!
        }
        _mdl = Builder(name = "Mdl", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
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
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(144.696f, 25.411f)
                curveToRelative(-85.63f, 41.407f, -144.696f, 129.096f, -144.696f, 230.589f)
                reflectiveCurveToRelative(59.066f, 189.182f, 144.696f, 230.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(367.304f, 25.411f)
                verticalLineToRelative(461.178f)
                curveToRelative(85.63f, -41.407f, 144.696f, -129.096f, 144.696f, -230.589f)
                reflectiveCurveToRelative(-59.066f, -189.182f, -144.696f, -230.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.043f, 201.419f)
                horizontalLineToRelative(-61.217f)
                curveToRelative(0.0f, -15.368f, -12.458f, -27.826f, -27.826f, -27.826f)
                reflectiveCurveToRelative(-27.826f, 12.458f, -27.826f, 27.826f)
                horizontalLineToRelative(-61.217f)
                curveToRelative(0.0f, 15.131f, 13.181f, 27.396f, 28.31f, 27.396f)
                horizontalLineToRelative(-0.912f)
                curveToRelative(0.0f, 15.132f, 12.266f, 27.399f, 27.398f, 27.399f)
                curveToRelative(0.0f, 13.397f, 9.622f, 24.529f, 22.33f, 26.909f)
                lineToRelative(-21.59f, 48.742f)
                curveToRelative(10.345f, 4.205f, 21.651f, 6.542f, 33.507f, 6.542f)
                curveToRelative(11.855f, 0.0f, 23.162f, -2.337f, 33.506f, -6.542f)
                lineToRelative(-21.589f, -48.742f)
                curveToRelative(12.708f, -2.38f, 22.33f, -13.512f, 22.33f, -26.909f)
                curveToRelative(15.132f, 0.0f, 27.398f, -12.267f, 27.398f, -27.399f)
                horizontalLineToRelative(-0.913f)
                curveToRelative(15.131f, 0.0f, 28.311f, -12.266f, 28.311f, -27.396f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 239.304f)
                lineToRelative(-36.174f, 16.696f)
                verticalLineToRelative(33.391f)
                lineToRelative(36.174f, 22.261f)
                lineToRelative(36.174f, -22.261f)
                verticalLineToRelative(-33.391f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(219.826f, 222.609f)
                horizontalLineToRelative(72.348f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(-72.348f)
                close()
            }
        }
        .build()
        return _mdl!!
    }

private var _mdl: ImageVector? = null
