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

public val CryptoIcons.Ltc: ImageVector
    get() {
        if (_ltc != null) {
            return _ltc!!
        }
        _ltc = Builder(name = "Ltc", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF3957A3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 15.9994f)
                curveTo(32.0f, 24.8362f, 24.8373f, 32.0f, 16.0002f, 32.0f)
                curveTo(7.164f, 32.0f, 0.0f, 24.8362f, 0.0f, 15.9994f)
                curveTo(0.0f, 7.1634f, 7.164f, 0.0f, 16.0002f, 0.0f)
                curveTo(24.8373f, 0.0f, 32.0f, 7.1634f, 32.0f, 15.9994f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.415f, 21.0953f)
                lineTo(14.4622f, 21.0854f)
                lineTo(15.9515f, 16.0783f)
                lineTo(18.2507f, 15.389f)
                lineTo(18.743f, 13.7232f)
                lineTo(16.4417f, 14.4315f)
                lineTo(18.8764f, 6.2436f)
                curveTo(18.9449f, 6.0142f, 18.817f, 5.6885f, 18.4874f, 5.6885f)
                horizontalLineTo(15.3448f)
                curveTo(15.1154f, 5.6885f, 14.8753f, 5.8744f, 14.8069f, 6.1024f)
                lineTo(11.9164f, 15.8231f)
                lineTo(9.6865f, 16.5091f)
                lineTo(9.1623f, 18.1163f)
                lineTo(11.437f, 17.4334f)
                lineTo(9.3715f, 24.379f)
                horizontalLineTo(13.4828f)
                lineTo(13.4862f, 24.3678f)
                lineTo(21.6602f, 24.379f)
                curveTo(21.8586f, 24.379f, 22.0647f, 24.2301f, 22.1185f, 24.0485f)
                lineTo(22.8027f, 21.6736f)
                curveTo(22.9503f, 21.2627f, 22.6129f, 21.0962f, 22.415f, 21.0953f)
                close()
            }
        }
        .build()
        return _ltc!!
    }

private var _ltc: ImageVector? = null
