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

public val FlagIcons.Ngn: ImageVector
    get() {
        if (_ngn != null) {
            return _ngn!!
        }
        _ngn = Builder(name = "Ngn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 110.072f, 69.472f, 203.906f, 166.957f, 240.078f)
                verticalLineToRelative(-480.154f)
                curveToRelative(-97.485f, 36.17f, -166.957f, 130.006f, -166.957f, 240.076f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -110.07f, -69.472f, -203.906f, -166.957f, -240.076f)
                verticalLineToRelative(480.155f)
                curveToRelative(97.485f, -36.173f, 166.957f, -130.007f, 166.957f, -240.079f)
                close()
            }
        }
        .build()
        return _ngn!!
    }

private var _ngn: ImageVector? = null
