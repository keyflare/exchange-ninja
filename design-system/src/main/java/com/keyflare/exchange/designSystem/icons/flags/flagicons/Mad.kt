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

public val FlagIcons.Mad: ImageVector
    get() {
        if (_mad != null) {
            return _mad!!
        }
        _mad = Builder(name = "Mad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFD80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF6DA544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.3f, 210.1f)
                horizontalLineTo(291.7f)
                lineTo(256.0f, 100.2f)
                lineToRelative(-35.7f, 109.9f)
                horizontalLineTo(104.7f)
                lineToRelative(93.5f, 67.9f)
                lineToRelative(-35.7f, 109.9f)
                lineTo(256.0f, 320.0f)
                lineToRelative(93.5f, 67.9f)
                lineTo(313.8f, 278.0f)
                lineTo(407.3f, 210.1f)
                close()
                moveTo(224.4f, 269.5f)
                lineToRelative(12.1f, -37.2f)
                horizontalLineToRelative(39.1f)
                lineToRelative(12.1f, 37.2f)
                verticalLineToRelative(0.0f)
                lineToRelative(-31.6f, 23.0f)
                lineTo(224.4f, 269.5f)
                lineTo(224.4f, 269.5f)
                close()
                moveTo(268.3f, 210.1f)
                horizontalLineToRelative(-24.6f)
                lineToRelative(12.3f, -37.9f)
                lineTo(268.3f, 210.1f)
                close()
                moveTo(306.6f, 255.8f)
                lineToRelative(-7.6f, -23.4f)
                horizontalLineToRelative(39.8f)
                lineTo(306.6f, 255.8f)
                close()
                moveTo(213.1f, 232.4f)
                lineToRelative(-7.6f, 23.4f)
                lineToRelative(-32.2f, -23.4f)
                horizontalLineTo(213.1f)
                close()
                moveTo(204.8f, 329.7f)
                lineToRelative(12.3f, -37.9f)
                lineToRelative(19.9f, 14.5f)
                lineTo(204.8f, 329.7f)
                close()
                moveTo(274.9f, 306.3f)
                lineToRelative(19.9f, -14.5f)
                lineToRelative(12.3f, 37.9f)
                lineTo(274.9f, 306.3f)
                close()
            }
        }
        .build()
        return _mad!!
    }

private var _mad: ImageVector? = null
