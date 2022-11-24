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

public val CryptoIcons.Tusd: ImageVector
    get() {
        if (_tusd != null) {
            return _tusd!!
        }
        _tusd = Builder(name = "Tusd", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF1B5AFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9989f, 0.0f)
                curveTo(7.1626f, 0.0f, 0.0f, 7.1626f, 0.0f, 16.0011f)
                curveTo(0.0f, 24.8374f, 7.1626f, 32.0f, 15.9989f, 32.0f)
                curveTo(24.8352f, 32.0f, 32.0f, 24.8374f, 32.0f, 16.0011f)
                curveTo(32.0f, 7.1626f, 24.8352f, 0.0f, 15.9989f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3743f, 7.7881f)
                horizontalLineTo(7.9275f)
                verticalLineTo(13.2349f)
                curveTo(10.9357f, 13.2349f, 13.3743f, 10.7964f, 13.3743f, 7.7881f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5769f, 7.7879f)
                curveTo(15.7017f, 7.7879f, 13.374f, 10.1156f, 13.374f, 12.9886f)
                verticalLineTo(24.2124f)
                horizontalLineTo(18.6456f)
                verticalLineTo(13.2346f)
                horizontalLineTo(24.0725f)
                verticalLineTo(7.7879f)
                horizontalLineTo(18.5769f)
                close()
            }
        }
        .build()
        return _tusd!!
    }

private var _tusd: ImageVector? = null
