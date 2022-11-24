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

public val CryptoIcons.Usdc: ImageVector
    get() {
        if (_usdc != null) {
            return _usdc!!
        }
        _usdc = Builder(name = "Usdc", defaultWidth = 32.0.dp, defaultHeight = 33.0.dp,
                viewportWidth = 32.0f, viewportHeight = 33.0f).apply {
            path(fill = SolidColor(Color(0xFF2775CA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8371f, 24.8371f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1629f, 32.0f, 0.0f, 24.8371f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1629f, 7.1629f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8371f, 0.0f, 32.0f, 7.1629f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0413f, 23.4629f)
                curveTo(17.0458f, 23.1076f, 17.0436f, 22.7501f, 17.0436f, 22.3949f)
                curveTo(17.0436f, 21.9863f, 17.0436f, 21.9907f, 17.4277f, 21.8953f)
                curveTo(18.4691f, 21.6355f, 19.3372f, 21.1204f, 19.9234f, 20.1967f)
                curveTo(20.3697f, 19.4906f, 20.494f, 18.7179f, 20.4141f, 17.8942f)
                curveTo(20.3208f, 16.9394f, 19.93f, 16.1756f, 19.0907f, 15.6716f)
                curveTo(18.2403f, 15.1631f, 17.2811f, 15.0099f, 16.3264f, 14.8412f)
                curveTo(15.7669f, 14.7413f, 15.2095f, 14.6191f, 14.6722f, 14.4437f)
                curveTo(14.0483f, 14.2394f, 13.8129f, 13.7443f, 13.8351f, 13.1049f)
                curveTo(13.8551f, 12.5098f, 14.1704f, 12.0124f, 14.7677f, 11.8437f)
                curveTo(15.1851f, 11.7238f, 15.6403f, 11.6971f, 16.0799f, 11.6905f)
                curveTo(17.0702f, 11.6771f, 17.7164f, 12.2256f, 17.9273f, 13.0049f)
                curveTo(18.0006f, 13.2736f, 18.2004f, 13.409f, 18.4912f, 13.4024f)
                curveTo(18.8376f, 13.3935f, 19.1862f, 13.4068f, 19.5326f, 13.3979f)
                curveTo(19.8723f, 13.3913f, 20.1055f, 13.107f, 20.0122f, 12.7806f)
                curveTo(19.9101f, 12.4343f, 19.7991f, 12.079f, 19.6259f, 11.7615f)
                curveTo(19.1218f, 10.8312f, 18.287f, 10.3361f, 17.2811f, 10.1074f)
                curveTo(17.0924f, 10.063f, 17.0369f, 9.9808f, 17.0391f, 9.7987f)
                curveTo(17.048f, 9.3635f, 17.048f, 8.9261f, 17.0391f, 8.4909f)
                curveTo(17.0347f, 8.1667f, 16.8237f, 7.958f, 16.504f, 7.9513f)
                curveTo(16.1821f, 7.9469f, 15.8623f, 7.9491f, 15.5404f, 7.9513f)
                curveTo(15.1651f, 7.9536f, 14.9653f, 8.1512f, 14.9609f, 8.5264f)
                curveTo(14.9564f, 8.9283f, 14.952f, 9.328f, 14.9631f, 9.7299f)
                curveTo(14.9698f, 9.9275f, 14.8987f, 10.0074f, 14.6989f, 10.0452f)
                curveTo(14.0594f, 10.1629f, 13.471f, 10.4026f, 12.9514f, 10.8001f)
                curveTo(11.8768f, 11.6216f, 11.557f, 12.7296f, 11.7369f, 14.0218f)
                curveTo(11.8834f, 15.081f, 12.4851f, 15.8159f, 13.4554f, 16.1889f)
                curveTo(14.1304f, 16.4509f, 14.8543f, 16.5842f, 15.5581f, 16.764f)
                curveTo(16.1687f, 16.9172f, 16.7904f, 17.0304f, 17.3922f, 17.2103f)
                curveTo(17.8007f, 17.3324f, 18.0871f, 17.6299f, 18.2004f, 18.0651f)
                curveTo(18.4202f, 18.9266f, 18.0361f, 19.7149f, 17.2256f, 20.0901f)
                curveTo(16.746f, 20.3122f, 16.2442f, 20.3188f, 15.7358f, 20.2989f)
                curveTo(14.579f, 20.2567f, 13.7952f, 19.7015f, 13.602f, 18.6313f)
                curveTo(13.5465f, 18.3338f, 13.3444f, 18.1695f, 13.0647f, 18.1628f)
                curveTo(12.6717f, 18.154f, 12.2809f, 18.1517f, 11.8879f, 18.165f)
                curveTo(11.5837f, 18.1739f, 11.3594f, 18.4293f, 11.406f, 18.7179f)
                curveTo(11.5237f, 19.4618f, 11.7968f, 20.139f, 12.3097f, 20.7074f)
                curveTo(12.9603f, 21.429f, 13.8085f, 21.7709f, 14.7388f, 21.9353f)
                curveTo(14.932f, 21.9708f, 14.9675f, 22.0507f, 14.9631f, 22.2172f)
                curveTo(14.9609f, 22.2439f, 14.9609f, 22.2705f, 14.9609f, 22.2972f)
                curveTo(14.9564f, 22.4837f, 14.9609f, 22.6702f, 14.9609f, 22.8589f)
                curveTo(14.9609f, 23.0543f, 14.9586f, 23.2497f, 14.9609f, 23.4451f)
                curveTo(14.9631f, 23.8203f, 15.123f, 24.0291f, 15.4849f, 24.0579f)
                curveTo(15.8313f, 24.0846f, 16.1821f, 24.0846f, 16.5262f, 24.0557f)
                curveTo(16.8726f, 24.0291f, 17.0369f, 23.8181f, 17.0413f, 23.4629f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0336f, 26.3202f)
                curveTo(13.0336f, 25.6585f, 12.9359f, 25.5208f, 12.3164f, 25.2677f)
                curveTo(11.5393f, 24.9524f, 10.7933f, 24.5705f, 10.1271f, 24.0554f)
                curveTo(6.9542f, 21.5997f, 5.5998f, 18.3646f, 6.166f, 14.4012f)
                curveTo(6.5257f, 11.8789f, 7.7913f, 9.8162f, 9.7786f, 8.2086f)
                curveTo(10.5934f, 7.547f, 11.4993f, 7.0407f, 12.4807f, 6.6677f)
                curveTo(12.8005f, 6.5478f, 13.0114f, 6.3324f, 13.0292f, 5.986f)
                curveTo(13.0469f, 5.6396f, 13.0425f, 5.2911f, 13.0292f, 4.9447f)
                curveTo(13.0203f, 4.6538f, 12.8205f, 4.4717f, 12.5251f, 4.4806f)
                curveTo(12.3941f, 4.4851f, 12.2609f, 4.5117f, 12.1366f, 4.5561f)
                curveTo(10.1538f, 5.2378f, 8.4419f, 6.3347f, 7.0342f, 7.8978f)
                curveTo(5.0587f, 10.0937f, 4.0393f, 12.6827f, 3.9072f, 15.6224f)
                curveTo(3.8579f, 16.7193f, 3.9885f, 17.8073f, 4.2551f, 18.8731f)
                curveTo(4.8855f, 21.3932f, 6.1838f, 23.5048f, 8.1599f, 25.1945f)
                curveTo(9.3633f, 26.2247f, 10.7244f, 26.9841f, 12.2343f, 27.4726f)
                curveTo(12.7539f, 27.6413f, 13.0336f, 27.4348f, 13.0336f, 26.8797f)
                curveTo(13.0336f, 26.7554f, 13.0336f, 26.631f, 13.0336f, 26.5067f)
                curveTo(13.0336f, 26.4445f, 13.0336f, 26.3824f, 13.0336f, 26.3202f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5771f, 6.688f)
                curveTo(20.7983f, 7.1543f, 21.9018f, 7.8226f, 22.8321f, 8.7374f)
                curveTo(25.3656f, 11.2242f, 26.4291f, 14.2417f, 25.8007f, 17.7455f)
                curveTo(25.1679f, 21.2714f, 23.1185f, 23.7449f, 19.8457f, 25.197f)
                curveTo(19.6437f, 25.2881f, 19.486f, 25.3547f, 19.3661f, 25.4191f)
                lineTo(19.3195f, 25.4435f)
                curveTo(19.2085f, 25.5079f, 19.133f, 25.5678f, 19.0819f, 25.6433f)
                lineTo(19.0619f, 25.6744f)
                lineTo(19.053f, 25.6899f)
                lineTo(19.0375f, 25.7233f)
                lineTo(19.0175f, 25.7788f)
                lineTo(19.0064f, 25.8187f)
                lineTo(19.002f, 25.841f)
                lineTo(18.9931f, 25.8854f)
                lineTo(18.9864f, 25.9342f)
                curveTo(18.9687f, 26.0741f, 18.9687f, 26.2562f, 18.9687f, 26.5093f)
                curveTo(18.9687f, 26.5492f, 18.9709f, 26.5892f, 18.9709f, 26.6292f)
                lineTo(18.9731f, 26.6691f)
                curveTo(18.9731f, 26.6958f, 18.9731f, 26.7224f, 18.9731f, 26.7491f)
                curveTo(18.9731f, 26.7757f, 18.9709f, 26.8024f, 18.9664f, 26.829f)
                curveTo(18.8932f, 27.373f, 19.2662f, 27.6505f, 19.8235f, 27.464f)
                curveTo(24.5862f, 25.8676f, 27.8946f, 21.5312f, 28.0944f, 16.3933f)
                curveTo(28.1521f, 14.97f, 27.9412f, 13.5734f, 27.4882f, 12.219f)
                curveTo(26.6067f, 9.599f, 25.0192f, 7.5096f, 22.7277f, 5.962f)
                curveTo(21.8063f, 5.3403f, 20.8138f, 4.8651f, 19.7591f, 4.5232f)
                curveTo(19.264f, 4.3611f, 18.9709f, 4.5764f, 18.9687f, 5.0849f)
                curveTo(18.9687f, 5.3269f, 18.9687f, 5.5667f, 18.9687f, 5.8065f)
                curveTo(18.9687f, 6.3128f, 19.1086f, 6.5082f, 19.5771f, 6.688f)
                close()
            }
        }
        .build()
        return _usdc!!
    }

private var _usdc: ImageVector? = null
