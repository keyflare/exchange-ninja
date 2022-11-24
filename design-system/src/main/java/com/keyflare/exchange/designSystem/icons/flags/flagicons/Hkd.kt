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

public val FlagIcons.Hkd: ImageVector
    get() {
        if (_hkd != null) {
            return _hkd!!
        }
        _hkd = Builder(name = "Hkd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(282.43f, 193.668f)
                curveToRelative(-5.818f, 24.199f, -16.155f, 19.584f, -21.228f, 40.688f)
                curveToRelative(-29.883f, -7.185f, -48.287f, -37.235f, -41.102f, -67.12f)
                curveToRelative(7.182f, -29.883f, 37.235f, -48.287f, 67.119f, -41.102f)
                curveToRelative(-10.147f, 42.207f, 0.416f, 45.891f, -4.789f, 67.534f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(204.887f, 211.6f)
                curveToRelative(21.217f, 13.01f, 13.633f, 21.417f, 32.135f, 32.764f)
                curveToRelative(-16.068f, 26.201f, -50.333f, 34.416f, -76.535f, 18.349f)
                curveToRelative(-26.201f, -16.067f, -34.418f, -50.334f, -18.35f, -76.535f)
                curveToRelative(37.006f, 22.692f, 43.771f, 13.785f, 62.75f, 25.422f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(197.978f, 290.892f)
                curveToRelative(18.931f, -16.158f, 24.58f, -6.348f, 41.089f, -20.438f)
                curveToRelative(19.955f, 23.377f, 17.179f, 58.505f, -6.197f, 78.46f)
                curveToRelative(-23.378f, 19.955f, -58.506f, 17.176f, -78.458f, -6.199f)
                curveToRelative(33.014f, -28.183f, 26.633f, -37.372f, 43.566f, -51.823f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(271.254f, 321.965f)
                curveToRelative(-9.52f, -22.997f, 1.556f, -25.341f, -6.743f, -45.394f)
                curveToRelative(28.399f, -11.753f, 60.951f, 1.741f, 72.705f, 30.14f)
                curveToRelative(11.753f, 28.399f, -1.743f, 60.95f, -30.142f, 72.704f)
                curveToRelative(-16.597f, -40.109f, -27.306f, -36.88f, -35.82f, -57.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFFf0f0f0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(323.45f, 261.876f)
                curveToRelative(-24.813f, 1.947f, -23.622f, -9.313f, -45.257f, -7.615f)
                curveToRelative(-2.403f, -30.639f, 20.491f, -57.43f, 51.132f, -59.835f)
                curveToRelative(30.64f, -2.399f, 57.43f, 20.493f, 59.832f, 51.135f)
                curveToRelative(-43.277f, 3.393f, -43.516f, 14.576f, -65.707f, 16.315f)
                close()
            }
        }
        .build()
        return _hkd!!
    }

private var _hkd: ImageVector? = null
