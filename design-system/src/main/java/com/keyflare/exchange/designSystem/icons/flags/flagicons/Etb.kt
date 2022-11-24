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

public val FlagIcons.Etb: ImageVector
    get() {
        if (_etb != null) {
            return _etb!!
        }
        _etb = Builder(name = "Etb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 31.316f, 5.633f, 61.312f, 15.924f, 89.046f)
                lineToRelative(240.076f, 22.258f)
                lineToRelative(240.076f, -22.259f)
                curveToRelative(10.292f, -27.733f, 15.924f, -57.73f, 15.924f, -89.045f)
                curveToRelative(0.0f, -30.885f, -5.471f, -60.492f, -15.494f, -87.905f)
                lineToRelative(-240.506f, -23.399f)
                lineToRelative(-240.506f, 23.4f)
                curveToRelative(-10.023f, 27.412f, -15.494f, 57.019f, -15.494f, 87.904f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(110.071f, 0.0f, 203.906f, -69.472f, 240.077f, -166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(36.171f, 97.485f, 130.006f, 166.957f, 240.077f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-110.071f, 0.0f, -203.906f, 69.472f, -240.077f, 166.957f)
                horizontalLineToRelative(480.155f)
                curveToRelative(-36.172f, -97.485f, -130.007f, -166.957f, -240.078f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-122.435f, 0.0f)
                arcToRelative(122.435f, 122.435f, 0.0f, true, true, 244.87f, 0.0f)
                arcToRelative(122.435f, 122.435f, 0.0f, true, true, -244.87f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(255.974f, 161.191f)
                lineToRelative(22.102f, 68.022f)
                horizontalLineToRelative(71.637f)
                lineToRelative(-57.978f, 42.041f)
                lineToRelative(22.276f, 68.224f)
                lineToRelative(-58.037f, -42.241f)
                lineToRelative(-57.948f, 42.163f)
                lineToRelative(22.186f, -68.146f)
                lineToRelative(-57.925f, -42.041f)
                horizontalLineToRelative(71.585f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(344.124f, 272.93f)
                lineToRelative(-70.116f, -22.784f)
                lineToRelative(43.333f, -59.64f)
                lineToRelative(-18.008f, -13.086f)
                lineToRelative(-43.335f, 59.644f)
                lineToRelative(-43.331f, -59.643f)
                lineToRelative(-18.01f, 13.084f)
                lineToRelative(43.332f, 59.645f)
                lineToRelative(-70.113f, 22.779f)
                lineToRelative(6.878f, 21.173f)
                lineToRelative(70.116f, -22.781f)
                verticalLineToRelative(73.722f)
                horizontalLineToRelative(22.26f)
                verticalLineToRelative(-73.723f)
                lineToRelative(70.113f, 22.782f)
                close()
            }
        }
        .build()
        return _etb!!
    }

private var _etb: ImageVector? = null
