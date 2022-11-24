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

public val CryptoIcons.Eth: ImageVector
    get() {
        if (_eth != null) {
            return _eth!!
        }
        _eth = Builder(name = "Eth", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFECEFF0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 15.9989f)
                curveTo(32.0f, 24.8374f, 24.8365f, 32.0f, 15.9999f, 32.0f)
                curveTo(7.1635f, 32.0f, 0.0f, 24.8374f, 0.0f, 15.9989f)
                curveTo(0.0f, 7.1626f, 7.1635f, 0.0f, 15.9999f, 0.0f)
                curveTo(24.8365f, 0.0f, 32.0f, 7.1626f, 32.0f, 15.9989f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8B8B8B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8435f, 16.1253f)
                curveTo(9.7306f, 15.7218f, 10.6176f, 15.3184f, 11.5045f, 14.9127f)
                curveTo(12.218f, 14.589f, 12.9318f, 14.2654f, 13.6456f, 13.9395f)
                curveTo(14.4103f, 13.5914f, 15.1753f, 13.2434f, 15.9403f, 12.8976f)
                lineTo(15.9953f, 12.8776f)
                curveTo(15.9975f, 12.851f, 16.0019f, 12.8266f, 16.0019f, 12.8f)
                curveTo(16.0021f, 9.896f, 16.0021f, 6.9941f, 16.0019f, 4.0901f)
                curveTo(16.0019f, 4.0635f, 15.9984f, 4.0369f, 15.9964f, 4.0125f)
                lineTo(15.958f, 4.0635f)
                curveTo(15.5213f, 4.7862f, 15.0849f, 5.5111f, 14.6484f, 6.236f)
                curveTo(13.5855f, 8.0006f, 12.5224f, 9.7652f, 11.4595f, 11.5276f)
                curveTo(10.6954f, 12.7956f, 9.931f, 14.0659f, 9.1672f, 15.3339f)
                curveTo(9.0801f, 15.478f, 8.9931f, 15.6243f, 8.9065f, 15.7684f)
                curveTo(8.8198f, 15.9147f, 8.7331f, 16.0588f, 8.6462f, 16.2051f)
                curveTo(8.7121f, 16.1785f, 8.779f, 16.1541f, 8.8435f, 16.1253f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343434)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.6441f, 15.0213f)
                curveTo(22.2513f, 14.3673f, 21.8587f, 13.7156f, 21.4657f, 13.0638f)
                curveTo(21.0827f, 12.4276f, 20.6992f, 11.7914f, 20.3161f, 11.1552f)
                curveTo(19.9229f, 10.5034f, 19.5301f, 9.8516f, 19.1371f, 9.1977f)
                curveTo(18.7507f, 8.557f, 18.3646f, 7.9141f, 17.9775f, 7.2734f)
                curveTo(17.5983f, 6.6461f, 17.2172f, 6.0187f, 16.8384f, 5.3891f)
                curveTo(16.5713f, 4.948f, 16.3068f, 4.5024f, 16.0404f, 4.059f)
                lineTo(16.0311f, 4.0458f)
                lineTo(15.9965f, 4.0125f)
                curveTo(15.9985f, 4.0369f, 16.002f, 4.0635f, 16.002f, 4.0901f)
                curveTo(16.0022f, 6.9941f, 16.0022f, 9.896f, 16.002f, 12.8f)
                curveTo(16.002f, 12.8266f, 15.9976f, 12.851f, 15.9954f, 12.8776f)
                lineTo(16.0022f, 12.8843f)
                curveTo(16.0404f, 12.8998f, 16.0787f, 12.9131f, 16.1171f, 12.9264f)
                curveTo(16.1552f, 12.9419f, 16.1933f, 12.9574f, 16.2303f, 12.973f)
                curveTo(16.5932f, 13.137f, 16.9548f, 13.3055f, 17.3172f, 13.4695f)
                curveTo(17.7958f, 13.689f, 18.2746f, 13.9062f, 18.7534f, 14.1235f)
                curveTo(19.1828f, 14.3185f, 19.6124f, 14.5136f, 20.0417f, 14.7087f)
                curveTo(20.4713f, 14.9038f, 20.9007f, 15.0989f, 21.3303f, 15.294f)
                curveTo(21.7597f, 15.489f, 22.189f, 15.6863f, 22.6186f, 15.8814f)
                curveTo(22.8472f, 15.9834f, 23.0759f, 16.0876f, 23.3047f, 16.1918f)
                lineTo(23.3539f, 16.2051f)
                lineTo(23.3275f, 16.1541f)
                curveTo(23.0999f, 15.7773f, 22.8718f, 15.3981f, 22.6441f, 15.0213f)
                close()
            }
            path(fill = SolidColor(Color(0xFF393939)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0021f, 12.8846f)
                lineTo(15.9953f, 12.8779f)
                lineTo(15.9403f, 12.8979f)
                curveTo(15.1753f, 13.2437f, 14.4103f, 13.5918f, 13.6456f, 13.9398f)
                curveTo(12.9318f, 14.2657f, 12.218f, 14.5893f, 11.5045f, 14.913f)
                curveTo(10.6176f, 15.3187f, 9.7306f, 15.7221f, 8.8435f, 16.1256f)
                curveTo(8.779f, 16.1544f, 8.7121f, 16.1788f, 8.6462f, 16.2054f)
                lineTo(8.6491f, 16.212f)
                lineTo(8.6602f, 16.2342f)
                curveTo(8.9242f, 16.3916f, 9.1889f, 16.549f, 9.4536f, 16.7042f)
                curveTo(11.6171f, 17.9833f, 13.7806f, 19.2646f, 15.9445f, 20.5415f)
                lineTo(16.0026f, 20.5659f)
                curveTo(16.0023f, 18.0299f, 16.0023f, 15.4916f, 16.0021f, 12.9555f)
                curveTo(16.0021f, 12.9311f, 16.0021f, 12.909f, 16.0021f, 12.8846f)
                close()
            }
            path(fill = SolidColor(Color(0xFF151515)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.6186f, 15.8817f)
                curveTo(22.189f, 15.6866f, 21.7596f, 15.4894f, 21.3303f, 15.2943f)
                curveTo(20.9007f, 15.0992f, 20.4713f, 14.9041f, 20.0417f, 14.709f)
                curveTo(19.6123f, 14.5139f, 19.1827f, 14.3188f, 18.7533f, 14.1238f)
                curveTo(18.2745f, 13.9065f, 17.7957f, 13.6893f, 17.3171f, 13.4698f)
                curveTo(16.9547f, 13.3058f, 16.5932f, 13.1373f, 16.2303f, 12.9733f)
                curveTo(16.1933f, 12.9577f, 16.1551f, 12.9422f, 16.117f, 12.9267f)
                curveTo(16.0787f, 12.9134f, 16.0403f, 12.9001f, 16.0022f, 12.8846f)
                curveTo(16.0022f, 12.909f, 16.0022f, 12.9311f, 16.0022f, 12.9555f)
                curveTo(16.0024f, 15.4916f, 16.0024f, 18.0299f, 16.0026f, 20.5659f)
                horizontalLineTo(16.0153f)
                curveTo(16.2571f, 20.424f, 16.4992f, 20.2821f, 16.7406f, 20.1381f)
                curveTo(17.0833f, 19.9341f, 17.4249f, 19.7302f, 17.7682f, 19.5262f)
                curveTo(18.1952f, 19.2757f, 18.6241f, 19.0252f, 19.051f, 18.7725f)
                curveTo(19.409f, 18.5619f, 19.765f, 18.3468f, 20.123f, 18.134f)
                curveTo(20.6058f, 17.8481f, 21.0904f, 17.5665f, 21.5732f, 17.2805f)
                curveTo(21.8764f, 17.1032f, 22.1773f, 16.9192f, 22.4801f, 16.7396f)
                curveTo(22.7676f, 16.5689f, 23.0564f, 16.4005f, 23.3441f, 16.2298f)
                lineTo(23.3539f, 16.2054f)
                lineTo(23.3047f, 16.1921f)
                curveTo(23.0759f, 16.0879f, 22.8471f, 15.9837f, 22.6186f, 15.8817f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8C8C8C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0025f, 22.0576f)
                curveTo(16.0025f, 22.0265f, 16.0042f, 21.9977f, 16.0051f, 21.9667f)
                curveTo(15.9577f, 21.9401f, 15.9096f, 21.9157f, 15.863f, 21.8891f)
                curveTo(14.852f, 21.2928f, 13.8414f, 20.6942f, 12.8304f, 20.0957f)
                curveTo(11.5883f, 19.3619f, 10.3459f, 18.6281f, 9.1034f, 17.8944f)
                curveTo(8.9571f, 17.8079f, 8.809f, 17.7237f, 8.6619f, 17.6394f)
                curveTo(8.6729f, 17.6616f, 8.6818f, 17.6837f, 8.6958f, 17.7037f)
                curveTo(9.4242f, 18.7323f, 10.153f, 19.7587f, 10.8821f, 20.7873f)
                curveTo(12.522f, 23.0995f, 14.1622f, 25.4116f, 15.8025f, 27.7216f)
                curveTo(15.8648f, 27.8102f, 15.9311f, 27.8945f, 15.9954f, 27.981f)
                curveTo(15.9976f, 27.9521f, 16.002f, 27.9211f, 16.002f, 27.89f)
                curveTo(16.0022f, 25.9459f, 16.0022f, 24.0017f, 16.0025f, 22.0576f)
                close()
            }
            path(fill = SolidColor(Color(0xFF343434)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.328f, 17.6463f)
                lineTo(23.2872f, 17.6662f)
                curveTo(21.5646f, 18.6837f, 19.8422f, 19.7013f, 18.1196f, 20.7188f)
                curveTo(17.4149f, 21.1356f, 16.71f, 21.5501f, 16.0051f, 21.9669f)
                curveTo(16.0042f, 21.9979f, 16.0025f, 22.0267f, 16.0025f, 22.0578f)
                curveTo(16.0022f, 24.0019f, 16.0022f, 25.9461f, 16.002f, 27.8902f)
                curveTo(16.002f, 27.9213f, 15.9976f, 27.9523f, 15.9954f, 27.9812f)
                lineTo(15.9998f, 27.9878f)
                lineTo(16.0158f, 27.9789f)
                lineTo(16.0426f, 27.9412f)
                curveTo(18.1495f, 24.9729f, 20.2563f, 22.0046f, 22.363f, 19.0362f)
                curveTo(22.6893f, 18.5774f, 23.0145f, 18.1162f, 23.3404f, 17.6573f)
                lineTo(23.328f, 17.6463f)
                close()
            }
        }
        .build()
        return _eth!!
    }

private var _eth: ImageVector? = null
