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

public val FlagIcons.Gtq: ImageVector
    get() {
        if (_gtq != null) {
            return _gtq!!
        }
        _gtq = Builder(name = "Gtq", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -101.494f, -59.065f, -189.19f, -144.696f, -230.598f)
                verticalLineToRelative(461.195f)
                curveToRelative(85.631f, -41.407f, 144.696f, -129.104f, 144.696f, -230.597f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 101.493f, 59.065f, 189.19f, 144.696f, 230.598f)
                verticalLineToRelative(-461.196f)
                curveToRelative(-85.631f, 41.408f, -144.696f, 129.104f, -144.696f, 230.598f)
                close()
            }
            path(fill = SolidColor(Color(0xFFacabb1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(322.898f, 299.288f)
                lineToRelative(-43.286f, -43.286f)
                lineToRelative(41.203f, -41.205f)
                lineToRelative(-1.867f, -21.762f)
                lineToRelative(-11.796f, -11.798f)
                lineToRelative(-51.152f, 51.152f)
                lineToRelative(-51.152f, -51.152f)
                lineToRelative(-11.796f, 11.798f)
                lineToRelative(-1.867f, 21.762f)
                lineToRelative(41.203f, 41.205f)
                lineToRelative(-43.287f, 43.286f)
                lineToRelative(23.612f, 23.61f)
                lineToRelative(43.287f, -43.285f)
                lineToRelative(43.287f, 43.285f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(318.963f, 193.037f)
                lineToRelative(-23.611f, 23.611f)
                curveToRelative(10.071f, 10.071f, 16.301f, 23.984f, 16.301f, 39.352f)
                curveToRelative(0.0f, 30.736f, -24.917f, 55.652f, -55.652f, 55.652f)
                reflectiveCurveToRelative(-55.653f, -24.916f, -55.653f, -55.652f)
                curveToRelative(0.0f, -15.368f, 6.23f, -29.281f, 16.301f, -39.352f)
                lineToRelative(-23.611f, -23.611f)
                curveToRelative(-16.115f, 16.112f, -26.081f, 38.373f, -26.081f, 62.963f)
                curveToRelative(0.0f, 49.178f, 39.866f, 89.043f, 89.043f, 89.043f)
                reflectiveCurveToRelative(89.043f, -39.866f, 89.043f, -89.043f)
                curveToRelative(0.0f, -24.589f, -9.966f, -46.85f, -26.08f, -62.963f)
                close()
            }
        }
        .build()
        return _gtq!!
    }

private var _gtq: ImageVector? = null
