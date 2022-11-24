package com.keyflare.exchange.designSystem.icons.flags.flagicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.icons.flags.FlagIcons

public val FlagIcons.Bbd: ImageVector
    get() {
        if (_bdd != null) {
            return _bdd!!
        }
        _bdd = Builder(name = "Bdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(-85.63f, 41.406f, -144.696f, 129.095f, -144.696f, 230.589f)
                reflectiveCurveToRelative(59.066f, 189.183f, 144.696f, 230.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(367.304f, 25.411f)
                verticalLineToRelative(461.178f)
                curveToRelative(85.63f, -41.406f, 144.696f, -129.096f, 144.696f, -230.589f)
                reflectiveCurveToRelative(-59.066f, -189.183f, -144.696f, -230.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(333.913f, 155.826f)
                lineToRelative(14.933f, 7.466f)
                lineToRelative(-14.933f, -7.466f)
                lineToRelative(-14.934f, -7.466f)
                curveToRelative(-0.9f, 1.801f, -20.399f, 41.474f, -23.584f, 102.075f)
                horizontalLineToRelative(-22.699f)
                verticalLineToRelative(-94.609f)
                lineToRelative(-16.696f, -22.261f)
                lineToRelative(-16.696f, 22.261f)
                verticalLineToRelative(94.609f)
                horizontalLineToRelative(-22.699f)
                curveToRelative(-3.186f, -60.601f, -22.684f, -100.274f, -23.585f, -102.075f)
                lineToRelative(-29.866f, 14.933f)
                curveToRelative(0.206f, 0.41f, 20.499f, 41.715f, 20.499f, 103.838f)
                verticalLineToRelative(16.696f)
                horizontalLineToRelative(55.652f)
                verticalLineToRelative(94.609f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(-94.609f)
                horizontalLineToRelative(55.652f)
                verticalLineToRelative(-16.697f)
                curveToRelative(0.0f, -32.118f, 5.557f, -58.602f, 10.22f, -75.164f)
                curveToRelative(5.083f, -18.06f, 10.246f, -28.607f, 10.297f, -28.712f)
                close()
            }
        }
        .build()
        return _bdd!!
    }

private var _bdd: ImageVector? = null
