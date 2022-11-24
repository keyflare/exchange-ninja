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

public val CryptoIcons.Flow: ImageVector
    get() {
        if (_flow != null) {
            return _flow!!
        }
        _flow = Builder(name = "Flow", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF01EE8A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 0.0f)
                curveTo(7.1643f, 0.0f, 0.0f, 7.1621f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.1643f, 32.0f, 16.0f, 32.0f)
                curveTo(24.8379f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1621f, 24.8379f, 0.0f, 16.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3574f, 19.3541f)
                curveTo(14.3574f, 20.2607f, 13.6237f, 20.9944f, 12.717f, 20.9944f)
                horizontalLineTo(12.6705f)
                curveTo(11.7661f, 20.9944f, 11.0324f, 20.2607f, 11.0324f, 19.3541f)
                curveTo(11.0324f, 18.4497f, 11.7661f, 17.716f, 12.6705f, 17.716f)
                horizontalLineTo(14.3574f)
                verticalLineTo(13.1984f)
                horizontalLineTo(12.6373f)
                curveTo(9.2612f, 13.1984f, 6.5259f, 15.9338f, 6.5259f, 19.3076f)
                curveTo(6.5259f, 22.6836f, 9.2612f, 25.4189f, 12.6373f, 25.4189f)
                horizontalLineTo(12.7658f)
                curveTo(16.1396f, 25.4189f, 18.875f, 22.6836f, 18.875f, 19.3076f)
                verticalLineTo(17.716f)
                horizontalLineTo(14.3574f)
                verticalLineTo(19.3541f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2751f, 17.7158f)
                verticalLineTo(13.1982f)
                horizontalLineTo(18.875f)
                verticalLineTo(17.7158f)
                horizontalLineTo(23.2751f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5774f, 10.9794f)
                horizontalLineTo(25.4763f)
                verticalLineTo(6.5792f)
                horizontalLineTo(20.3779f)
                curveTo(17.0529f, 6.5792f, 14.3574f, 9.2747f, 14.3574f, 12.5997f)
                verticalLineTo(13.1982f)
                horizontalLineTo(18.875f)
                verticalLineTo(12.6818f)
                curveTo(18.875f, 11.7419f, 19.6375f, 10.9794f, 20.5774f, 10.9794f)
                close()
            }
        }
        .build()
        return _flow!!
    }

private var _flow: ImageVector? = null
