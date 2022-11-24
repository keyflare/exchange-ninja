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

public val FlagIcons.Lak: ImageVector
    get() {
        if (_lak != null) {
            return _lak!!
        }
        _lak = Builder(name = "Lak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(486.598f, 144.696f)
                curveToRelative(-41.408f, -85.631f, -129.104f, -144.696f, -230.598f, -144.696f)
                reflectiveCurveToRelative(-189.19f, 59.065f, -230.598f, 144.696f)
                lineToRelative(230.598f, 22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.402f, 367.304f)
                curveToRelative(41.408f, 85.631f, 129.104f, 144.696f, 230.598f, 144.696f)
                reflectiveCurveToRelative(189.19f, -59.065f, 230.598f, -144.696f)
                lineToRelative(-230.598f, -22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(486.598f, 144.696f)
                horizontalLineToRelative(-461.196f)
                curveToRelative(-16.274f, 33.655f, -25.402f, 71.413f, -25.402f, 111.304f)
                reflectiveCurveToRelative(9.128f, 77.649f, 25.402f, 111.304f)
                horizontalLineToRelative(461.195f)
                curveToRelative(16.276f, -33.655f, 25.403f, -71.413f, 25.403f, -111.304f)
                reflectiveCurveToRelative(-9.127f, -77.649f, -25.402f, -111.304f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-89.043f, 0.0f)
                arcToRelative(89.043f, 89.043f, 0.0f, true, true, 178.086f, 0.0f)
                arcToRelative(89.043f, 89.043f, 0.0f, true, true, -178.086f, 0.0f)
            }
        }
        .build()
        return _lak!!
    }

private var _lak: ImageVector? = null
