package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons

public val CryptoIcons.Dfi: ImageVector
    get() {
        if (_dfi != null) {
            return _dfi!!
        }
        _dfi = Builder(name = "Dfi", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8357f, 24.8357f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1621f, 32.0f, 0.0f, 24.8357f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1643f, 7.1621f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8357f, 0.0f, 32.0f, 7.1643f, 32.0f, 16.0f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFFFF00AF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.0f, 0.0f)
                    curveTo(24.8444f, 0.0f, 32.0f, 7.1556f, 32.0f, 16.0f)
                    curveTo(32.0f, 24.7556f, 24.9778f, 31.8667f, 16.2667f, 32.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(18.5333f)
                    lineTo(13.9556f, 20.5778f)
                    lineTo(13.6889f, 25.6444f)
                    lineTo(15.8222f, 32.0f)
                    curveTo(14.5778f, 32.0f, 13.3778f, 31.8222f, 12.1778f, 31.5111f)
                    lineTo(11.8667f, 31.4222f)
                    lineTo(10.8444f, 28.3556f)
                    lineTo(7.9556f, 29.8222f)
                    curveTo(6.8889f, 29.2f, 5.9111f, 28.4889f, 5.0222f, 27.6444f)
                    lineTo(4.8f, 27.4222f)
                    lineTo(10.1778f, 24.7111f)
                    lineTo(10.3556f, 21.6444f)
                    lineTo(7.2889f, 21.8222f)
                    lineTo(4.5778f, 27.2f)
                    curveTo(3.7333f, 26.3111f, 2.9778f, 25.3333f, 2.3556f, 24.3111f)
                    lineTo(2.1778f, 24.0444f)
                    lineTo(3.6444f, 21.1556f)
                    lineTo(0.5778f, 20.1333f)
                    curveTo(0.2667f, 18.9333f, 0.0889f, 17.7333f, 0.0444f, 16.5333f)
                    verticalLineTo(16.2222f)
                    lineTo(6.4444f, 18.3556f)
                    lineTo(11.5111f, 18.0889f)
                    lineTo(13.5556f, 16.0444f)
                    lineTo(11.5111f, 14.0f)
                    lineTo(6.4444f, 13.7333f)
                    lineTo(0.0f, 15.8222f)
                    curveTo(0.0f, 14.5778f, 0.1778f, 13.3333f, 0.4444f, 12.1778f)
                    lineTo(0.5333f, 11.8667f)
                    lineTo(3.6f, 10.8444f)
                    lineTo(2.1333f, 7.9556f)
                    curveTo(2.7556f, 6.8889f, 3.4667f, 5.9111f, 4.3111f, 5.0222f)
                    lineTo(4.5333f, 4.8f)
                    lineTo(7.2444f, 10.1778f)
                    lineTo(10.3111f, 10.3556f)
                    lineTo(10.1333f, 7.2889f)
                    lineTo(4.7556f, 4.5778f)
                    curveTo(5.6444f, 3.7333f, 6.6222f, 2.9778f, 7.6444f, 2.3556f)
                    lineTo(7.9111f, 2.1778f)
                    lineTo(10.8f, 3.6444f)
                    lineTo(11.8222f, 0.5778f)
                    curveTo(13.0222f, 0.2667f, 14.2222f, 0.0889f, 15.4222f, 0.0444f)
                    horizontalLineTo(15.7333f)
                    lineTo(13.6f, 6.4f)
                    lineTo(13.8667f, 11.4667f)
                    lineTo(15.9111f, 13.5111f)
                    curveTo(16.0f, 13.4667f, 16.0f, 0.0f, 16.0f, 0.0f)
                    close()
                    moveTo(19.5556f, 4.0889f)
                    verticalLineTo(27.9556f)
                    curveTo(24.6667f, 26.4f, 28.4444f, 21.6444f, 28.4444f, 16.0f)
                    curveTo(28.4444f, 10.4444f, 24.7556f, 5.7333f, 19.7333f, 4.1333f)
                    lineTo(19.5556f, 4.0889f)
                    close()
                }
            }
        }
        .build()
        return _dfi!!
    }

private var _dfi: ImageVector? = null
