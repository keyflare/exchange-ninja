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

public val FlagIcons.Pyg: ImageVector
    get() {
        if (_pyg != null) {
            return _pyg!!
        }
        _pyg = Builder(name = "Pyg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-101.494f, 0.0f, -189.19f, 59.065f, -230.598f, 144.696f)
                horizontalLineToRelative(461.195f)
                curveToRelative(-41.407f, -85.631f, -129.104f, -144.696f, -230.597f, -144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(101.493f, 0.0f, 189.19f, -59.065f, 230.598f, -144.696f)
                horizontalLineToRelative(-461.196f)
                curveToRelative(41.408f, 85.631f, 129.104f, 144.696f, 230.598f, 144.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(318.963f, 181.907f)
                lineToRelative(-23.611f, 23.611f)
                curveToRelative(10.071f, 10.071f, 16.301f, 23.984f, 16.301f, 39.352f)
                curveToRelative(0.0f, 30.736f, -24.917f, 55.652f, -55.652f, 55.652f)
                reflectiveCurveToRelative(-55.652f, -24.917f, -55.652f, -55.652f)
                curveToRelative(0.0f, -15.368f, 6.23f, -29.281f, 16.301f, -39.352f)
                lineToRelative(-23.611f, -23.611f)
                curveToRelative(-16.115f, 16.112f, -26.081f, 38.373f, -26.081f, 62.963f)
                curveToRelative(0.0f, 49.178f, 39.866f, 89.043f, 89.043f, 89.043f)
                reflectiveCurveToRelative(89.043f, -39.866f, 89.043f, -89.043f)
                curveToRelative(-0.001f, -24.59f, -9.967f, -46.851f, -26.081f, -62.963f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 211.478f)
                lineToRelative(8.289f, 25.51f)
                horizontalLineToRelative(26.821f)
                lineToRelative(-21.699f, 15.764f)
                lineToRelative(8.289f, 25.509f)
                lineToRelative(-21.7f, -15.765f)
                lineToRelative(-21.7f, 15.765f)
                lineToRelative(8.289f, -25.509f)
                lineToRelative(-21.699f, -15.764f)
                horizontalLineToRelative(26.821f)
                close()
            }
        }
        .build()
        return _pyg!!
    }

private var _pyg: ImageVector? = null
