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

public val FlagIcons.Ils: ImageVector
    get() {
        if (_ils != null) {
            return _ils!!
        }
        _ils = Builder(name = "Ils", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(352.393f, 200.348f)
                horizontalLineToRelative(-64.263f)
                lineToRelative(-32.13f, -55.652f)
                lineToRelative(-32.129f, 55.652f)
                horizontalLineToRelative(-64.264f)
                lineToRelative(32.134f, 55.652f)
                lineToRelative(-32.134f, 55.652f)
                horizontalLineToRelative(64.264f)
                lineToRelative(32.129f, 55.652f)
                lineToRelative(32.13f, -55.652f)
                horizontalLineToRelative(64.263f)
                lineToRelative(-32.134f, -55.652f)
                close()
                moveTo(295.475f, 256.0f)
                lineTo(275.739f, 290.188f)
                horizontalLineToRelative(-39.475f)
                lineToRelative(-19.739f, -34.188f)
                lineToRelative(19.738f, -34.188f)
                horizontalLineToRelative(39.475f)
                close()
                moveTo(256.0f, 187.623f)
                lineTo(263.346f, 200.347f)
                horizontalLineToRelative(-14.69f)
                close()
                moveTo(196.786f, 221.812f)
                horizontalLineToRelative(14.692f)
                lineToRelative(-7.346f, 12.724f)
                close()
                moveTo(196.786f, 290.188f)
                lineTo(204.133f, 277.464f)
                lineTo(211.479f, 290.188f)
                close()
                moveTo(256.0f, 324.376f)
                lineTo(248.655f, 311.652f)
                horizontalLineToRelative(14.691f)
                close()
                moveTo(315.214f, 290.188f)
                horizontalLineToRelative(-14.692f)
                lineToRelative(7.347f, -12.724f)
                close()
                moveTo(300.522f, 221.812f)
                horizontalLineToRelative(14.692f)
                lineToRelative(-7.346f, 12.724f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(415.357f, 55.652f)
                horizontalLineToRelative(-318.714f)
                curveToRelative(-23.363f, 18.608f, -43.399f, 41.21f, -59.069f, 66.783f)
                horizontalLineToRelative(436.852f)
                curveToRelative(-15.671f, -25.572f, -35.707f, -48.175f, -59.069f, -66.783f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(96.643f, 456.348f)
                horizontalLineToRelative(318.713f)
                curveToRelative(23.363f, -18.608f, 43.399f, -41.21f, 59.069f, -66.783f)
                horizontalLineToRelative(-436.851f)
                curveToRelative(15.671f, 25.572f, 35.707f, 48.175f, 59.069f, 66.783f)
                close()
            }
        }
        .build()
        return _ils!!
    }

private var _ils: ImageVector? = null
