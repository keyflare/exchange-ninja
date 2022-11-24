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

public val FlagIcons.Dop: ImageVector
    get() {
        if (_dop != null) {
            return _dop!!
        }
        _dop = Builder(name = "Dop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(8.819f, 322.783f)
                curveToRelative(23.638f, 87.703f, 92.695f, 156.761f, 180.399f, 180.399f)
                verticalLineToRelative(-180.399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(189.217f, 8.819f)
                curveToRelative(-87.703f, 23.637f, -156.761f, 92.695f, -180.398f, 180.398f)
                horizontalLineToRelative(180.399f)
                verticalLineToRelative(-180.398f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(503.181f, 189.217f)
                curveToRelative(-23.637f, -87.703f, -92.695f, -156.761f, -180.398f, -180.398f)
                verticalLineToRelative(180.399f)
                horizontalLineToRelative(180.398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(322.783f, 503.181f)
                curveToRelative(87.703f, -23.638f, 156.761f, -92.695f, 180.399f, -180.399f)
                horizontalLineToRelative(-180.399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF496e2d)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(322.783f, 256.0f)
                curveToRelative(0.0f, 36.884f, -29.899f, 66.783f, -66.783f, 66.783f)
                curveToRelative(-36.883f, 0.0f, -66.783f, -29.899f, -66.783f, -66.783f)
                reflectiveCurveToRelative(66.783f, -66.783f, 66.783f, -66.783f)
                reflectiveCurveToRelative(66.783f, 29.899f, 66.783f, 66.783f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(189.217f, 256.0f)
                curveToRelative(0.0f, -36.884f, 29.9f, -66.783f, 66.783f, -66.783f)
                curveToRelative(36.884f, 0.0f, 66.783f, 29.899f, 66.783f, 66.783f)
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(218.435f, 222.609f)
                verticalLineToRelative(41.739f)
                curveToRelative(0.0f, 20.747f, 16.818f, 37.565f, 37.565f, 37.565f)
                reflectiveCurveToRelative(37.565f, -16.818f, 37.565f, -37.565f)
                verticalLineToRelative(-41.739f)
                close()
            }
        }
        .build()
        return _dop!!
    }

private var _dop: ImageVector? = null
