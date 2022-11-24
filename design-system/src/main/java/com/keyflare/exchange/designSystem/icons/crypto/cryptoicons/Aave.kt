package com.keyflare.exchange.designSystem.icons.crypto.cryptoicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.icons.crypto.CryptoIcons

public val CryptoIcons.Aave: ImageVector
    get() {
        if (_aave != null) {
            return _aave!!
        }
        _aave = Builder(name = "Aave", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFB6509E), 1.0f to Color(0xFF2EBAC6),
                        start = Offset(27.9294f,5.96233f), end = Offset(4.12137f,25.9943f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(16.0f, 32.0f)
                    curveTo(24.8366f, 32.0f, 32.0f, 24.8366f, 32.0f, 16.0f)
                    curveTo(32.0f, 7.1634f, 24.8366f, 0.0f, 16.0f, 0.0f)
                    curveTo(7.1634f, 0.0f, 0.0f, 7.1634f, 0.0f, 16.0f)
                    curveTo(0.0f, 24.8366f, 7.1634f, 32.0f, 16.0f, 32.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0021f, 22.3752f)
                    lineTo(17.5918f, 9.2948f)
                    curveTo(17.2866f, 8.6185f, 16.833f, 8.2886f, 16.2351f, 8.2886f)
                    horizontalLineTo(15.7567f)
                    curveTo(15.1588f, 8.2886f, 14.7052f, 8.6185f, 14.4f, 9.2948f)
                    lineTo(12.0454f, 14.9937f)
                    horizontalLineTo(10.2639f)
                    curveTo(9.732f, 14.9979f, 9.299f, 15.4267f, 9.2949f, 15.9628f)
                    verticalLineTo(15.9752f)
                    curveTo(9.299f, 16.5071f, 9.732f, 16.9401f, 10.2639f, 16.9442f)
                    horizontalLineTo(11.2206f)
                    lineTo(8.9732f, 22.3752f)
                    curveTo(8.932f, 22.4948f, 8.9072f, 22.6185f, 8.9072f, 22.7463f)
                    curveTo(8.9072f, 23.0515f, 9.0021f, 23.2906f, 9.1711f, 23.4762f)
                    curveTo(9.3402f, 23.6618f, 9.5835f, 23.7525f, 9.8887f, 23.7525f)
                    curveTo(10.0907f, 23.7484f, 10.2845f, 23.6865f, 10.4454f, 23.5669f)
                    curveTo(10.6186f, 23.4473f, 10.7382f, 23.2741f, 10.833f, 23.0762f)
                    lineTo(13.3072f, 16.9401f)
                    horizontalLineTo(15.0227f)
                    curveTo(15.5546f, 16.936f, 15.9876f, 16.5071f, 15.9918f, 15.971f)
                    verticalLineTo(15.9463f)
                    curveTo(15.9876f, 15.4143f, 15.5546f, 14.9814f, 15.0227f, 14.9772f)
                    horizontalLineTo(14.1072f)
                    lineTo(15.9959f, 10.2721f)
                    lineTo(21.1423f, 23.0721f)
                    curveTo(21.2371f, 23.27f, 21.3567f, 23.4432f, 21.5299f, 23.5628f)
                    curveTo(21.6907f, 23.6824f, 21.8887f, 23.7442f, 22.0866f, 23.7484f)
                    curveTo(22.3918f, 23.7484f, 22.6309f, 23.6576f, 22.8041f, 23.4721f)
                    curveTo(22.9773f, 23.2865f, 23.0681f, 23.0473f, 23.0681f, 22.7422f)
                    curveTo(23.0722f, 22.6185f, 23.0516f, 22.4906f, 23.0021f, 22.3752f)
                    close()
                }
            }
        }
        .build()
        return _aave!!
    }

private var _aave: ImageVector? = null
