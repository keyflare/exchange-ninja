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

public val FlagIcons.Tzs: ImageVector
    get() {
        if (_tzs != null) {
            return _tzs!!
        }
        _tzs = Builder(name = "Tzs", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 437.02f)
                curveToRelative(10.739f, 10.739f, 22.197f, 20.316f, 34.216f, 28.748f)
                lineToRelative(356.57f, -356.571f)
                curveToRelative(-8.43f, -12.019f, -18.008f, -23.477f, -28.747f, -34.216f)
                curveToRelative(-10.74f, -10.739f, -22.197f, -20.315f, -34.216f, -28.747f)
                lineToRelative(-356.569f, 356.571f)
                curveToRelative(8.43f, 12.016f, 18.008f, 23.475f, 28.746f, 34.215f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 74.98f)
                curveToRelative(-80.762f, 80.764f, -96.267f, 202.055f, -46.544f, 298.398f)
                lineToRelative(344.942f, -344.941f)
                curveToRelative(-96.343f, -49.723f, -217.635f, -34.217f, -298.398f, 46.543f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(437.019f, 437.02f)
                curveToRelative(80.762f, -80.762f, 96.266f, -202.055f, 46.545f, -298.398f)
                lineToRelative(-344.942f, 344.942f)
                curveToRelative(96.341f, 49.723f, 217.634f, 34.218f, 298.397f, -46.544f)
                close()
            }
        }
        .build()
        return _tzs!!
    }

private var _tzs: ImageVector? = null
