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

public val CryptoIcons.Matic: ImageVector
    get() {
        if (_matic != null) {
            return _matic!!
        }
        _matic = Builder(name = "Matic", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFF2F2F2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1643f, 0.0f, 0.0f, 7.1626f, 0.0f, 16.0011f)
                curveTo(0.0f, 24.8374f, 7.1643f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8379f, 32.0f, 32.0f, 24.8374f, 32.0f, 16.0011f)
                curveTo(32.0f, 7.1626f, 24.8379f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2D93F7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4705f, 10.3685f)
                verticalLineTo(21.6854f)
                lineTo(9.6757f, 23.47f)
                verticalLineTo(15.8662f)
                lineTo(15.9888f, 19.36f)
                verticalLineTo(15.8285f)
                lineTo(6.4705f, 10.3685f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2D93F7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2075f, 10.3685f)
                verticalLineTo(21.6322f)
                lineTo(22.3796f, 23.47f)
                verticalLineTo(12.1353f)
                lineTo(19.2075f, 10.3685f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3070E9)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9888f, 15.8284f)
                lineTo(19.2074f, 14.0084f)
                lineTo(9.6935f, 8.5306f)
                lineTo(6.4705f, 10.3683f)
                lineTo(15.9888f, 15.8284f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3070E9)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3796f, 12.135f)
                lineTo(25.5317f, 10.3682f)
                lineTo(22.3796f, 8.5304f)
                lineTo(19.2075f, 10.3682f)
                lineTo(22.3796f, 12.135f)
                close()
            }
            path(fill = SolidColor(Color(0xFF38BCF4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6758f, 15.8662f)
                verticalLineTo(23.47f)
                lineTo(12.839f, 21.7209f)
                verticalLineTo(17.6153f)
                lineTo(9.6758f, 15.8662f)
                close()
            }
            path(fill = SolidColor(Color(0xFF38BCF4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9888f, 19.3596f)
                lineTo(19.2074f, 17.5595f)
                verticalLineTo(14.0082f)
                lineTo(15.9888f, 15.8282f)
                verticalLineTo(19.3596f)
                close()
            }
            path(fill = SolidColor(Color(0xFF38BCF4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3794f, 12.1353f)
                verticalLineTo(23.47f)
                lineTo(25.5315f, 21.6677f)
                verticalLineTo(10.3685f)
                lineTo(22.3794f, 12.1353f)
                close()
            }
        }
        .build()
        return _matic!!
    }

private var _matic: ImageVector? = null
