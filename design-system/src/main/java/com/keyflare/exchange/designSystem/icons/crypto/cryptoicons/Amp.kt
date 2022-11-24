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

public val CryptoIcons.Amp: ImageVector
    get() {
        if (_amp != null) {
            return _amp!!
        }
        _amp = Builder(name = "Amp", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFD62D79)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1626f, 0.0f, 0.0f, 7.1626f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8352f, 7.1626f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8352f, 32.0f, 32.0f, 24.8352f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1626f, 24.8352f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1782f, 9.404f)
                curveTo(15.3887f, 8.8218f, 15.9126f, 8.7748f, 16.0738f, 8.7748f)
                horizontalLineTo(16.0761f)
                curveTo(16.2328f, 8.777f, 16.7634f, 8.824f, 16.9694f, 9.4129f)
                lineTo(18.5681f, 13.9738f)
                horizontalLineTo(13.5325f)
                lineTo(15.1782f, 9.404f)
                close()
                moveTo(7.794f, 15.9956f)
                horizontalLineTo(24.2037f)
                curveTo(24.7612f, 15.9956f, 25.2135f, 15.5433f, 25.2135f, 14.9836f)
                curveTo(25.2135f, 14.4261f, 24.7612f, 13.9738f, 24.2037f, 13.9738f)
                horizontalLineTo(20.7109f)
                lineTo(18.8771f, 8.7435f)
                curveTo(18.4539f, 7.5411f, 17.359f, 6.7597f, 16.085f, 6.753f)
                horizontalLineTo(16.0716f)
                curveTo(14.8043f, 6.753f, 13.7072f, 7.5232f, 13.2773f, 8.7188f)
                lineTo(11.3854f, 13.9738f)
                horizontalLineTo(7.794f)
                curveTo(7.2365f, 13.9738f, 6.7842f, 14.4261f, 6.7842f, 14.9836f)
                curveTo(6.7842f, 15.5433f, 7.2365f, 15.9956f, 7.794f, 15.9956f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.2037f, 18.0355f)
                horizontalLineTo(7.794f)
                curveTo(7.2365f, 18.0355f, 6.7842f, 18.4877f, 6.7842f, 19.0475f)
                curveTo(6.7842f, 19.605f, 7.2365f, 20.0573f, 7.794f, 20.0573f)
                horizontalLineTo(9.1933f)
                lineTo(7.8119f, 23.8905f)
                curveTo(7.6215f, 24.4167f, 7.8947f, 24.9943f, 8.4209f, 25.1847f)
                curveTo(8.5328f, 25.225f, 8.6493f, 25.2451f, 8.7634f, 25.2451f)
                curveTo(9.1777f, 25.2451f, 9.565f, 24.9876f, 9.7128f, 24.5756f)
                lineTo(11.3406f, 20.0573f)
                horizontalLineTo(20.6997f)
                lineTo(22.2826f, 24.5689f)
                curveTo(22.4282f, 24.9831f, 22.8177f, 25.2451f, 23.2364f, 25.2451f)
                curveTo(23.3462f, 25.2451f, 23.4604f, 25.2272f, 23.5701f, 25.1869f)
                curveTo(24.0962f, 25.0033f, 24.3739f, 24.4256f, 24.1903f, 23.8995f)
                lineTo(22.8424f, 20.0573f)
                horizontalLineTo(24.2037f)
                curveTo(24.7612f, 20.0573f, 25.2135f, 19.605f, 25.2135f, 19.0475f)
                curveTo(25.2135f, 18.4877f, 24.7612f, 18.0355f, 24.2037f, 18.0355f)
                close()
            }
        }
        .build()
        return _amp!!
    }

private var _amp: ImageVector? = null
