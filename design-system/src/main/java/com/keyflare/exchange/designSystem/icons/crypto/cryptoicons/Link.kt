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

public val CryptoIcons.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF4659B1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0002f)
                curveTo(32.0f, 24.8373f, 24.8373f, 32.0f, 16.0002f, 32.0f)
                curveTo(7.1636f, 32.0f, 0.0f, 24.8373f, 0.0f, 16.0002f)
                curveTo(0.0f, 7.164f, 7.1636f, 0.0f, 16.0002f, 0.0f)
                curveTo(24.8373f, 0.0f, 32.0f, 7.164f, 32.0f, 16.0002f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5812f, 19.2224f)
                lineTo(16.0004f, 22.4447f)
                lineTo(10.42f, 19.2224f)
                verticalLineTo(12.7779f)
                lineTo(16.0004f, 9.5565f)
                lineTo(21.5812f, 12.7779f)
                verticalLineTo(19.2224f)
                close()
                moveTo(16.0004f, 4.8066f)
                lineTo(6.3057f, 10.4025f)
                verticalLineTo(21.5974f)
                lineTo(16.0004f, 27.195f)
                lineTo(25.6947f, 21.5974f)
                verticalLineTo(10.4025f)
                lineTo(16.0004f, 4.8066f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
