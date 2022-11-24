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

public val FlagIcons.Clp: ImageVector
    get() {
        if (_clp != null) {
            return _clp!!
        }
        _clp = Builder(name = "Clp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, 141.384f, -114.616f, 256.0f, -256.0f, 256.0f)
                reflectiveCurveToRelative(-256.0f, -114.616f, -256.0f, -256.0f)
                reflectiveCurveToRelative(256.0f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(193.761f, 0.0f, 256.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, -141.384f, 114.616f, -256.0f, 256.0f, -256.0f)
                verticalLineToRelative(256.0f)
                reflectiveCurveToRelative(-166.957f, 0.0f, -256.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(152.389f, 89.043f)
                lineToRelative(16.577f, 51.018f)
                horizontalLineToRelative(53.643f)
                lineToRelative(-43.398f, 31.53f)
                lineToRelative(16.576f, 51.018f)
                lineToRelative(-43.398f, -31.531f)
                lineToRelative(-43.398f, 31.531f)
                lineToRelative(16.576f, -51.018f)
                lineToRelative(-43.398f, -31.53f)
                horizontalLineToRelative(53.643f)
                close()
            }
        }
        .build()
        return _clp!!
    }

private var _clp: ImageVector? = null
