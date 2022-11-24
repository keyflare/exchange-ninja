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

public val FlagIcons.All: ImageVector
    get() {
        if (_all != null) {
            return _all!!
        }
        _all = Builder(name = "All", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(400.696f, 190.009f)
                horizontalLineToRelative(-92.726f)
                curveToRelative(5.724f, -5.994f, 9.247f, -14.109f, 9.247f, -23.052f)
                curveToRelative(0.0f, -18.441f, -14.95f, -33.391f, -33.391f, -33.391f)
                curveToRelative(-11.618f, 0.0f, -21.845f, 5.936f, -27.826f, 14.937f)
                curveToRelative(-5.981f, -9.001f, -16.209f, -14.937f, -27.826f, -14.937f)
                curveToRelative(-18.441f, 0.0f, -33.391f, 14.95f, -33.391f, 33.391f)
                curveToRelative(0.0f, 8.943f, 3.523f, 17.059f, 9.247f, 23.052f)
                horizontalLineToRelative(-92.725f)
                curveToRelative(0.0f, 24.589f, 21.417f, 44.521f, 46.004f, 44.521f)
                horizontalLineToRelative(-1.484f)
                curveToRelative(0.0f, 24.59f, 19.933f, 44.523f, 44.523f, 44.523f)
                curveToRelative(0.0f, 7.964f, 2.099f, 15.43f, 5.763f, 21.894f)
                lineToRelative(-36.93f, 36.931f)
                lineToRelative(28.334f, 28.332f)
                lineToRelative(40.192f, -40.191f)
                curveToRelative(1.574f, 0.577f, 3.203f, 1.04f, 4.885f, 1.355f)
                lineToRelative(-24.287f, 54.835f)
                lineToRelative(37.695f, 40.748f)
                lineToRelative(37.695f, -40.75f)
                lineToRelative(-24.287f, -54.835f)
                curveToRelative(1.683f, -0.315f, 3.311f, -0.777f, 4.885f, -1.355f)
                lineToRelative(40.192f, 40.191f)
                lineToRelative(28.334f, -28.333f)
                lineToRelative(-36.931f, -36.931f)
                curveToRelative(3.665f, -6.463f, 5.764f, -13.93f, 5.764f, -21.894f)
                curveToRelative(24.589f, 0.0f, 44.522f, -19.932f, 44.522f, -44.523f)
                horizontalLineToRelative(-1.483f)
                curveToRelative(24.587f, 0.002f, 46.005f, -19.929f, 46.005f, -44.518f)
                close()
            }
        }
        .build()
        return _all!!
    }

private var _all: ImageVector? = null
