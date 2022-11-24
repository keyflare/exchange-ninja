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

public val FlagIcons.Nad: ImageVector
    get() {
        if (_nad != null) {
            return _nad!!
        }
        _nad = Builder(name = "Nad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.981f, 437.02f)
                curveToRelative(10.739f, 10.739f, 22.197f, 20.316f, 34.216f, 28.748f)
                lineToRelative(356.569f, -356.57f)
                curveToRelative(-8.431f, -12.019f, -18.008f, -23.477f, -28.748f, -34.216f)
                curveToRelative(-10.739f, -10.739f, -22.197f, -20.315f, -34.216f, -28.747f)
                lineToRelative(-356.568f, 356.57f)
                curveToRelative(8.431f, 12.017f, 18.008f, 23.476f, 28.747f, 34.215f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.981f, 74.98f)
                curveToRelative(-80.764f, 80.764f, -96.268f, 202.056f, -46.545f, 298.398f)
                lineToRelative(344.942f, -344.941f)
                curveToRelative(-96.342f, -49.723f, -217.635f, -34.217f, -298.397f, 46.543f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(437.019f, 437.02f)
                curveToRelative(80.762f, -80.762f, 96.266f, -202.055f, 46.545f, -298.398f)
                lineToRelative(-344.942f, 344.942f)
                curveToRelative(96.341f, 49.723f, 217.634f, 34.219f, 298.397f, -46.544f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(211.478f, 144.696f)
                lineToRelative(-28.686f, 13.493f)
                lineToRelative(15.276f, 27.782f)
                lineToRelative(-31.149f, -5.958f)
                lineToRelative(-3.948f, 31.465f)
                lineToRelative(-21.696f, -23.143f)
                lineToRelative(-21.697f, 23.143f)
                lineToRelative(-3.946f, -31.465f)
                lineToRelative(-31.15f, 5.957f)
                lineToRelative(15.275f, -27.782f)
                lineToRelative(-28.685f, -13.492f)
                lineToRelative(28.686f, -13.494f)
                lineToRelative(-15.276f, -27.78f)
                lineToRelative(31.149f, 5.958f)
                lineToRelative(3.948f, -31.467f)
                lineToRelative(21.696f, 23.144f)
                lineToRelative(21.697f, -23.144f)
                lineToRelative(3.947f, 31.467f)
                lineToRelative(31.149f, -5.958f)
                lineToRelative(-15.274f, 27.781f)
                close()
            }
        }
        .build()
        return _nad!!
    }

private var _nad: ImageVector? = null
