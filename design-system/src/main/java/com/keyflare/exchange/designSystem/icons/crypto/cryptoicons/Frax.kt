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

public val CryptoIcons.Frax: ImageVector
    get() {
        if (_frax != null) {
            return _frax!!
        }
        _frax = Builder(name = "Frax", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF353535)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9989f, 0.0f)
                curveTo(7.1616f, 0.0f, 0.0f, 7.1638f, 0.0f, 16.0011f)
                curveTo(0.0f, 24.8362f, 7.1616f, 32.0f, 15.9989f, 32.0f)
                curveTo(24.8362f, 32.0f, 32.0f, 24.8362f, 32.0f, 16.0011f)
                curveTo(32.0f, 7.1638f, 24.8362f, 0.0f, 15.9989f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9241f, 20.1501f)
                curveTo(17.3158f, 20.4398f, 16.6361f, 20.6024f, 15.9186f, 20.6024f)
                curveTo(15.2524f, 20.6024f, 14.6196f, 20.4621f, 14.0469f, 20.2103f)
                curveTo(13.0486f, 19.7735f, 12.2331f, 18.9959f, 11.7451f, 18.0288f)
                curveTo(11.4287f, 17.3982f, 11.2483f, 16.6852f, 11.2483f, 15.932f)
                curveTo(11.2483f, 15.2234f, 11.4064f, 14.5527f, 11.6916f, 13.9511f)
                curveTo(12.1529f, 12.9662f, 12.9484f, 12.1707f, 13.931f, 11.7072f)
                curveTo(14.5349f, 11.422f, 15.2078f, 11.2638f, 15.9186f, 11.2638f)
                curveTo(16.6629f, 11.2638f, 17.367f, 11.4376f, 17.9932f, 11.7496f)
                curveTo(18.9625f, 12.2331f, 19.7423f, 13.0442f, 20.1858f, 14.038f)
                curveTo(20.4442f, 14.6173f, 20.5891f, 15.2591f, 20.5891f, 15.932f)
                curveTo(20.5891f, 16.6339f, 20.4331f, 17.3001f, 20.1546f, 17.8973f)
                curveTo(19.6956f, 18.8822f, 18.9023f, 19.6822f, 17.9241f, 20.1501f)
                close()
                moveTo(22.3472f, 20.081f)
                curveTo(23.1427f, 18.8555f, 23.5683f, 17.4272f, 23.5683f, 15.932f)
                curveTo(23.5683f, 14.4591f, 23.1538f, 13.0486f, 22.3806f, 11.8342f)
                lineTo(24.9609f, 9.2405f)
                lineTo(22.7127f, 7.0034f)
                lineTo(20.1635f, 9.5659f)
                curveTo(18.9179f, 8.7325f, 17.4517f, 8.2824f, 15.9186f, 8.2824f)
                curveTo(14.4101f, 8.2824f, 12.9684f, 8.7169f, 11.7362f, 9.5236f)
                lineTo(9.2383f, 7.039f)
                lineTo(7.0034f, 9.2851f)
                lineTo(9.4991f, 11.7696f)
                curveTo(8.6991f, 12.9974f, 8.269f, 14.4324f, 8.269f, 15.932f)
                curveTo(8.269f, 17.4807f, 8.7258f, 18.958f, 9.5748f, 20.2103f)
                lineTo(7.0368f, 22.7616f)
                lineTo(9.2851f, 24.9966f)
                lineTo(11.8521f, 22.4162f)
                curveTo(13.0598f, 23.1761f, 14.4569f, 23.5839f, 15.9186f, 23.5839f)
                curveTo(17.4316f, 23.5839f, 18.88f, 23.1449f, 20.1145f, 22.3316f)
                lineTo(22.7594f, 24.9609f)
                lineTo(24.9944f, 22.7148f)
                lineTo(22.3472f, 20.081f)
                close()
            }
        }
        .build()
        return _frax!!
    }

private var _frax: ImageVector? = null
