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

public val FlagIcons.Iqd: ImageVector
    get() {
        if (_iqd != null) {
            return _iqd!!
        }
        _iqd = Builder(name = "Iqd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(194.783f, 239.304f)
                curveToRelative(-0.14f, 0.0f, -0.277f, 0.009f, -0.417f, 0.011f)
                verticalLineToRelative(-0.011f)
                horizontalLineToRelative(-48.937f)
                curveToRelative(2.481f, -9.586f, 11.179f, -16.696f, 21.528f, -16.696f)
                verticalLineToRelative(-33.391f)
                curveToRelative(-30.687f, 0.0f, -55.652f, 24.966f, -55.652f, 55.652f)
                verticalLineToRelative(27.27f)
                verticalLineToRelative(0.557f)
                horizontalLineToRelative(83.061f)
                horizontalLineToRelative(0.417f)
                curveToRelative(3.069f, 0.0f, 5.565f, 2.497f, 5.565f, 5.565f)
                verticalLineToRelative(11.13f)
                horizontalLineToRelative(-111.305f)
                verticalLineToRelative(33.391f)
                horizontalLineToRelative(144.696f)
                verticalLineToRelative(-44.522f)
                curveToRelative(0.0f, -21.48f, -17.476f, -38.956f, -38.956f, -38.956f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(278.261f, 289.391f)
                verticalLineToRelative(-100.174f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(133.566f)
                horizontalLineToRelative(55.652f)
                verticalLineToRelative(-33.392f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(389.565f, 289.392f)
                verticalLineToRelative(-100.175f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(100.175f)
                horizontalLineToRelative(-11.131f)
                verticalLineToRelative(-33.391f)
                horizontalLineToRelative(-33.391f)
                verticalLineToRelative(66.783f)
                horizontalLineToRelative(100.174f)
                verticalLineToRelative(-33.392f)
                close()
            }
        }
        .build()
        return _iqd!!
    }

private var _iqd: ImageVector? = null
