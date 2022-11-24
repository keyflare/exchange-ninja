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

public val FlagIcons.Ttd: ImageVector
    get() {
        if (_ttd != null) {
            return _ttd!!
        }
        _ttd = Builder(name = "Ttd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(138.616f, 28.426f)
                curveToRelative(-22.918f, 11.829f, -44.431f, 27.334f, -63.643f, 46.546f)
                curveToRelative(-19.213f, 19.213f, -34.718f, 40.726f, -46.546f, 63.644f)
                lineToRelative(164.607f, 180.349f)
                lineToRelative(180.349f, 164.607f)
                curveToRelative(22.919f, -11.829f, 44.432f, -27.334f, 63.644f, -46.545f)
                curveToRelative(19.213f, -19.213f, 34.717f, -40.726f, 46.546f, -63.644f)
                lineToRelative(-164.607f, -180.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(437.027f, 437.027f)
                curveToRelative(10.739f, -10.739f, 20.317f, -22.198f, 28.749f, -34.217f)
                lineToRelative(-356.585f, -356.586f)
                curveToRelative(-12.019f, 8.431f, -23.478f, 18.009f, -34.217f, 28.748f)
                reflectiveCurveToRelative(-20.317f, 22.198f, -28.749f, 34.218f)
                lineToRelative(356.585f, 356.584f)
                curveToRelative(12.018f, -8.431f, 23.478f, -18.008f, 34.217f, -28.747f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.972f, 437.027f)
                curveToRelative(80.767f, 80.767f, 202.064f, 96.271f, 298.41f, 46.545f)
                lineToRelative(-344.955f, -344.956f)
                curveToRelative(-49.725f, 96.346f, -34.218f, 217.644f, 46.545f, 298.411f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(437.027f, 74.973f)
                curveToRelative(-80.767f, -80.766f, -202.064f, -96.27f, -298.41f, -46.547f)
                lineToRelative(344.955f, 344.958f)
                curveToRelative(49.726f, -96.346f, 34.222f, -217.645f, -46.545f, -298.411f)
                close()
            }
        }
        .build()
        return _ttd!!
    }

private var _ttd: ImageVector? = null
