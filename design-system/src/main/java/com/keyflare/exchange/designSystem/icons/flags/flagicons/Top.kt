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

public val FlagIcons.Top: ImageVector
    get() {
        if (_top != null) {
            return _top!!
        }
        _top = Builder(name = "Top", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(166.957f, 133.565f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(-33.392f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(33.392f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(33.392f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(33.391f)
                verticalLineToRelative(-33.392f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(256.0f, 0.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(-141.384f, 0.001f, -197.575f, 0.0f, -256.0f, 0.001f)
                curveToRelative(0.0f, 141.383f, 114.616f, 255.999f, 256.0f, 255.999f)
                reflectiveCurveToRelative(256.0f, -114.616f, 256.0f, -256.0f)
                reflectiveCurveToRelative(-114.616f, -256.0f, -256.0f, -256.0f)
                close()
            }
        }
        .build()
        return _top!!
    }

private var _top: ImageVector? = null
