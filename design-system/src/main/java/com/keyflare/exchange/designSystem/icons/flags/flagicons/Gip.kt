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

public val FlagIcons.Gip: ImageVector
    get() {
        if (_gip != null) {
            return _gip!!
        }
        _gip = Builder(name = "Gip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf9f9f9)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(256.0f, 512.0f)
                curveToRelative(110.07f, 0.0f, 203.906f, -69.472f, 240.076f, -166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(36.172f, 97.485f, 130.006f, 166.957f, 240.078f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(356.174f, 211.478f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(11.13f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(11.131f)
                horizontalLineToRelative(-22.26f)
                verticalLineToRelative(-11.131f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(11.13f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(-77.911f)
                horizontalLineToRelative(11.131f)
                verticalLineToRelative(-22.26f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(11.128f)
                horizontalLineToRelative(-11.131f)
                verticalLineToRelative(-11.128f)
                horizontalLineToRelative(-22.26f)
                verticalLineToRelative(11.128f)
                horizontalLineToRelative(-11.131f)
                verticalLineToRelative(-11.128f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(22.26f)
                horizontalLineToRelative(11.131f)
                verticalLineToRelative(77.911f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(11.13f)
                verticalLineToRelative(-22.261f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(11.131f)
                horizontalLineToRelative(-22.26f)
                verticalLineToRelative(-11.131f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(22.261f)
                horizontalLineToRelative(11.13f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(-22.261f)
                verticalLineToRelative(89.044f)
                horizontalLineToRelative(244.87f)
                verticalLineToRelative(-89.044f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 289.391f)
                curveToRelative(-18.441f, 0.0f, -33.391f, 14.95f, -33.391f, 33.391f)
                curveToRelative(0.0f, 14.536f, 9.294f, 26.9f, 22.261f, 31.484f)
                verticalLineToRelative(46.43f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(44.522f)
                horizontalLineToRelative(55.652f)
                verticalLineToRelative(-90.951f)
                curveToRelative(12.967f, -4.584f, 22.261f, -16.947f, 22.261f, -31.484f)
                curveToRelative(-0.001f, -18.441f, -14.951f, -33.392f, -33.392f, -33.392f)
                close()
                moveTo(256.0f, 333.913f)
                curveToRelative(-6.147f, 0.0f, -11.13f, -4.984f, -11.13f, -11.13f)
                curveToRelative(0.0f, -6.147f, 4.983f, -11.13f, 11.13f, -11.13f)
                reflectiveCurveToRelative(11.13f, 4.983f, 11.13f, 11.13f)
                curveToRelative(0.0f, 6.146f, -4.983f, 11.13f, -11.13f, 11.13f)
                close()
            }
        }
        .build()
        return _gip!!
    }

private var _gip: ImageVector? = null
