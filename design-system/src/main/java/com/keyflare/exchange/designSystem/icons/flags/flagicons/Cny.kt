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

public val FlagIcons.Cny: ImageVector
    get() {
        if (_cny != null) {
            return _cny!!
        }
        _cny = Builder(name = "Cny", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(140.1f, 155.8f)
                lineToRelative(22.1f, 68.0f)
                horizontalLineToRelative(71.5f)
                lineToRelative(-57.8f, 42.1f)
                lineToRelative(22.1f, 68.0f)
                lineToRelative(-57.9f, -42.0f)
                lineToRelative(-57.9f, 42.0f)
                lineToRelative(22.2f, -68.0f)
                lineToRelative(-57.9f, -42.1f)
                horizontalLineToRelative(71.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(303.5f, 396.5f)
                lineToRelative(-16.9f, -20.8f)
                lineToRelative(-25.0f, 9.7f)
                lineToRelative(14.5f, -22.5f)
                lineToRelative(-16.9f, -20.9f)
                lineToRelative(25.9f, 6.9f)
                lineToRelative(14.6f, -22.5f)
                lineToRelative(1.4f, 26.8f)
                lineToRelative(26.0f, 6.9f)
                lineToRelative(-25.1f, 9.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(337.1f, 335.5f)
                lineToRelative(8.0f, -25.6f)
                lineToRelative(-21.9f, -15.5f)
                lineToRelative(26.8f, -0.4f)
                lineToRelative(7.9f, -25.6f)
                lineToRelative(8.7f, 25.4f)
                lineToRelative(26.8f, -0.3f)
                lineToRelative(-21.5f, 16.0f)
                lineToRelative(8.6f, 25.4f)
                lineToRelative(-21.9f, -15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(382.4f, 187.9f)
                lineToRelative(-11.8f, 24.1f)
                lineToRelative(19.2f, 18.7f)
                lineToRelative(-26.5f, -3.8f)
                lineToRelative(-11.8f, 24.0f)
                lineToRelative(-4.6f, -26.4f)
                lineToRelative(-26.6f, -3.8f)
                lineToRelative(23.8f, -12.5f)
                lineToRelative(-4.6f, -26.5f)
                lineToRelative(19.2f, 18.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(304.2f, 114.9f)
                lineToRelative(-2.0f, 26.7f)
                lineToRelative(24.9f, 10.1f)
                lineToRelative(-26.1f, 6.4f)
                lineToRelative(-1.9f, 26.8f)
                lineToRelative(-14.1f, -22.8f)
                lineToRelative(-26.1f, 6.4f)
                lineToRelative(17.3f, -20.5f)
                lineToRelative(-14.2f, -22.7f)
                lineToRelative(24.9f, 10.1f)
                close()
            }
        }
        .build()
        return _cny!!
    }

private var _cny: ImageVector? = null
