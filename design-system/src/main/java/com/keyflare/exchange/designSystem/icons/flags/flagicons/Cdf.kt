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

public val FlagIcons.Cdf: ImageVector
    get() {
        if (_cdf != null) {
            return _cdf!!
        }
        _cdf = Builder(name = "Cdf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(483.574f, 138.616f)
                curveToRelative(-11.829f, -22.919f, -27.334f, -44.431f, -46.546f, -63.643f)
                curveToRelative(-19.213f, -19.213f, -40.726f, -34.718f, -63.644f, -46.546f)
                lineToRelative(-180.349f, 164.606f)
                lineToRelative(-164.607f, 180.349f)
                curveToRelative(11.829f, 22.919f, 27.334f, 44.432f, 46.546f, 63.644f)
                reflectiveCurveToRelative(40.725f, 34.717f, 63.643f, 46.546f)
                lineToRelative(180.349f, -164.607f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.974f, 437.027f)
                curveToRelative(10.739f, 10.739f, 22.198f, 20.317f, 34.217f, 28.75f)
                lineToRelative(356.584f, -356.586f)
                curveToRelative(-8.431f, -12.019f, -18.009f, -23.478f, -28.748f, -34.217f)
                curveToRelative(-10.74f, -10.739f, -22.198f, -20.316f, -34.217f, -28.748f)
                lineToRelative(-356.584f, 356.584f)
                curveToRelative(8.431f, 12.017f, 18.008f, 23.478f, 28.748f, 34.217f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.974f, 74.972f)
                curveToRelative(-80.767f, 80.767f, -96.272f, 202.065f, -46.546f, 298.41f)
                lineToRelative(344.956f, -344.955f)
                curveToRelative(-96.346f, -49.725f, -217.644f, -34.218f, -298.41f, 46.545f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(437.027f, 437.027f)
                curveToRelative(80.766f, -80.766f, 96.27f, -202.064f, 46.547f, -298.409f)
                lineToRelative(-344.956f, 344.955f)
                curveToRelative(96.345f, 49.725f, 217.644f, 34.221f, 298.409f, -46.546f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(136.426f, 77.905f)
                lineToRelative(13.814f, 42.517f)
                horizontalLineToRelative(44.704f)
                lineToRelative(-36.166f, 26.276f)
                lineToRelative(13.814f, 42.516f)
                lineToRelative(-36.166f, -26.277f)
                lineToRelative(-36.168f, 26.277f)
                lineToRelative(13.816f, -42.516f)
                lineToRelative(-36.168f, -26.276f)
                horizontalLineToRelative(44.704f)
                close()
            }
        }
        .build()
        return _cdf!!
    }

private var _cdf: ImageVector? = null
