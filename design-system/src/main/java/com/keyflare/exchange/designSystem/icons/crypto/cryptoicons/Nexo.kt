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

public val CryptoIcons.Nexo: ImageVector
    get() {
        if (_nexo != null) {
            return _nexo!!
        }
        _nexo = Builder(name = "Nexo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF3360BE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0011f, 0.0f)
                curveTo(7.1626f, 0.0f, 0.0f, 7.1625f, 0.0f, 16.0011f)
                curveTo(0.0f, 24.8374f, 7.1626f, 32.0f, 16.0011f, 32.0f)
                curveTo(24.8375f, 32.0f, 32.0f, 24.8374f, 32.0f, 16.0011f)
                curveTo(32.0f, 7.1625f, 24.8375f, 0.0f, 16.0011f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5549f, 12.3373f)
                lineTo(5.0662f, 9.1478f)
                verticalLineTo(21.5743f)
                curveTo(5.0662f, 21.6967f, 5.1307f, 21.808f, 5.2353f, 21.8681f)
                lineTo(10.5549f, 24.9597f)
                verticalLineTo(18.5984f)
                verticalLineTo(12.3373f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC1DDFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4343f, 18.6208f)
                lineTo(10.5547f, 12.3374f)
                verticalLineTo(18.5985f)
                lineTo(15.999f, 21.7769f)
                lineTo(21.4454f, 24.9531f)
                lineTo(26.9008f, 21.7769f)
                lineTo(21.4343f, 18.6208f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA8CCFA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.6758f, 9.0009f)
                lineTo(21.4341f, 5.8892f)
                verticalLineTo(18.6207f)
                lineTo(26.9006f, 21.7769f)
                verticalLineTo(9.3926f)
                curveTo(26.9006f, 9.2324f, 26.8138f, 9.0832f, 26.6758f, 9.0009f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDDEDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4345f, 18.6208f)
                verticalLineTo(12.2573f)
                lineTo(16.0014f, 9.1079f)
                lineTo(10.7597f, 6.0697f)
                curveTo(10.6329f, 5.9962f, 10.4748f, 5.9962f, 10.3502f, 6.0697f)
                lineTo(5.0662f, 9.148f)
                lineTo(21.4345f, 18.6208f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC1DDFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4343f, 12.2573f)
                verticalLineTo(5.8894f)
                lineTo(16.0012f, 9.1079f)
                lineTo(21.4343f, 12.2573f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDDEDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5547f, 24.9597f)
                lineTo(15.999f, 21.7769f)
                lineTo(10.5547f, 18.5984f)
                verticalLineTo(24.9597f)
                close()
            }
        }
        .build()
        return _nexo!!
    }

private var _nexo: ImageVector? = null
