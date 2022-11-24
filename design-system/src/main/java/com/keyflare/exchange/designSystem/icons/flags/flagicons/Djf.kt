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

public val FlagIcons.Djf: ImageVector
    get() {
        if (_djf != null) {
            return _djf!!
        }
        _djf = Builder(name = "Djf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(233.739f, 278.261f)
                reflectiveCurveToRelative(-158.609f, -203.316f, -158.759f, -203.28f)
                curveToRelative(46.326f, -46.327f, 110.327f, -74.981f, 181.02f, -74.981f)
                curveToRelative(141.384f, 0.0f, 256.0f, 114.616f, 256.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(233.739f, 256.0f)
                reflectiveCurveToRelative(-158.609f, 181.055f, -158.759f, 181.019f)
                curveToRelative(46.326f, 46.327f, 110.327f, 74.981f, 181.02f, 74.981f)
                curveToRelative(141.384f, 0.0f, 256.0f, -114.616f, 256.0f, -256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(74.98f, 74.98f)
                curveToRelative(-99.974f, 99.974f, -99.974f, 262.065f, 0.0f, 362.04f)
                curveToRelative(41.313f, -41.313f, 81.046f, -81.046f, 181.02f, -181.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(103.61f, 189.217f)
                lineToRelative(16.575f, 51.016f)
                horizontalLineToRelative(53.646f)
                lineToRelative(-43.398f, 31.532f)
                lineToRelative(16.574f, 51.018f)
                lineToRelative(-43.397f, -31.531f)
                lineToRelative(-43.399f, 31.531f)
                lineToRelative(16.578f, -51.018f)
                lineToRelative(-43.398f, -31.532f)
                horizontalLineToRelative(53.642f)
                close()
            }
        }
        .build()
        return _djf!!
    }

private var _djf: ImageVector? = null
