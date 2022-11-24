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

public val FlagIcons.Lsl: ImageVector
    get() {
        if (_lsl != null) {
            return _lsl!!
        }
        _lsl = Builder(name = "Lsl", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 39.89f, 9.127f, 77.648f, 25.402f, 111.304f)
                lineToRelative(230.598f, 11.131f)
                lineToRelative(230.598f, -11.13f)
                curveToRelative(16.275f, -33.657f, 25.402f, -71.415f, 25.402f, -111.305f)
                reflectiveCurveToRelative(-9.127f, -77.648f, -25.402f, -111.304f)
                lineToRelative(-230.598f, -11.131f)
                lineToRelative(-230.598f, 11.13f)
                curveToRelative(-16.275f, 33.657f, -25.402f, 71.415f, -25.402f, 111.305f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(101.493f, 0.0f, 189.19f, -59.065f, 230.598f, -144.696f)
                horizontalLineToRelative(-461.196f)
                curveToRelative(41.408f, 85.631f, 129.104f, 144.696f, 230.598f, 144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-101.494f, 0.0f, -189.19f, 59.065f, -230.598f, 144.696f)
                horizontalLineToRelative(461.195f)
                curveToRelative(-41.407f, -85.631f, -129.104f, -144.696f, -230.597f, -144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(272.696f, 250.435f)
                verticalLineToRelative(-61.217f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(61.217f)
                lineToRelative(-40.33f, 40.331f)
                curveToRelative(11.729f, 19.2f, 32.88f, 32.017f, 57.026f, 32.017f)
                reflectiveCurveToRelative(45.296f, -12.817f, 57.026f, -32.017f)
                close()
            }
        }
        .build()
        return _lsl!!
    }

private var _lsl: ImageVector? = null
