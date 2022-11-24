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

public val CryptoIcons.Fei: ImageVector
    get() {
        if (_fei != null) {
            return _fei!!
        }
        _fei = Builder(name = "Fei", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF23996F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8379f, 24.8357f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1643f, 32.0f, 0.0f, 24.8379f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1643f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8357f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.2278f, 20.5573f)
                lineTo(21.2156f, 13.6967f)
                curveTo(20.8255f, 13.0316f, 20.1117f, 12.6216f, 19.3381f, 12.6216f)
                horizontalLineTo(15.9865f)
                horizontalLineTo(12.6482f)
                curveTo(11.8745f, 12.6216f, 11.1607f, 13.0316f, 10.7706f, 13.6989f)
                lineTo(6.7695f, 20.5595f)
                curveTo(6.1998f, 21.5393f, 6.9047f, 22.7695f, 8.0397f, 22.7695f)
                horizontalLineTo(15.9865f)
                horizontalLineTo(23.9598f)
                curveTo(25.0948f, 22.7695f, 25.8019f, 21.5371f, 25.2278f, 20.5573f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7986f, 10.6665f)
                horizontalLineTo(18.0547f)
                curveTo(18.6487f, 10.6665f, 19.0212f, 10.0214f, 18.7241f, 9.5072f)
                lineTo(16.9641f, 6.457f)
                curveTo(16.5296f, 5.7056f, 15.4501f, 5.6945f, 14.9979f, 6.4349f)
                lineTo(13.1381f, 9.4917f)
                curveTo(12.8255f, 10.0059f, 13.1957f, 10.6665f, 13.7986f, 10.6665f)
                close()
            }
        }
        .build()
        return _fei!!
    }

private var _fei: ImageVector? = null
