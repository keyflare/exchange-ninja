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

public val FlagIcons.Bhd: ImageVector
    get() {
        if (_bhd != null) {
            return _bhd!!
        }
        _bhd = Builder(name = "Bhd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-51.376f, 0.0f, -99.208f, 15.145f, -139.3f, 41.198f)
                lineToRelative(65.839f, 44.129f)
                lineToRelative(-82.365f, 42.666f)
                lineToRelative(82.365f, 42.666f)
                lineToRelative(-82.365f, 42.666f)
                lineToRelative(82.365f, 42.661f)
                lineToRelative(-82.365f, 42.665f)
                lineToRelative(82.365f, 42.665f)
                lineToRelative(-82.365f, 42.67f)
                lineToRelative(82.365f, 42.666f)
                lineToRelative(-65.847f, 44.143f)
                curveToRelative(40.094f, 26.058f, 87.929f, 41.205f, 139.308f, 41.205f)
                curveToRelative(141.384f, 0.0f, 256.0f, -114.616f, 256.0f, -256.0f)
                reflectiveCurveToRelative(-114.616f, -256.0f, -256.0f, -256.0f)
                close()
            }
        }
        .build()
        return _bhd!!
    }

private var _bhd: ImageVector? = null
