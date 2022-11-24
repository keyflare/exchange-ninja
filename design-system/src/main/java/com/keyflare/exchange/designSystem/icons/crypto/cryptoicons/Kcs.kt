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

public val CryptoIcons.Kcs: ImageVector
    get() {
        if (_kcs != null) {
            return _kcs!!
        }
        _kcs = Builder(name = "Kcs", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF13AE8C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1641f, 0.0f, 0.0f, 7.1641f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8359f, 7.1641f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8359f, 32.0f, 32.0f, 24.8359f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1641f, 24.8359f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFBFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1086f, 13.9666f)
                curveTo(11.2217f, 13.8602f, 11.286f, 13.8003f, 11.3481f, 13.7382f)
                curveTo(13.2373f, 11.8491f, 15.1242f, 9.96f, 17.0133f, 8.0686f)
                curveTo(17.7384f, 7.3436f, 18.5676f, 7.3524f, 19.2882f, 8.0752f)
                curveTo(20.6386f, 9.4345f, 22.0f, 10.7804f, 23.3459f, 12.144f)
                curveTo(23.7583f, 12.5608f, 23.8714f, 13.0775f, 23.6652f, 13.6318f)
                curveTo(23.4634f, 14.1772f, 23.0554f, 14.4877f, 22.4811f, 14.5608f)
                curveTo(22.0576f, 14.6163f, 21.6719f, 14.4921f, 21.3681f, 14.1972f)
                curveTo(20.6452f, 13.4943f, 19.9357f, 12.7781f, 19.2217f, 12.0642f)
                curveTo(18.867f, 11.7094f, 18.5166f, 11.348f, 18.1707f, 10.9976f)
                curveTo(16.4922f, 12.6761f, 14.8359f, 14.3347f, 13.1974f, 15.9755f)
                curveTo(14.8515f, 17.6229f, 16.5144f, 19.2792f, 18.2107f, 20.9733f)
                curveTo(18.5189f, 20.6562f, 18.8648f, 20.2948f, 19.2173f, 19.9378f)
                curveTo(19.9047f, 19.246f, 20.592f, 18.5542f, 21.286f, 17.8713f)
                curveTo(21.7029f, 17.4611f, 22.204f, 17.3147f, 22.7672f, 17.501f)
                curveTo(23.3193f, 17.6806f, 23.6452f, 18.0797f, 23.7383f, 18.6495f)
                curveTo(23.8159f, 19.1196f, 23.6696f, 19.532f, 23.3348f, 19.8691f)
                curveTo(22.0022f, 21.2083f, 20.6674f, 22.5475f, 19.3237f, 23.8757f)
                curveTo(19.1242f, 24.073f, 18.8913f, 24.2659f, 18.6364f, 24.3657f)
                curveTo(18.0443f, 24.5985f, 17.5188f, 24.4344f, 17.0732f, 23.9865f)
                curveTo(15.2683f, 22.1795f, 13.4612f, 20.3746f, 11.6563f, 18.5675f)
                curveTo(11.4923f, 18.4034f, 11.3415f, 18.226f, 11.184f, 18.0553f)
                curveTo(11.1619f, 18.0708f, 11.1419f, 18.0841f, 11.1219f, 18.0974f)
                curveTo(11.1175f, 18.1772f, 11.1086f, 18.2571f, 11.1086f, 18.3369f)
                curveTo(11.1086f, 19.4367f, 11.1153f, 20.5387f, 11.1042f, 21.6407f)
                curveTo(11.0976f, 22.2482f, 10.7051f, 22.767f, 10.1441f, 22.9599f)
                curveTo(9.5743f, 23.1573f, 8.9534f, 22.9843f, 8.5698f, 22.5231f)
                curveTo(8.3237f, 22.2238f, 8.235f, 21.8757f, 8.235f, 21.4921f)
                curveTo(8.2373f, 18.9622f, 8.2373f, 16.43f, 8.2373f, 13.9001f)
                curveTo(8.2373f, 12.7404f, 8.2284f, 11.5808f, 8.2395f, 10.4211f)
                curveTo(8.2483f, 9.297f, 9.4013f, 8.6052f, 10.3636f, 9.144f)
                curveTo(10.8581f, 9.4212f, 11.1064f, 9.8602f, 11.1064f, 10.43f)
                curveTo(11.1109f, 11.5054f, 11.1086f, 12.5808f, 11.1086f, 13.6562f)
                curveTo(11.1086f, 13.7382f, 11.1086f, 13.8181f, 11.1086f, 13.9666f)
                close()
            }
        }
        .build()
        return _kcs!!
    }

private var _kcs: ImageVector? = null
