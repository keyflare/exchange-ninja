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

public val FlagIcons.Qar: ImageVector
    get() {
        if (_qar != null) {
            return _qar!!
        }
        _qar = Builder(name = "Qar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF751a46)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -141.384f, -114.616f, -256.0f, -256.0f, -256.0f)
                curveToRelative(-50.08f, 0.0f, -96.794f, 14.395f, -136.252f, 39.251f)
                lineToRelative(56.113f, 23.841f)
                lineToRelative(-75.687f, 32.158f)
                lineToRelative(75.687f, 32.157f)
                lineToRelative(-75.687f, 32.156f)
                lineToRelative(75.687f, 32.155f)
                lineToRelative(-75.687f, 32.151f)
                lineToRelative(75.687f, 32.149f)
                lineToRelative(-75.687f, 32.156f)
                lineToRelative(75.687f, 32.154f)
                lineToRelative(-75.687f, 32.151f)
                lineToRelative(75.687f, 32.154f)
                lineToRelative(-75.687f, 32.156f)
                lineToRelative(75.687f, 32.151f)
                lineToRelative(-56.088f, 23.828f)
                curveToRelative(39.453f, 24.844f, 86.157f, 39.232f, 136.227f, 39.232f)
                curveToRelative(141.384f, 0.0f, 256.0f, -114.616f, 256.0f, -256.0f)
                close()
            }
        }
        .build()
        return _qar!!
    }

private var _qar: ImageVector? = null
