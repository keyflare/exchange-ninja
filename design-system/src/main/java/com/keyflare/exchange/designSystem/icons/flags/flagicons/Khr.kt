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

public val FlagIcons.Khr: ImageVector
    get() {
        if (_khr != null) {
            return _khr!!
        }
        _khr = Builder(name = "Khr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 44.35f, 11.283f, 86.064f, 31.127f, 122.435f)
                lineToRelative(224.873f, 22.261f)
                lineToRelative(224.873f, -22.261f)
                curveToRelative(19.844f, -36.371f, 31.127f, -78.085f, 31.127f, -122.435f)
                reflectiveCurveToRelative(-11.283f, -86.064f, -31.127f, -122.435f)
                lineToRelative(-224.873f, -22.261f)
                lineToRelative(-224.873f, 22.261f)
                curveToRelative(-19.844f, 36.371f, -31.127f, 78.085f, -31.127f, 122.435f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(31.127f, 133.565f)
                horizontalLineToRelative(449.745f)
                curveToRelative(-43.418f, -79.576f, -127.837f, -133.565f, -224.872f, -133.565f)
                reflectiveCurveToRelative(-181.454f, 53.989f, -224.873f, 133.565f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(97.035f, 0.0f, 181.454f, -53.989f, 224.873f, -133.565f)
                horizontalLineToRelative(-449.746f)
                curveToRelative(43.419f, 79.576f, 127.838f, 133.565f, 224.873f, 133.565f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.043f, 306.087f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(-22.26f)
                verticalLineToRelative(-44.522f)
                lineToRelative(-22.261f, -22.261f)
                lineToRelative(-22.261f, 22.261f)
                verticalLineToRelative(-44.522f)
                lineToRelative(-22.261f, -22.261f)
                lineToRelative(-22.261f, 22.261f)
                verticalLineToRelative(44.522f)
                lineToRelative(-22.261f, -22.261f)
                lineToRelative(-22.261f, 22.261f)
                verticalLineToRelative(44.522f)
                horizontalLineToRelative(-22.26f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(222.608f)
                verticalLineToRelative(-33.391f)
                close()
            }
        }
        .build()
        return _khr!!
    }

private var _khr: ImageVector? = null
