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

public val FlagIcons.Mxn: ImageVector
    get() {
        if (_mxn != null) {
            return _mxn!!
        }
        _mxn = Builder(name = "Mxn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -101.494f, -59.065f, -189.19f, -144.696f, -230.598f)
                verticalLineToRelative(461.195f)
                curveToRelative(85.631f, -41.407f, 144.696f, -129.103f, 144.696f, -230.597f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 101.494f, 59.065f, 189.19f, 144.696f, 230.598f)
                verticalLineToRelative(-461.196f)
                curveToRelative(-85.631f, 41.408f, -144.696f, 129.104f, -144.696f, 230.598f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(189.217f, 256.0f)
                curveToRelative(0.0f, 36.883f, 29.9f, 66.783f, 66.783f, 66.783f)
                reflectiveCurveToRelative(66.783f, -29.9f, 66.783f, -66.783f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-133.566f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.043f, 211.478f)
                horizontalLineToRelative(-66.783f)
                curveToRelative(0.0f, -12.294f, -9.967f, -22.261f, -22.261f, -22.261f)
                reflectiveCurveToRelative(-22.261f, 9.967f, -22.261f, 22.261f)
                horizontalLineToRelative(-66.783f)
                curveToRelative(0.0f, 12.295f, 10.709f, 22.261f, 23.002f, 22.261f)
                horizontalLineToRelative(-0.741f)
                curveToRelative(0.0f, 12.295f, 9.966f, 22.261f, 22.261f, 22.261f)
                curveToRelative(0.0f, 12.295f, 9.966f, 22.261f, 22.261f, 22.261f)
                horizontalLineToRelative(44.522f)
                curveToRelative(12.295f, 0.0f, 22.261f, -9.966f, 22.261f, -22.261f)
                curveToRelative(12.295f, 0.0f, 22.261f, -9.966f, 22.261f, -22.261f)
                horizontalLineToRelative(-0.742f)
                curveToRelative(12.295f, 0.0f, 23.003f, -9.966f, 23.003f, -22.261f)
                close()
            }
        }
        .build()
        return _mxn!!
    }

private var _mxn: ImageVector? = null
