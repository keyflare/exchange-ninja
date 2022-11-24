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

public val FlagIcons.Gmd: ImageVector
    get() {
        if (_gmd != null) {
            return _gmd!!
        }
        _gmd = Builder(name = "Gmd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-105.835f, 0.0f, -196.663f, 64.226f, -235.652f, 155.826f)
                horizontalLineToRelative(471.305f)
                curveToRelative(-38.989f, -91.6f, -129.818f, -155.826f, -235.653f, -155.826f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 512.0f)
                curveToRelative(105.835f, 0.0f, 196.664f, -64.226f, 235.652f, -155.826f)
                horizontalLineToRelative(-471.304f)
                curveToRelative(38.989f, 91.6f, 129.817f, 155.826f, 235.652f, 155.826f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(503.181f, 189.217f)
                horizontalLineToRelative(-494.362f)
                curveToRelative(-5.739f, 21.293f, -8.819f, 43.676f, -8.819f, 66.783f)
                reflectiveCurveToRelative(3.08f, 45.49f, 8.819f, 66.783f)
                horizontalLineToRelative(494.363f)
                curveToRelative(5.738f, -21.293f, 8.818f, -43.676f, 8.818f, -66.783f)
                reflectiveCurveToRelative(-3.08f, -45.49f, -8.819f, -66.783f)
                close()
            }
        }
        .build()
        return _gmd!!
    }

private var _gmd: ImageVector? = null
