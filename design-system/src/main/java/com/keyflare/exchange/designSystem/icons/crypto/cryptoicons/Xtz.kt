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

public val CryptoIcons.Xtz: ImageVector
    get() {
        if (_xtz != null) {
            return _xtz!!
        }
        _xtz = Builder(name = "Xtz", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF437EEF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9989f, 0.0f)
                curveTo(7.1626f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8357f, 7.1626f, 32.0f, 15.9989f, 32.0f)
                curveTo(24.8374f, 32.0f, 32.0f, 24.8357f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8374f, 0.0f, 15.9989f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2289f, 15.6608f)
                lineTo(23.1392f, 10.8151f)
                lineTo(22.4187f, 10.0215f)
                horizontalLineTo(13.9859f)
                verticalLineTo(6.4549f)
                lineTo(13.3009f, 5.9495f)
                horizontalLineTo(11.0309f)
                verticalLineTo(6.6345f)
                lineTo(11.7868f, 7.3549f)
                verticalLineTo(10.0215f)
                horizontalLineTo(8.4727f)
                verticalLineTo(11.1742f)
                horizontalLineTo(11.7868f)
                verticalLineTo(17.8066f)
                curveTo(11.7868f, 19.7883f, 13.6623f, 20.4178f, 15.3914f, 20.4178f)
                curveTo(17.1205f, 20.4178f, 17.9053f, 19.0124f, 18.0139f, 18.7708f)
                curveTo(18.1203f, 18.527f, 18.2289f, 17.9595f, 17.8499f, 17.8066f)
                curveTo(17.473f, 17.6536f, 17.2558f, 18.0127f, 17.2558f, 18.0127f)
                curveTo(17.2558f, 18.0127f, 16.7148f, 19.1742f, 15.3914f, 19.1742f)
                curveTo(14.0657f, 19.1742f, 13.9859f, 17.8066f, 13.9859f, 17.8066f)
                verticalLineTo(11.1742f)
                horizontalLineTo(20.3283f)
                lineTo(15.806f, 17.1216f)
                verticalLineTo(17.6891f)
                curveTo(15.806f, 17.6891f, 17.6348f, 16.4721f, 18.9871f, 16.8511f)
                curveTo(20.3372f, 17.2302f, 21.2305f, 18.7708f, 21.2305f, 20.6084f)
                curveTo(21.2305f, 22.446f, 20.9867f, 24.7957f, 18.311f, 24.7957f)
                curveTo(16.8368f, 24.7957f, 16.2271f, 24.4034f, 15.9766f, 24.0509f)
                curveTo(16.4754f, 23.827f, 16.8235f, 23.3261f, 16.8235f, 22.7431f)
                curveTo(16.8235f, 21.9517f, 16.1828f, 21.3111f, 15.3914f, 21.3111f)
                curveTo(14.6f, 21.3111f, 13.9593f, 21.9517f, 13.9593f, 22.7431f)
                curveTo(13.9593f, 22.8384f, 13.9682f, 22.9315f, 13.9859f, 23.0202f)
                curveTo(13.9859f, 23.0202f, 14.1744f, 26.0127f, 18.2556f, 26.0127f)
                curveTo(21.184f, 26.0127f, 23.5117f, 24.0044f, 23.454f, 20.9742f)
                curveTo(23.4119f, 18.8439f, 22.6471f, 16.6561f, 20.448f, 15.9335f)
                curveTo(19.7364f, 15.6985f, 18.9738f, 15.6364f, 18.2289f, 15.6608f)
                close()
            }
        }
        .build()
        return _xtz!!
    }

private var _xtz: ImageVector? = null
