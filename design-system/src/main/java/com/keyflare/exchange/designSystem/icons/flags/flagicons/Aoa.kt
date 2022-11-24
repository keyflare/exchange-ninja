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

public val FlagIcons.Aoa: ImageVector
    get() {
        if (_aoa != null) {
            return _aoa!!
        }
        _aoa = Builder(name = "Aoa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFd80027)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, -141.384f, 114.616f, -256.0f, 256.0f, -256.0f)
                reflectiveCurveToRelative(256.0f, 114.616f, 256.0f, 256.0f)
                curveToRelative(-11.13f, 0.0f, -256.0f, 33.391f, -256.0f, 33.391f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(512.0f, 256.0f)
                curveToRelative(0.0f, 141.384f, -114.616f, 256.0f, -256.0f, 256.0f)
                reflectiveCurveToRelative(-256.0f, -114.616f, -256.0f, -256.0f)
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(220.898f, 203.612f)
                lineToRelative(21.702f, 15.75f)
                lineToRelative(-8.27f, 25.508f)
                lineToRelative(21.686f, -15.776f)
                lineToRelative(21.704f, 15.75f)
                lineToRelative(-8.302f, -25.5f)
                lineToRelative(21.684f, -15.774f)
                lineToRelative(-26.815f, 0.016f)
                lineToRelative(-8.303f, -25.499f)
                lineToRelative(-8.271f, 25.508f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(320.0f, 145.149f)
                curveToRelative(-20.173f, -11.647f, -42.23f, -17.144f, -64.0f, -17.106f)
                verticalLineToRelative(33.384f)
                curveToRelative(16.091f, -0.029f, 32.393f, 4.031f, 47.304f, 12.641f)
                curveToRelative(45.178f, 26.084f, 60.713f, 84.06f, 34.628f, 129.238f)
                curveToRelative(-26.083f, 45.178f, -84.058f, 60.713f, -129.237f, 34.629f)
                curveToRelative(-13.162f, -7.599f, -23.787f, -17.917f, -31.619f, -29.824f)
                lineToRelative(-27.876f, 18.404f)
                curveToRelative(10.597f, 16.109f, 24.993f, 30.056f, 42.8f, 40.336f)
                curveToRelative(61.124f, 35.29f, 139.561f, 14.273f, 174.85f, -46.851f)
                curveToRelative(35.29f, -61.124f, 14.274f, -139.561f, -46.85f, -174.851f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffda44)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(182.19f, 233.739f)
                curveToRelative(-8.85f, 16.179f, -2.908f, 36.47f, 13.27f, 45.32f)
                lineToRelative(108.449f, 59.26f)
                curveToRelative(-7.375f, 13.481f, -3.458f, 29.89f, 10.023f, 37.265f)
                lineToRelative(29.295f, 16.025f)
                curveToRelative(13.481f, 7.376f, 30.392f, 2.424f, 37.767f, -11.058f)
                lineToRelative(16.025f, -29.294f)
                close()
            }
        }
        .build()
        return _aoa!!
    }

private var _aoa: ImageVector? = null
