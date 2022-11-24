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

public val CryptoIcons.Doge: ImageVector
    get() {
        if (_doge != null) {
            return _doge!!
        }
        _doge = Builder(name = "Doge", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFC1AD57)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 15.9989f)
                curveTo(32.0f, 24.8374f, 24.8357f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1643f, 32.0f, 0.0f, 24.8374f, 0.0f, 15.9989f)
                curveTo(0.0f, 7.1626f, 7.1643f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8357f, 0.0f, 32.0f, 7.1626f, 32.0f, 15.9989f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.7f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0401f, 25.0f)
                horizontalLineTo(9.3242f)
                verticalLineTo(7.5455f)
                horizontalLineTo(15.9719f)
                curveTo(17.7674f, 7.5455f, 19.3185f, 7.8949f, 20.6254f, 8.5938f)
                curveTo(21.9379f, 9.2869f, 22.9492f, 10.2869f, 23.6594f, 11.5938f)
                curveTo(24.3754f, 12.8949f, 24.7333f, 14.4545f, 24.7333f, 16.2727f)
                curveTo(24.7333f, 18.0909f, 24.3782f, 19.6534f, 23.668f, 20.9602f)
                curveTo(22.9577f, 22.2614f, 21.9521f, 23.2614f, 20.6509f, 23.9602f)
                curveTo(19.3498f, 24.6534f, 17.8129f, 25.0f, 16.0401f, 25.0f)
                close()
                moveTo(14.0629f, 20.9773f)
                horizontalLineTo(15.8697f)
                curveTo(16.7333f, 20.9773f, 17.4691f, 20.8381f, 18.0771f, 20.5597f)
                curveTo(18.6907f, 20.2812f, 19.1566f, 19.8011f, 19.4748f, 19.1193f)
                curveTo(19.7987f, 18.4375f, 19.9606f, 17.4886f, 19.9606f, 16.2727f)
                curveTo(19.9606f, 15.0568f, 19.7958f, 14.108f, 19.4663f, 13.4261f)
                curveTo(19.1424f, 12.7443f, 18.6651f, 12.2642f, 18.0344f, 11.9858f)
                curveTo(17.4094f, 11.7074f, 16.6424f, 11.5682f, 15.7333f, 11.5682f)
                horizontalLineTo(14.0629f)
                verticalLineTo(20.9773f)
                close()
            }
        }
        .build()
        return _doge!!
    }

private var _doge: ImageVector? = null
