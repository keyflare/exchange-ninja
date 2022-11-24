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

public val FlagIcons.Scr: ImageVector
    get() {
        if (_scr != null) {
            return _scr!!
        }
        _scr = Builder(name = "Scr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveToRelative(428.809f, 67.137f)
                curveToRelative(-45.54f, -41.692f, -106.201f, -67.137f, -172.809f, -67.137f)
                curveToRelative(-10.904f, 0.0f, -21.649f, 0.687f, -32.195f, 2.01f)
                lineToRelative(-123.631f, 142.686f)
                lineToRelative(-92.073f, 175.435f)
                curveToRelative(5.948f, 23.061f, 15.042f, 44.855f, 26.775f, 64.917f)
                lineToRelative(221.124f, -129.048f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6da544)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(469.131f, 397.838f)
                lineToRelative(-358.168f, 69.12f)
                curveToRelative(41.229f, 28.401f, 91.187f, 45.042f, 145.037f, 45.042f)
                curveToRelative(88.921f, 0.0f, 167.24f, -45.343f, 213.131f, -114.162f)
                close()
            }
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(428.845f, 67.171f)
                lineToRelative(-393.823f, 318.125f)
                curveToRelative(10.301f, 17.568f, 22.634f, 33.799f, 36.681f, 48.368f)
                lineToRelative(440.297f, -177.664f)
                curveToRelative(0.0f, -74.759f, -32.051f, -142.027f, -83.155f, -188.829f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0052b4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 22.147f, 2.814f, 43.636f, 8.101f, 64.131f)
                lineToRelative(215.704f, -318.121f)
                curveToRelative(-126.187f, 15.834f, -223.805f, 123.51f, -223.805f, 253.99f)
                close()
            }
        }
        .build()
        return _scr!!
    }

private var _scr: ImageVector? = null
