package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CryptoIcons.Mana: ImageVector
    get() {
        if (_mana != null) {
            return _mana!!
        }
        _mana = Builder(name = "Mana", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFF2D55), 1.0f to Color(0xFFFFBC5B),
                        start = Offset(27.3136f,4.6864f), end = Offset(4.6864f,27.3136f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(16.0f, 32.0f)
                    curveTo(24.8366f, 32.0f, 32.0f, 24.8366f, 32.0f, 16.0f)
                    curveTo(32.0f, 7.1634f, 24.8366f, 0.0f, 16.0f, 0.0f)
                    curveTo(7.1634f, 0.0f, 0.0f, 7.1634f, 0.0f, 16.0f)
                    curveTo(0.0f, 24.8366f, 7.1634f, 32.0f, 16.0f, 32.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFA524B3), 1.0f to Color(0xFFFF2D55),
                        start = Offset(16.3325f,10.3999f), end = Offset(16.3325f,22.3999f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(11.3359f, 10.3999f)
                    verticalLineTo(22.3999f)
                    horizontalLineTo(21.3359f)
                    lineTo(11.3359f, 10.3999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.3359f, 22.3999f)
                    horizontalLineTo(11.3359f)
                    verticalLineTo(10.3999f)
                    lineTo(1.3359f, 22.3999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFC9965)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.1999f, 25.6001f)
                    curveTo(4.1119f, 26.8081f, 5.1919f, 27.8881f, 6.4f, 28.8001f)
                    horizontalLineTo(25.6f)
                    curveTo(26.808f, 27.8881f, 27.888f, 26.8081f, 28.7999f, 25.6001f)
                    horizontalLineTo(3.1999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF2D55)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.3999f, 28.8f)
                    curveTo(9.0719f, 30.808f, 12.3999f, 32.0f, 15.9999f, 32.0f)
                    curveTo(19.5999f, 32.0f, 22.9279f, 30.808f, 25.5999f, 28.8f)
                    horizontalLineTo(6.3999f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFA524B3), 1.0f to Color(0xFFFF2D55),
                        start = Offset(25.1296f,16.8f), end = Offset(25.1296f,25.6f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(21.4641f, 16.8f)
                    verticalLineTo(25.6f)
                    horizontalLineTo(28.8001f)
                    lineTo(21.4641f, 16.8f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFBC5B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(21.4639f, 22.3999f)
                    horizontalLineTo(1.3359f)
                    curveTo(1.8319f, 23.5439f, 2.4639f, 24.6159f, 3.1999f, 25.5999f)
                    horizontalLineTo(21.4719f)
                    verticalLineTo(22.3999f)
                    horizontalLineTo(21.4639f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.136f, 25.6f)
                    horizontalLineTo(21.464f)
                    verticalLineTo(16.8f)
                    lineTo(14.136f, 25.6f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC95B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.4641f, 14.3999f)
                    curveTo(23.6732f, 14.3999f, 25.4641f, 12.609f, 25.4641f, 10.3999f)
                    curveTo(25.4641f, 8.1908f, 23.6732f, 6.3999f, 21.4641f, 6.3999f)
                    curveTo(19.255f, 6.3999f, 17.4641f, 8.1908f, 17.4641f, 10.3999f)
                    curveTo(17.4641f, 12.609f, 19.255f, 14.3999f, 21.4641f, 14.3999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFC95B)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.3359f, 8.0f)
                    curveTo(12.4405f, 8.0f, 13.3359f, 7.1046f, 13.3359f, 6.0f)
                    curveTo(13.3359f, 4.8954f, 12.4405f, 4.0f, 11.3359f, 4.0f)
                    curveTo(10.2314f, 4.0f, 9.3359f, 4.8954f, 9.3359f, 6.0f)
                    curveTo(9.3359f, 7.1046f, 10.2314f, 8.0f, 11.3359f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _mana!!
    }

private var _mana: ImageVector? = null
