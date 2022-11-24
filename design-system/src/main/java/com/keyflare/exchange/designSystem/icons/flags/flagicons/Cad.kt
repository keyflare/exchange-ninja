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

public val FlagIcons.Cad: ImageVector
    get() {
        if (_cad != null) {
            return _cad!!
        }
        _cad = Builder(name = "Cad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 101.494f, 59.065f, 189.19f, 144.696f, 230.598f)
                verticalLineToRelative(-461.196f)
                curveToRelative(-85.631f, 41.408f, -144.696f, 129.104f, -144.696f, 230.598f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(300.522f, 289.391f)
                lineToRelative(44.521f, -22.261f)
                lineToRelative(-22.26f, -11.13f)
                verticalLineToRelative(-22.261f)
                lineToRelative(-44.522f, 22.261f)
                lineToRelative(22.261f, -44.522f)
                horizontalLineToRelative(-22.261f)
                lineToRelative(-22.261f, -33.391f)
                lineToRelative(-22.261f, 33.391f)
                horizontalLineToRelative(-22.261f)
                lineToRelative(22.261f, 44.522f)
                lineToRelative(-44.522f, -22.261f)
                verticalLineToRelative(22.261f)
                lineToRelative(-22.26f, 11.13f)
                lineToRelative(44.521f, 22.261f)
                lineToRelative(-11.13f, 22.261f)
                horizontalLineToRelative(44.522f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(22.26f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(44.522f)
                close()
            }
        }
        .build()
        return _cad!!
    }

private var _cad: ImageVector? = null
