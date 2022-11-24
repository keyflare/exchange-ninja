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

public val FlagIcons.Bam: ImageVector
    get() {
        if (_bam != null) {
            return _bam!!
        }
        _bam = Builder(name = "Bam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
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
                moveToRelative(256.0f, 0.0f)
                curveToRelative(-90.77f, 0.0f, -170.5f, 47.243f, -215.956f, 118.479f)
                lineToRelative(347.159f, 357.37f)
                curveToRelative(74.743f, -44.702f, 124.797f, -126.426f, 124.797f, -219.849f)
                curveToRelative(0.0f, -141.384f, -114.616f, -256.0f, -256.0f, -256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, -66.422f, -25.298f, -126.93f, -66.783f, -172.428f)
                verticalLineToRelative(344.857f)
                curveToRelative(41.485f, -45.499f, 66.783f, -106.007f, 66.783f, -172.429f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(319.789f, 481.873f)
                lineToRelative(26.815f, -0.017f)
                lineToRelative(8.272f, -25.509f)
                lineToRelative(8.302f, 25.499f)
                lineToRelative(13.45f, -0.008f)
                curveToRelative(8.247f, -4.415f, 16.224f, -9.267f, 23.9f, -14.529f)
                lineToRelative(-355.839f, -355.838f)
                curveToRelative(-5.864f, 8.556f, -11.212f, 17.49f, -16.021f, 26.75f)
                lineToRelative(3.162f, 9.712f)
                lineToRelative(26.815f, -0.017f)
                lineToRelative(-21.684f, 15.775f)
                lineToRelative(8.302f, 25.499f)
                lineToRelative(-21.704f, -15.748f)
                lineToRelative(-12.945f, 9.416f)
                curveToRelative(-6.901f, 23.176f, -10.614f, 47.725f, -10.614f, 73.142f)
                curveToRelative(0.0f, 141.384f, 114.616f, 256.0f, 256.0f, 256.0f)
                curveToRelative(29.892f, 0.0f, 58.583f, -5.132f, 85.25f, -14.552f)
                close()
                moveTo(57.099f, 244.87f)
                lineTo(65.369f, 219.362f)
                lineTo(43.667f, 203.612f)
                lineTo(70.482f, 203.595f)
                lineTo(78.753f, 178.086f)
                lineTo(87.055f, 203.585f)
                lineTo(113.87f, 203.568f)
                lineTo(92.185f, 219.343f)
                lineTo(100.487f, 244.842f)
                lineTo(78.783f, 229.094f)
                close()
                moveTo(112.324f, 300.522f)
                lineTo(120.594f, 275.014f)
                lineTo(98.892f, 259.264f)
                lineTo(125.707f, 259.247f)
                lineTo(133.978f, 233.738f)
                lineTo(142.28f, 259.237f)
                lineTo(169.095f, 259.22f)
                lineTo(147.411f, 274.995f)
                lineTo(155.713f, 300.494f)
                lineTo(134.009f, 284.746f)
                close()
                moveTo(167.548f, 356.174f)
                lineTo(175.818f, 330.666f)
                lineTo(154.116f, 314.916f)
                lineTo(180.931f, 314.899f)
                lineTo(189.202f, 289.39f)
                lineTo(197.504f, 314.889f)
                lineTo(224.319f, 314.872f)
                lineTo(202.635f, 330.647f)
                lineTo(210.937f, 356.146f)
                lineTo(189.233f, 340.396f)
                close()
                moveTo(244.457f, 396.051f)
                lineTo(222.772f, 411.826f)
                lineTo(231.042f, 386.318f)
                lineTo(209.34f, 370.568f)
                lineTo(236.155f, 370.551f)
                lineTo(244.427f, 345.042f)
                lineTo(252.729f, 370.541f)
                lineTo(279.544f, 370.524f)
                lineTo(257.86f, 386.299f)
                lineTo(266.162f, 411.798f)
                close()
                moveTo(277.997f, 467.478f)
                lineTo(286.267f, 441.97f)
                lineTo(264.565f, 426.22f)
                lineTo(291.38f, 426.203f)
                lineTo(299.651f, 400.694f)
                lineTo(307.953f, 426.193f)
                lineTo(334.768f, 426.176f)
                lineTo(313.084f, 441.951f)
                lineTo(321.386f, 467.45f)
                lineTo(299.682f, 451.7f)
                close()
            }
        }
        .build()
        return _bam!!
    }

private var _bam: ImageVector? = null
