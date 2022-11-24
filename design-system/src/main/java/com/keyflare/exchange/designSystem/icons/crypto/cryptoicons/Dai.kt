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

public val CryptoIcons.Dai: ImageVector
    get() {
        if (_dai != null) {
            return _dai!!
        }
        _dai = Builder(name = "Dai", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFFAB01E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1639f, 0.0f, 0.0f, 7.1617f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8361f, 7.1639f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8361f, 32.0f, 32.0f, 24.8361f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1617f, 24.8361f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3534f, 16.0135f)
                curveTo(22.3534f, 16.34f, 22.3268f, 16.662f, 22.2757f, 16.9795f)
                horizontalLineTo(11.612f)
                verticalLineTo(15.0831f)
                horizontalLineTo(22.2801f)
                curveTo(22.329f, 15.3873f, 22.3534f, 15.6982f, 22.3534f, 16.0135f)
                close()
                moveTo(20.6457f, 20.1374f)
                curveTo(19.5442f, 21.241f, 18.0786f, 21.8473f, 16.5197f, 21.8473f)
                horizontalLineTo(11.612f)
                verticalLineTo(18.685f)
                horizontalLineTo(21.7094f)
                curveTo(21.4363f, 19.2158f, 21.0787f, 19.7043f, 20.6457f, 20.1374f)
                close()
                moveTo(11.612f, 10.1798f)
                horizontalLineTo(16.5197f)
                curveTo(18.0786f, 10.1798f, 19.5442f, 10.7861f, 20.6457f, 11.8875f)
                curveTo(21.0898f, 12.3317f, 21.4519f, 12.8335f, 21.7272f, 13.3754f)
                horizontalLineTo(11.612f)
                verticalLineTo(10.1798f)
                close()
                moveTo(25.4735f, 13.3754f)
                horizontalLineTo(23.5859f)
                curveTo(22.5178f, 10.5107f, 19.7575f, 8.4721f, 16.5197f, 8.4721f)
                horizontalLineTo(9.9043f)
                verticalLineTo(13.3754f)
                horizontalLineTo(7.7969f)
                verticalLineTo(15.0831f)
                horizontalLineTo(9.9043f)
                verticalLineTo(16.9795f)
                horizontalLineTo(7.7969f)
                verticalLineTo(18.685f)
                horizontalLineTo(9.9043f)
                verticalLineTo(23.5527f)
                horizontalLineTo(16.5197f)
                curveTo(19.7442f, 23.5527f, 22.4933f, 21.5319f, 23.5726f, 18.685f)
                horizontalLineTo(25.4735f)
                verticalLineTo(16.9795f)
                horizontalLineTo(23.9989f)
                curveTo(24.0411f, 16.662f, 24.0611f, 16.34f, 24.0611f, 16.0135f)
                curveTo(24.0611f, 15.6982f, 24.0412f, 15.3873f, 24.0034f, 15.0831f)
                horizontalLineTo(25.4735f)
                verticalLineTo(13.3754f)
                close()
            }
        }
        .build()
        return _dai!!
    }

private var _dai: ImageVector? = null
