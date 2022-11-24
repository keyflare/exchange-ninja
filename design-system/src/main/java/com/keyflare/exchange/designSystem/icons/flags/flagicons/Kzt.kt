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

public val FlagIcons.Kzt: ImageVector
    get() {
        if (_kzt != null) {
            return _kzt!!
        }
        _kzt = Builder(name = "Kzt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(400.696f, 258.783f)
                horizontalLineToRelative(-289.392f)
                curveToRelative(0.0f, 19.979f, 17.401f, 36.174f, 37.378f, 36.174f)
                horizontalLineToRelative(-1.204f)
                curveToRelative(0.0f, 19.979f, 16.195f, 36.174f, 36.174f, 36.174f)
                curveToRelative(0.0f, 19.979f, 16.195f, 36.174f, 36.174f, 36.174f)
                horizontalLineToRelative(72.348f)
                curveToRelative(19.979f, 0.0f, 36.174f, -16.195f, 36.174f, -36.174f)
                curveToRelative(19.979f, 0.0f, 36.174f, -16.195f, 36.174f, -36.174f)
                horizontalLineToRelative(-1.204f)
                curveToRelative(19.975f, 0.0f, 37.378f, -16.195f, 37.378f, -36.174f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(356.174f, 211.478f)
                curveToRelative(0.0f, 55.324f, -44.85f, 100.174f, -100.174f, 100.174f)
                curveToRelative(-55.325f, 0.0f, -100.174f, -44.85f, -100.174f, -100.174f)
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(332.515f, 211.478f)
                lineToRelative(-31.265f, 14.707f)
                lineToRelative(16.649f, 30.28f)
                lineToRelative(-33.95f, -6.495f)
                lineToRelative(-4.302f, 34.296f)
                lineToRelative(-23.647f, -25.225f)
                lineToRelative(-23.648f, 25.225f)
                lineToRelative(-4.301f, -34.296f)
                lineToRelative(-33.95f, 6.493f)
                lineToRelative(16.648f, -30.279f)
                lineToRelative(-31.264f, -14.706f)
                lineToRelative(31.265f, -14.706f)
                lineToRelative(-16.649f, -30.279f)
                lineToRelative(33.949f, 6.494f)
                lineToRelative(4.303f, -34.296f)
                lineToRelative(23.647f, 25.225f)
                lineToRelative(23.648f, -25.225f)
                lineToRelative(4.301f, 34.296f)
                lineToRelative(33.951f, -6.494f)
                lineToRelative(-16.649f, 30.28f)
                close()
            }
        }
        .build()
        return _kzt!!
    }

private var _kzt: ImageVector? = null
