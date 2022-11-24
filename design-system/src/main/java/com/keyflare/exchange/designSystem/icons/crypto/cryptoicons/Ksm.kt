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

public val CryptoIcons.Ksm: ImageVector
    get() {
        if (_ksm != null) {
            return _ksm!!
        }
        _ksm = Builder(name = "Ksm", defaultWidth = 32.0.dp, defaultHeight = 33.0.dp, viewportWidth
                = 32.0f, viewportHeight = 33.0f).apply {
            path(fill = SolidColor(Color(0xFF302C27)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 17.0f)
                curveTo(32.0f, 25.8363f, 24.8369f, 33.0f, 15.9998f, 33.0f)
                curveTo(7.1636f, 33.0f, 0.0f, 25.8363f, 0.0f, 17.0f)
                curveTo(0.0f, 8.1628f, 7.1636f, 1.0f, 15.9998f, 1.0f)
                curveTo(24.8369f, 1.0f, 32.0f, 8.1628f, 32.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.4975f, 11.7218f)
                curveTo(27.578f, 11.6822f, 27.59f, 11.5742f, 27.5208f, 11.5178f)
                curveTo(27.1098f, 11.1865f, 25.9785f, 10.2763f, 25.7732f, 10.1442f)
                curveTo(25.5223f, 9.9803f, 24.2908f, 9.4402f, 23.1229f, 10.2819f)
                curveTo(21.9541f, 11.1236f, 21.4012f, 11.8023f, 20.911f, 12.0411f)
                curveTo(20.4217f, 12.2791f, 19.5921f, 12.5493f, 19.3464f, 12.7021f)
                curveTo(19.1011f, 12.8566f, 9.9804f, 18.5266f, 9.9804f, 18.5266f)
                horizontalLineTo(11.5175f)
                lineTo(4.5472f, 22.2037f)
                horizontalLineTo(5.2236f)
                lineTo(4.1289f, 23.0424f)
                horizontalLineTo(5.4311f)
                lineTo(5.9926f, 22.7713f)
                lineTo(5.8993f, 22.9796f)
                curveTo(5.8993f, 22.9796f, 11.3247f, 21.1726f, 12.1286f, 20.9239f)
                curveTo(12.9329f, 20.6748f, 15.1925f, 20.2539f, 16.1112f, 20.5603f)
                lineTo(15.1628f, 20.8542f)
                curveTo(15.1628f, 20.8542f, 16.6676f, 20.9721f, 16.8823f, 20.9084f)
                curveTo(16.8823f, 20.9084f, 16.7963f, 21.8435f, 17.6139f, 22.3814f)
                curveTo(18.4302f, 22.9189f, 18.9677f, 23.5532f, 18.9677f, 23.5532f)
                curveTo(18.9677f, 23.5532f, 18.4423f, 23.9465f, 18.3872f, 24.1768f)
                curveTo(18.3872f, 24.1768f, 18.6273f, 24.0933f, 18.8541f, 24.0369f)
                curveTo(19.0834f, 23.981f, 20.2488f, 23.9224f, 20.6068f, 23.9887f)
                curveTo(20.9648f, 24.0558f, 21.2191f, 24.1165f, 21.2191f, 24.1165f)
                curveTo(21.2191f, 24.1165f, 21.0862f, 23.7516f, 19.9755f, 23.4676f)
                curveTo(19.9755f, 23.4676f, 18.6712f, 22.3109f, 18.4819f, 21.8371f)
                curveTo(18.2925f, 21.3624f, 18.0171f, 20.4049f, 19.2211f, 19.713f)
                curveTo(20.4252f, 19.0202f, 22.8036f, 18.1586f, 23.7606f, 16.7562f)
                curveTo(25.0047f, 14.9329f, 24.9625f, 13.8403f, 25.3876f, 13.0679f)
                curveTo(25.7293f, 12.4512f, 27.0125f, 11.9555f, 27.4975f, 11.7218f)
                close()
            }
        }
        .build()
        return _ksm!!
    }

private var _ksm: ImageVector? = null
