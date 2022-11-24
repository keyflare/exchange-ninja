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

public val FlagIcons.Egp: ImageVector
    get() {
        if (_egp != null) {
            return _egp!!
        }
        _egp = Builder(name = "Egp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(-110.071f, 0.0f, -203.906f, 69.472f, -240.077f, 166.957f)
                horizontalLineToRelative(480.155f)
                curveToRelative(-36.172f, -97.485f, -130.007f, -166.957f, -240.078f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(110.071f, 0.0f, 203.906f, -69.472f, 240.077f, -166.957f)
                horizontalLineToRelative(-480.154f)
                curveToRelative(36.171f, 97.485f, 130.006f, 166.957f, 240.077f, 166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9811)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.043f, 228.174f)
                horizontalLineToRelative(-66.783f)
                curveToRelative(0.0f, -12.294f, -9.967f, -22.261f, -22.261f, -22.261f)
                reflectiveCurveToRelative(-22.261f, 9.967f, -22.261f, 22.261f)
                horizontalLineToRelative(-66.783f)
                curveToRelative(0.0f, 12.295f, 10.709f, 22.261f, 23.003f, 22.261f)
                horizontalLineToRelative(-0.742f)
                curveToRelative(0.0f, 12.295f, 9.966f, 22.261f, 22.261f, 22.261f)
                curveToRelative(0.0f, 12.295f, 9.966f, 22.261f, 22.261f, 22.261f)
                horizontalLineToRelative(44.522f)
                curveToRelative(12.295f, 0.0f, 22.261f, -9.966f, 22.261f, -22.261f)
                curveToRelative(12.295f, 0.0f, 22.261f, -9.966f, 22.261f, -22.261f)
                horizontalLineToRelative(-0.741f)
                curveToRelative(12.294f, 0.0f, 23.002f, -9.966f, 23.002f, -22.261f)
                close()
            }
        }
        .build()
        return _egp!!
    }

private var _egp: ImageVector? = null
