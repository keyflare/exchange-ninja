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

public val CryptoIcons.Fil: ImageVector
    get() {
        if (_fil != null) {
            return _fil!!
        }
        _fil = Builder(name = "Fil", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF0090FF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1636f, 0.0f, 0.0f, 7.1631f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8368f, 7.1636f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8366f, 32.0f, 32.0f, 24.8368f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1631f, 24.8366f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0247f, 6.4486f)
                curveTo(21.9297f, 5.3076f, 19.4961f, 5.6384f, 18.4761f, 6.7016f)
                curveTo(16.932f, 8.3087f, 16.25f, 10.5706f, 15.7286f, 12.7549f)
                lineTo(11.3351f, 12.0779f)
                lineTo(11.1387f, 13.3498f)
                lineTo(15.438f, 14.0135f)
                curveTo(15.4069f, 14.1489f, 15.3761f, 14.2843f, 15.3452f, 14.4175f)
                curveTo(15.2087f, 15.0079f, 15.0762f, 15.5984f, 14.9519f, 16.1911f)
                lineTo(10.839f, 15.5562f)
                lineTo(10.6428f, 16.8303f)
                lineTo(14.682f, 17.4519f)
                curveTo(14.5581f, 18.0157f, 14.4347f, 18.5773f, 14.3119f, 19.1389f)
                curveTo(14.2502f, 19.4208f, 14.19f, 19.7049f, 14.1294f, 19.9868f)
                curveTo(13.9095f, 21.0146f, 13.6837f, 22.0379f, 13.3609f, 23.039f)
                curveTo(13.0954f, 23.8581f, 12.7698f, 24.7593f, 12.0968f, 25.3365f)
                curveTo(11.5252f, 25.827f, 10.766f, 25.5762f, 10.3839f, 24.9857f)
                curveTo(10.1977f, 24.6972f, 10.0714f, 24.4263f, 9.7231f, 24.2998f)
                curveTo(9.3992f, 24.1822f, 9.0463f, 24.2576f, 8.8023f, 24.5018f)
                curveTo(8.4791f, 24.8259f, 8.712f, 25.2765f, 8.9755f, 25.5518f)
                curveTo(10.0705f, 26.6927f, 12.5041f, 26.362f, 13.5241f, 25.2987f)
                curveTo(15.4254f, 23.3187f, 16.0192f, 20.3509f, 16.6161f, 17.7515f)
                lineTo(20.8877f, 18.4086f)
                lineTo(21.1649f, 17.1367f)
                lineTo(16.9018f, 16.4907f)
                curveTo(17.0629f, 15.7649f, 17.219f, 15.039f, 17.3748f, 14.3131f)
                lineTo(21.3838f, 14.9302f)
                lineTo(21.6608f, 13.6561f)
                lineTo(17.6472f, 13.0501f)
                curveTo(17.661f, 12.988f, 17.6745f, 12.9236f, 17.6882f, 12.8614f)
                curveTo(17.75f, 12.5773f, 17.8101f, 12.2954f, 17.8707f, 12.0113f)
                curveTo(18.0907f, 10.9857f, 18.3165f, 9.9602f, 18.6392f, 8.9613f)
                curveTo(18.9047f, 8.1422f, 19.2304f, 7.2388f, 19.9034f, 6.6617f)
                curveTo(20.475f, 6.1733f, 21.2342f, 6.4219f, 21.6162f, 7.0146f)
                curveTo(21.8025f, 7.3032f, 21.9288f, 7.574f, 22.2773f, 7.7005f)
                curveTo(22.6009f, 7.8182f, 22.9539f, 7.7427f, 23.1981f, 7.4985f)
                curveTo(23.5213f, 7.1744f, 23.2884f, 6.7216f, 23.0247f, 6.4486f)
                close()
            }
        }
        .build()
        return _fil!!
    }

private var _fil: ImageVector? = null
