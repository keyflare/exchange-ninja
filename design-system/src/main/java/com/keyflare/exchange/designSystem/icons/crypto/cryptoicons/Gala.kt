package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

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
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons

public val CryptoIcons.Gala: ImageVector
    get() {
        if (_gala != null) {
            return _gala!!
        }
        _gala = Builder(name = "Gala", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF4F6F5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1642f, 0.0f, 0.0f, 7.162f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.1642f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8379f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.162f, 24.8379f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5169f, 15.7751f)
                lineTo(14.3131f, 16.8056f)
                lineTo(14.2886f, 23.1642f)
                lineTo(8.8447f, 19.799f)
                verticalLineTo(12.1763f)
                lineTo(7.5649f, 11.4374f)
                verticalLineTo(20.5313f)
                lineTo(15.6106f, 25.4922f)
                verticalLineTo(16.0845f)
                lineTo(12.5169f, 14.2884f)
                verticalLineTo(15.7751f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4832f, 14.2973f)
                verticalLineTo(14.2884f)
                lineTo(16.3918f, 16.0845f)
                verticalLineTo(19.6655f)
                lineTo(17.6961f, 18.9199f)
                lineTo(17.6871f, 16.8056f)
                lineTo(19.4832f, 15.7751f)
                lineTo(23.1577f, 13.6497f)
                verticalLineTo(19.799f)
                lineTo(17.7116f, 23.1642f)
                lineTo(16.3918f, 23.9521f)
                verticalLineTo(25.4922f)
                lineTo(24.4375f, 20.5313f)
                verticalLineTo(12.9085f)
                verticalLineTo(11.4374f)
                lineTo(19.4832f, 14.2973f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7381f, 12.8975f)
                lineTo(15.991f, 13.9057f)
                lineTo(10.6784f, 10.8188f)
                lineTo(15.991f, 7.9722f)
                lineTo(22.6256f, 11.5666f)
                lineTo(23.9431f, 10.8077f)
                lineTo(15.991f, 6.5055f)
                lineTo(8.0188f, 10.8188f)
                lineTo(15.991f, 15.4014f)
                lineTo(19.029f, 13.6409f)
                lineTo(17.7381f, 12.8975f)
                close()
            }
        }
        .build()
        return _gala!!
    }

private var _gala: ImageVector? = null
