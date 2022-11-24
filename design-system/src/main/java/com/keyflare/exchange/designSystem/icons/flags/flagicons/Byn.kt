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

public val FlagIcons.Byn: ImageVector
    get() {
        if (_byn != null) {
            return _byn!!
        }
        _byn = Builder(name = "Byn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFfcfcfc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(105.739f, 237.449f)
                lineToRelative(-27.826f, -50.483f)
                lineToRelative(27.826f, -49.691f)
                lineToRelative(27.826f, 49.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(50.087f, 237.449f)
                lineToRelative(-27.826f, -50.483f)
                lineToRelative(27.826f, -49.691f)
                lineToRelative(27.826f, 49.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(105.739f, 374.725f)
                lineToRelative(-27.826f, -50.483f)
                lineToRelative(27.826f, -49.691f)
                lineToRelative(27.826f, 49.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(50.087f, 374.725f)
                lineToRelative(-27.826f, -50.483f)
                lineToRelative(27.826f, -49.691f)
                lineToRelative(27.826f, 49.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(133.565f, 49.692f)
                lineToRelative(-7.878f, -14.068f)
                curveToRelative(-14.13f, 8.372f, -27.383f, 18.065f, -39.594f, 28.909f)
                lineToRelative(19.646f, 35.641f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(105.739f, 411.826f)
                lineToRelative(-19.854f, 35.456f)
                curveToRelative(12.2f, 10.858f, 25.444f, 20.566f, 39.568f, 28.955f)
                lineToRelative(8.113f, -14.719f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(155.826f, 322.783f)
                verticalLineToRelative(168.863f)
                curveToRelative(30.769f, 13.097f, 64.622f, 20.354f, 100.174f, 20.354f)
                curveToRelative(110.071f, 0.0f, 203.906f, -69.472f, 240.077f, -166.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFa2001d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(496.077f, 345.043f)
                curveToRelative(10.291f, -27.733f, 15.923f, -57.729f, 15.923f, -89.043f)
                curveToRelative(0.0f, -141.384f, -114.616f, -256.0f, -256.0f, -256.0f)
                curveToRelative(-35.549f, 0.0f, -69.405f, 7.253f, -100.174f, 20.348f)
                verticalLineToRelative(324.696f)
                horizontalLineToRelative(340.251f)
                close()
            }
        }
        .build()
        return _byn!!
    }

private var _byn: ImageVector? = null
