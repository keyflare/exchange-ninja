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

public val FlagIcons.Htg: ImageVector
    get() {
        if (_htg != null) {
            return _htg!!
        }
        _htg = Builder(name = "Htg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, 141.384f, -114.616f, 256.0f, -256.0f, 256.0f)
                reflectiveCurveToRelative(-256.0f, -114.616f, -256.0f, -256.0f)
                reflectiveCurveToRelative(256.0f, -256.0f, 256.0f, -256.0f)
                reflectiveCurveToRelative(256.0f, 114.616f, 256.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, -141.384f, 114.616f, -256.0f, 256.0f, -256.0f)
                reflectiveCurveToRelative(256.0f, 114.616f, 256.0f, 256.0f)
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(345.043f, 322.783f)
                lineToRelative(-89.043f, -11.131f)
                lineToRelative(-89.043f, 11.131f)
                verticalLineToRelative(-133.566f)
                horizontalLineToRelative(178.086f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 267.13f)
                moveToRelative(-44.522f, 0.0f)
                arcToRelative(44.522f, 44.522f, 0.0f, true, true, 89.044f, 0.0f)
                arcToRelative(44.522f, 44.522f, 0.0f, true, true, -89.044f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 267.13f)
                moveToRelative(-22.261f, 0.0f)
                arcToRelative(22.261f, 22.261f, 0.0f, true, true, 44.522f, 0.0f)
                arcToRelative(22.261f, 22.261f, 0.0f, true, true, -44.522f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(222.609f, 211.478f)
                horizontalLineToRelative(66.782f)
                lineToRelative(-33.391f, 33.392f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(244.87f, 233.739f)
                horizontalLineToRelative(22.261f)
                verticalLineToRelative(66.783f)
                horizontalLineToRelative(-22.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(291.617f, 293.843f)
                horizontalLineToRelative(-71.236f)
                lineToRelative(-53.424f, 28.94f)
                horizontalLineToRelative(178.086f)
                close()
            }
        }
        .build()
        return _htg!!
    }

private var _htg: ImageVector? = null
