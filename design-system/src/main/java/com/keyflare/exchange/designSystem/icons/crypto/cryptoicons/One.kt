package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val CryptoIcons.One: ImageVector
    get() {
        if (_one != null) {
            return _one!!
        }
        _one = Builder(name = "One", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF02B4DB), 0.0486928f to Color(0xFF02B4DB),
                    1.0f to Color(0xFF66F9BD), start = Offset(4.79551f,29.9543f), end =
                    Offset(26.3963f,4.59726f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                    = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                    NonZero) {
                moveTo(16.3824f, 0.9998f)
                curveTo(7.8878f, 0.9998f, 1.0f, 7.8807f, 1.0f, 16.3715f)
                curveTo(1.0f, 24.8602f, 7.8878f, 31.7432f, 16.3824f, 31.7432f)
                curveTo(24.877f, 31.7432f, 31.7648f, 24.8602f, 31.7648f, 16.3715f)
                curveTo(31.7648f, 7.8807f, 24.877f, 0.9998f, 16.3824f, 0.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3585f, 23.5696f)
                curveTo(20.1203f, 23.5696f, 19.1102f, 22.5623f, 19.1102f, 21.3229f)
                verticalLineTo(16.9188f)
                curveTo(21.0218f, 16.7037f, 22.3729f, 16.3012f, 23.6068f, 15.115f)
                verticalLineTo(21.3229f)
                curveTo(23.6068f, 22.5623f, 22.5988f, 23.5696f, 21.3585f, 23.5696f)
                close()
                moveTo(19.1102f, 11.418f)
                curveTo(19.1102f, 10.1807f, 20.1203f, 9.1712f, 21.3585f, 9.1712f)
                curveTo(22.5988f, 9.1712f, 23.6068f, 10.1807f, 23.6068f, 11.418f)
                verticalLineTo(12.7703f)
                curveTo(23.2168f, 13.3496f, 22.8375f, 13.8032f, 22.456f, 14.146f)
                curveTo(22.0362f, 14.5251f, 21.5951f, 14.7913f, 21.0666f, 14.9915f)
                curveTo(20.5103f, 15.1981f, 19.8774f, 15.3258f, 19.1102f, 15.4174f)
                verticalLineTo(11.418f)
                close()
                moveTo(11.4062f, 23.5696f)
                curveTo(10.168f, 23.5696f, 9.1601f, 22.5623f, 9.1601f, 21.3229f)
                verticalLineTo(20.2623f)
                curveTo(9.1686f, 20.0856f, 9.2411f, 19.5702f, 9.7312f, 19.0144f)
                curveTo(10.6092f, 18.0134f, 12.2139f, 17.562f, 13.6545f, 17.3618f)
                verticalLineTo(21.3229f)
                curveTo(13.6545f, 22.5623f, 12.6465f, 23.5696f, 11.4062f, 23.5696f)
                close()
                moveTo(11.4062f, 9.1712f)
                curveTo(12.6465f, 9.1712f, 13.6545f, 10.1807f, 13.6545f, 11.418f)
                verticalLineTo(15.8561f)
                curveTo(12.4632f, 16.0031f, 11.4318f, 16.2693f, 10.5772f, 16.6441f)
                curveTo(10.0338f, 16.8847f, 9.5607f, 17.1701f, 9.1601f, 17.4981f)
                verticalLineTo(11.418f)
                curveTo(9.1601f, 10.1807f, 10.168f, 9.1712f, 11.4062f, 9.1712f)
                close()
                moveTo(24.0053f, 8.773f)
                curveTo(23.2978f, 8.0681f, 22.358f, 7.6783f, 21.3585f, 7.6783f)
                curveTo(20.359f, 7.6783f, 19.4192f, 8.0681f, 18.7138f, 8.773f)
                curveTo(18.0063f, 9.48f, 17.6163f, 10.4192f, 17.6163f, 11.418f)
                verticalLineTo(15.5537f)
                curveTo(17.2498f, 15.5814f, 16.8576f, 15.607f, 16.4378f, 15.6346f)
                curveTo(16.0414f, 15.6623f, 15.6088f, 15.69f, 15.1485f, 15.722f)
                verticalLineTo(11.418f)
                curveTo(15.1485f, 10.4192f, 14.7606f, 9.48f, 14.053f, 8.773f)
                curveTo(13.3455f, 8.0681f, 12.4057f, 7.6783f, 11.4062f, 7.6783f)
                curveTo(10.4067f, 7.6783f, 9.467f, 8.0681f, 8.7616f, 8.773f)
                curveTo(8.054f, 9.48f, 7.664f, 10.4192f, 7.664f, 11.418f)
                verticalLineTo(20.2368f)
                curveTo(7.6619f, 20.3007f, 7.664f, 20.3518f, 7.664f, 20.3858f)
                verticalLineTo(21.3229f)
                curveTo(7.664f, 22.3217f, 8.054f, 23.2608f, 8.7616f, 23.9679f)
                curveTo(9.467f, 24.6728f, 10.4067f, 25.0625f, 11.4062f, 25.0625f)
                curveTo(12.4057f, 25.0625f, 13.3455f, 24.6728f, 14.053f, 23.9679f)
                curveTo(14.7606f, 23.2608f, 15.1485f, 22.3217f, 15.1485f, 21.3229f)
                verticalLineTo(17.2191f)
                curveTo(15.6429f, 17.185f, 16.1096f, 17.1531f, 16.5358f, 17.1254f)
                curveTo(16.913f, 17.0998f, 17.2732f, 17.0764f, 17.6163f, 17.0508f)
                verticalLineTo(21.3229f)
                curveTo(17.6163f, 22.3217f, 18.0063f, 23.2608f, 18.7138f, 23.9679f)
                curveTo(19.4192f, 24.6728f, 20.359f, 25.0625f, 21.3585f, 25.0625f)
                curveTo(22.358f, 25.0625f, 23.2978f, 24.6728f, 24.0053f, 23.9679f)
                curveTo(24.7107f, 23.2608f, 25.1008f, 22.3217f, 25.1008f, 21.3229f)
                verticalLineTo(11.418f)
                curveTo(25.1008f, 10.4192f, 24.7107f, 9.48f, 24.0053f, 8.773f)
                close()
            }
        }
        .build()
        return _one!!
    }

private var _one: ImageVector? = null
