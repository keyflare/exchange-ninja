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

public val CryptoIcons.Ftt: ImageVector
    get() {
        if (_ftt != null) {
            return _ftt!!
        }
        _ftt = Builder(name = "Ftt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFECEFF0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8368f, 24.8367f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1632f, 32.0f, 0.0f, 24.8368f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1632f, 7.1632f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8367f, 0.0f, 32.0f, 7.1632f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00A7C4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.5696f, 11.7683f)
                horizontalLineTo(11.0085f)
                verticalLineTo(7.1947f)
                horizontalLineTo(25.5696f)
                verticalLineTo(11.7683f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5ACADE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6841f, 18.2881f)
                horizontalLineTo(11.0085f)
                verticalLineTo(13.7122f)
                horizontalLineTo(21.6841f)
                verticalLineTo(18.2881f)
                close()
            }
            path(fill = SolidColor(Color(0xFF58CBE0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2373f, 18.2881f)
                horizontalLineTo(9.8132f)
                verticalLineTo(13.7122f)
                horizontalLineTo(5.2373f)
                verticalLineTo(18.2881f)
                close()
            }
            path(fill = SolidColor(Color(0xFFABEBF5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6514f, 24.8054f)
                horizontalLineTo(11.0085f)
                verticalLineTo(20.2318f)
                horizontalLineTo(15.6514f)
                verticalLineTo(24.8054f)
                close()
            }
        }
        .build()
        return _ftt!!
    }

private var _ftt: ImageVector? = null
