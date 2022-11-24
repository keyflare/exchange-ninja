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

public val FlagIcons.Uyu: ImageVector
    get() {
        if (_uyu != null) {
            return _uyu!!
        }
        _uyu = Builder(name = "Uyu", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 189.217f)
                horizontalLineToRelative(247.181f)
                curveToRelative(-6.419f, -23.814f, -16.175f, -46.255f, -28.755f, -66.783f)
                horizontalLineToRelative(-218.426f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(96.643f, 456.348f)
                horizontalLineToRelative(318.713f)
                curveToRelative(23.363f, -18.608f, 43.399f, -41.21f, 59.069f, -66.783f)
                horizontalLineToRelative(-436.851f)
                curveToRelative(15.671f, 25.572f, 35.707f, 48.175f, 59.069f, 66.783f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                verticalLineToRelative(55.652f)
                horizontalLineToRelative(159.357f)
                curveToRelative(-43.73f, -34.828f, -99.108f, -55.652f, -159.357f, -55.652f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 189.217f)
                horizontalLineToRelative(247.181f)
                curveToRelative(-6.419f, -23.814f, -16.175f, -46.255f, -28.755f, -66.783f)
                horizontalLineToRelative(-218.426f)
                close()
            }
            path(fill = SolidColor(Color(0xFF338af3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 23.107f, 3.08f, 45.489f, 8.819f, 66.783f)
                horizontalLineToRelative(494.363f)
                curveToRelative(5.738f, -21.294f, 8.818f, -43.676f, 8.818f, -66.783f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(222.609f, 149.821f)
                lineToRelative(-31.266f, 14.707f)
                lineToRelative(16.649f, 30.28f)
                lineToRelative(-33.95f, -6.494f)
                lineToRelative(-4.302f, 34.295f)
                lineToRelative(-23.646f, -25.224f)
                lineToRelative(-23.648f, 25.224f)
                lineToRelative(-4.301f, -34.295f)
                lineToRelative(-33.95f, 6.492f)
                lineToRelative(16.648f, -30.279f)
                lineToRelative(-31.264f, -14.706f)
                lineToRelative(31.265f, -14.705f)
                lineToRelative(-16.649f, -30.28f)
                lineToRelative(33.949f, 6.494f)
                lineToRelative(4.303f, -34.295f)
                lineToRelative(23.647f, 25.224f)
                lineToRelative(23.647f, -25.224f)
                lineToRelative(4.301f, 34.295f)
                lineToRelative(33.951f, -6.494f)
                lineToRelative(-16.649f, 30.281f)
                close()
            }
        }
        .build()
        return _uyu!!
    }

private var _uyu: ImageVector? = null
