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

public val FlagIcons.Cop: ImageVector
    get() {
        if (_cop != null) {
            return _cop!!
        }
        _cop = Builder(name = "Cop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, -141.384f, 114.616f, -256.0f, 256.0f, -256.0f)
                reflectiveCurveToRelative(256.0f, 114.616f, 256.0f, 256.0f)
                lineToRelative(-256.0f, 22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(34.256f, 384.0f)
                curveToRelative(44.265f, 76.516f, 126.989f, 128.0f, 221.744f, 128.0f)
                reflectiveCurveToRelative(177.479f, -51.484f, 221.744f, -128.0f)
                lineToRelative(-221.744f, -16.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(477.744f, 384.0f)
                curveToRelative(21.782f, -37.654f, 34.256f, -81.369f, 34.256f, -128.0f)
                horizontalLineToRelative(-512.0f)
                curveToRelative(0.0f, 46.631f, 12.474f, 90.346f, 34.256f, 128.0f)
                close()
            }
        }
        .build()
        return _cop!!
    }

private var _cop: ImageVector? = null
