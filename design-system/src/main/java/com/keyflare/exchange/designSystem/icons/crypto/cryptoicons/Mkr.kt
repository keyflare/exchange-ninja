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

public val CryptoIcons.Mkr: ImageVector
    get() {
        if (_mkr != null) {
            return _mkr!!
        }
        _mkr = Builder(name = "Mkr", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF56B2A4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.162f, 0.0f, 0.0f, 7.162f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.162f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8357f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.162f, 24.8357f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.776f, 16.6698f)
                lineTo(6.8172f, 10.6762f)
                curveTo(6.1451f, 10.1687f, 5.1836f, 10.6495f, 5.1836f, 11.4907f)
                verticalLineTo(21.5305f)
                horizontalLineTo(6.884f)
                verticalLineTo(12.8439f)
                lineTo(13.4585f, 17.8494f)
                verticalLineTo(21.5305f)
                horizontalLineTo(15.1766f)
                verticalLineTo(17.4755f)
                curveTo(15.1766f, 17.1572f, 15.0275f, 16.8612f, 14.776f, 16.6698f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.1807f, 10.6762f)
                lineTo(17.2219f, 16.6698f)
                curveTo(16.9704f, 16.8612f, 16.8213f, 17.1572f, 16.8213f, 17.4755f)
                verticalLineTo(21.5305f)
                horizontalLineTo(18.5395f)
                verticalLineTo(17.8494f)
                lineTo(25.114f, 12.8439f)
                verticalLineTo(21.5305f)
                horizontalLineTo(26.8143f)
                verticalLineTo(11.4907f)
                curveTo(26.8143f, 10.6495f, 25.8529f, 10.1687f, 25.1807f, 10.6762f)
                close()
            }
        }
        .build()
        return _mkr!!
    }

private var _mkr: ImageVector? = null
