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

public val FlagIcons.Gnf: ImageVector
    get() {
        if (_gnf != null) {
            return _gnf!!
        }
        _gnf = Builder(name = "Gnf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.046f, 15.924f)
                curveToRelative(-27.734f, -10.291f, -57.731f, -15.924f, -89.046f, -15.924f)
                curveToRelative(-31.313f, 0.0f, -61.309f, 5.633f, -89.041f, 15.922f)
                lineToRelative(-11.131f, 240.078f)
                lineToRelative(11.13f, 240.078f)
                curveToRelative(27.733f, 10.29f, 57.729f, 15.922f, 89.042f, 15.922f)
                curveToRelative(31.316f, 0.0f, 61.312f, -5.632f, 89.046f, -15.924f)
                lineToRelative(11.13f, -240.076f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 110.07f, 69.472f, 203.906f, 166.957f, 240.076f)
                verticalLineToRelative(-480.154f)
                curveToRelative(-97.485f, 36.172f, -166.957f, 130.006f, -166.957f, 240.078f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -110.072f, -69.472f, -203.906f, -166.957f, -240.078f)
                verticalLineToRelative(480.155f)
                curveToRelative(97.485f, -36.171f, 166.957f, -130.007f, 166.957f, -240.077f)
                close()
            }
        }
        .build()
        return _gnf!!
    }

private var _gnf: ImageVector? = null
