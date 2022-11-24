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

public val FlagIcons.Twd: ImageVector
    get() {
        if (_twd != null) {
            return _twd!!
        }
        _twd = Builder(name = "Twd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, 141.384f, -114.616f, 256.0f, -256.0f, 256.0f)
                reflectiveCurveToRelative(-256.0f, -114.616f, -256.0f, -256.0f)
                curveToRelative(87.93f, -87.93f, 162.504f, -162.504f, 256.0f, -256.0f)
                curveToRelative(141.384f, 0.0f, 256.0f, 114.616f, 256.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 256.0f)
                curveToRelative(0.0f, -141.384f, 0.0f, -158.052f, 0.0f, -256.0f)
                curveToRelative(-141.384f, 0.0f, -256.0f, 114.616f, -256.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(222.609f, 149.821f)
                lineToRelative(-31.265f, 14.708f)
                lineToRelative(16.648f, 30.279f)
                lineToRelative(-33.949f, -6.496f)
                lineToRelative(-4.303f, 34.297f)
                lineToRelative(-23.646f, -25.224f)
                lineToRelative(-23.648f, 25.224f)
                lineToRelative(-4.301f, -34.297f)
                lineToRelative(-33.95f, 6.494f)
                lineToRelative(16.648f, -30.279f)
                lineToRelative(-31.264f, -14.706f)
                lineToRelative(31.265f, -14.705f)
                lineToRelative(-16.649f, -30.28f)
                lineToRelative(33.949f, 6.495f)
                lineToRelative(4.303f, -34.296f)
                lineToRelative(23.647f, 25.224f)
                lineToRelative(23.647f, -25.224f)
                lineToRelative(4.302f, 34.296f)
                lineToRelative(33.95f, -6.495f)
                lineToRelative(-16.649f, 30.281f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.098f, 149.816f)
                moveToRelative(-47.653f, 0.0f)
                arcToRelative(47.653f, 47.653f, 0.0f, true, true, 95.306f, 0.0f)
                arcToRelative(47.653f, 47.653f, 0.0f, true, true, -95.306f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(146.094f, 175.213f)
                curveToRelative(-14.001f, 0.0f, -25.391f, -11.391f, -25.391f, -25.392f)
                reflectiveCurveToRelative(11.391f, -25.392f, 25.391f, -25.392f)
                curveToRelative(14.001f, 0.0f, 25.392f, 11.391f, 25.392f, 25.392f)
                curveToRelative(-0.001f, 14.001f, -11.393f, 25.392f, -25.392f, 25.392f)
                close()
            }
        }
        .build()
        return _twd!!
    }

private var _twd: ImageVector? = null
