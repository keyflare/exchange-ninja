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

public val CryptoIcons.Bat: ImageVector
    get() {
        if (_bat != null) {
            return _bat!!
        }
        _bat = Builder(name = "Bat", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFECEFF0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8379f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1643f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1643f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8379f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFC5000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3189f, 5.1783f)
                verticalLineTo(12.6175f)
                lineTo(12.1915f, 19.8017f)
                curveTo(12.1915f, 19.8017f, 5.7498f, 23.5146f, 5.6634f, 23.5146f)
                curveTo(5.5769f, 23.5146f, 16.3189f, 5.1783f, 16.3189f, 5.1783f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA01E66)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3191f, 5.1783f)
                verticalLineTo(12.6175f)
                lineTo(20.4289f, 19.8017f)
                curveTo(20.4289f, 19.8017f, 26.8439f, 23.5146f, 26.9304f, 23.5146f)
                curveTo(27.0191f, 23.5146f, 16.3191f, 5.1783f, 16.3191f, 5.1783f)
                close()
            }
            path(fill = SolidColor(Color(0xFF662E93)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1914f, 19.8017f)
                horizontalLineTo(20.4287f)
                lineTo(26.9302f, 23.5146f)
                horizontalLineTo(5.6633f)
                lineTo(12.1914f, 19.8017f)
                close()
            }
        }
        .build()
        return _bat!!
    }

private var _bat: ImageVector? = null
