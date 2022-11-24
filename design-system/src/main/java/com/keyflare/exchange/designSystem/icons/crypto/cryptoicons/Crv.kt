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

public val CryptoIcons.Crv: ImageVector
    get() {
        if (_crv != null) {
            return _crv!!
        }
        _crv = Builder(name = "Crv", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8357f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1621f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1621f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8357f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFD10000), 0.302083f to Color(0xFFFBE308),
                    0.526042f to Color(0xFF4FED75), 0.729167f to Color(0xFF1EF9D6), 1.0f to
                    Color(0xFF0001FF), start = Offset(1.0f,16.0f), end = Offset(31.9333f,16.0f)),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.1922f, 14.6364f)
                horizontalLineTo(8.3882f)
                curveTo(8.3683f, 14.4044f, 8.3153f, 14.1939f, 8.2291f, 14.005f)
                curveTo(8.1463f, 13.8161f, 8.0303f, 13.6536f, 7.8811f, 13.5178f)
                curveTo(7.7353f, 13.3786f, 7.558f, 13.2725f, 7.3492f, 13.1996f)
                curveTo(7.1404f, 13.1233f, 6.9034f, 13.0852f, 6.6382f, 13.0852f)
                curveTo(6.1742f, 13.0852f, 5.7815f, 13.1979f, 5.46f, 13.4233f)
                curveTo(5.1418f, 13.6487f, 4.8998f, 13.9718f, 4.7341f, 14.3928f)
                curveTo(4.5717f, 14.8137f, 4.4905f, 15.3191f, 4.4905f, 15.9091f)
                curveTo(4.4905f, 16.5322f, 4.5734f, 17.0542f, 4.7391f, 17.4751f)
                curveTo(4.9081f, 17.8928f, 5.1517f, 18.2076f, 5.4699f, 18.4197f)
                curveTo(5.7881f, 18.6286f, 6.1709f, 18.733f, 6.6183f, 18.733f)
                curveTo(6.8735f, 18.733f, 7.1022f, 18.7015f, 7.3044f, 18.6385f)
                curveTo(7.5066f, 18.5722f, 7.6823f, 18.4777f, 7.8314f, 18.3551f)
                curveTo(7.9806f, 18.2325f, 8.1015f, 18.085f, 8.1943f, 17.9126f)
                curveTo(8.2905f, 17.737f, 8.3551f, 17.5398f, 8.3882f, 17.321f)
                lineTo(11.1922f, 17.3409f)
                curveTo(11.1591f, 17.7718f, 11.0381f, 18.2109f, 10.8293f, 18.6584f)
                curveTo(10.6205f, 19.1025f, 10.3238f, 19.5135f, 9.9394f, 19.8913f)
                curveTo(9.5582f, 20.2659f, 9.0859f, 20.5675f, 8.5225f, 20.7962f)
                curveTo(7.959f, 21.0249f, 7.3044f, 21.1392f, 6.5587f, 21.1392f)
                curveTo(5.624f, 21.1392f, 4.7855f, 20.9387f, 4.0431f, 20.5376f)
                curveTo(3.304f, 20.1366f, 2.719f, 19.5466f, 2.2881f, 18.7678f)
                curveTo(1.8605f, 17.9889f, 1.6467f, 17.036f, 1.6467f, 15.9091f)
                curveTo(1.6467f, 14.7756f, 1.8655f, 13.821f, 2.303f, 13.0455f)
                curveTo(2.7405f, 12.2666f, 3.3305f, 11.6783f, 4.0729f, 11.2805f)
                curveTo(4.8153f, 10.8795f, 5.6439f, 10.679f, 6.5587f, 10.679f)
                curveTo(7.2017f, 10.679f, 7.7933f, 10.7668f, 8.3335f, 10.9425f)
                curveTo(8.8738f, 11.1181f, 9.3477f, 11.375f, 9.7554f, 11.7131f)
                curveTo(10.1631f, 12.0478f, 10.4912f, 12.4605f, 10.7398f, 12.951f)
                curveTo(10.9884f, 13.4415f, 11.1392f, 14.0033f, 11.1922f, 14.6364f)
                close()
                moveTo(11.4463f, 21.0f)
                verticalLineTo(10.8182f)
                horizontalLineTo(15.8412f)
                curveTo(16.5969f, 10.8182f, 17.2581f, 10.9557f, 17.8248f, 11.2308f)
                curveTo(18.3916f, 11.5059f, 18.8324f, 11.902f, 19.1473f, 12.419f)
                curveTo(19.4622f, 12.9361f, 19.6196f, 13.5559f, 19.6196f, 14.2784f)
                curveTo(19.6196f, 15.0076f, 19.4572f, 15.6224f, 19.1324f, 16.1229f)
                curveTo(18.8109f, 16.6233f, 18.3585f, 17.0012f, 17.7751f, 17.2564f)
                curveTo(17.1951f, 17.5116f, 16.5173f, 17.6392f, 15.7417f, 17.6392f)
                horizontalLineTo(13.1167f)
                verticalLineTo(15.4915f)
                horizontalLineTo(15.1849f)
                curveTo(15.5097f, 15.4915f, 15.7865f, 15.4517f, 16.0152f, 15.3722f)
                curveTo(16.2472f, 15.2893f, 16.4245f, 15.1584f, 16.5471f, 14.9794f)
                curveTo(16.6731f, 14.8004f, 16.7361f, 14.5668f, 16.7361f, 14.2784f)
                curveTo(16.7361f, 13.9867f, 16.6731f, 13.7498f, 16.5471f, 13.5675f)
                curveTo(16.4245f, 13.3819f, 16.2472f, 13.246f, 16.0152f, 13.1598f)
                curveTo(15.7865f, 13.0703f, 15.5097f, 13.0256f, 15.1849f, 13.0256f)
                horizontalLineTo(14.2105f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.4463f)
                close()
                moveTo(17.4122f, 16.3267f)
                lineTo(19.9577f, 21.0f)
                horizontalLineTo(16.9548f)
                lineTo(14.469f, 16.3267f)
                horizontalLineTo(17.4122f)
                close()
                moveTo(22.2675f, 10.8182f)
                lineTo(24.3556f, 17.9972f)
                horizontalLineTo(24.4351f)
                lineTo(26.5232f, 10.8182f)
                horizontalLineTo(29.6453f)
                lineTo(26.2845f, 21.0f)
                horizontalLineTo(22.5061f)
                lineTo(19.1453f, 10.8182f)
                horizontalLineTo(22.2675f)
                close()
            }
        }
        .build()
        return _crv!!
    }

private var _crv: ImageVector? = null
