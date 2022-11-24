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

public val CryptoIcons.Eos: ImageVector
    get() {
        if (_eos != null) {
            return _eos!!
        }
        _eos = Builder(name = "Eos", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF4054AD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 15.9998f)
                curveTo(32.0f, 24.8373f, 24.836f, 32.0f, 15.9998f, 32.0f)
                curveTo(7.1627f, 32.0f, 0.0f, 24.8373f, 0.0f, 15.9998f)
                curveTo(0.0f, 7.164f, 7.1627f, 0.0f, 15.9998f, 0.0f)
                curveTo(24.836f, 0.0f, 32.0f, 7.164f, 32.0f, 15.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4313f, 13.4134f)
                lineTo(15.2595f, 25.0355f)
                lineTo(9.7118f, 21.7513f)
                lineTo(11.4313f, 13.4134f)
                close()
                moveTo(20.0503f, 11.8324f)
                lineTo(15.9996f, 24.1275f)
                lineTo(11.949f, 11.8324f)
                lineTo(15.9996f, 6.3285f)
                lineTo(20.0503f, 11.8324f)
                close()
                moveTo(22.2879f, 21.7513f)
                lineTo(16.7389f, 25.0355f)
                lineTo(20.5684f, 13.4134f)
                lineTo(22.2879f, 21.7513f)
                close()
                moveTo(21.2392f, 11.7829f)
                lineTo(15.9996f, 4.6641f)
                lineTo(10.7605f, 11.7829f)
                lineTo(8.6033f, 22.2414f)
                lineTo(15.9996f, 26.6182f)
                lineTo(23.396f, 22.2414f)
                lineTo(21.2392f, 11.7829f)
                close()
            }
        }
        .build()
        return _eos!!
    }

private var _eos: ImageVector? = null
