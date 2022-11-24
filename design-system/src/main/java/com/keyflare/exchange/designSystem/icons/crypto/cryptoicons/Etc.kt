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

public val CryptoIcons.Etc: ImageVector
    get() {
        if (_etc != null) {
            return _etc!!
        }
        _etc = Builder(name = "Etc", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF328332)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 16.0f)
                curveTo(32.0f, 24.8365f, 24.8364f, 32.0f, 16.0f, 32.0f)
                curveTo(7.1635f, 32.0f, 0.0f, 24.8365f, 0.0f, 16.0f)
                curveTo(0.0f, 7.1635f, 7.1635f, 0.0f, 16.0f, 0.0f)
                curveTo(24.8364f, 0.0f, 32.0f, 7.1635f, 32.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0001f, 4.1482f)
                verticalLineTo(10.948f)
                lineTo(8.9556f, 14.9243f)
                lineTo(16.0001f, 4.1482f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0001f, 12.2643f)
                verticalLineTo(16.5933f)
                lineTo(9.1804f, 16.0753f)
                lineTo(16.0001f, 12.2643f)
                close()
            }
            path(fill = SolidColor(Color(0xFFADCDAD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0001f, 19.833f)
                verticalLineTo(16.5929f)
                lineTo(9.1804f, 16.0749f)
                lineTo(16.0001f, 19.833f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0001f, 21.1161f)
                verticalLineTo(27.8521f)
                lineTo(8.9556f, 17.1376f)
                lineTo(16.0001f, 21.1161f)
                close()
            }
            path(fill = SolidColor(Color(0xFFADCDAD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.1482f)
                verticalLineTo(10.948f)
                lineTo(23.0467f, 14.9243f)
                lineTo(16.0f, 4.1482f)
                close()
            }
            path(fill = SolidColor(Color(0xFFADCDAD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.2643f)
                verticalLineTo(16.5933f)
                lineTo(22.8219f, 16.0753f)
                lineTo(16.0f, 12.2643f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5B9C5B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 19.833f)
                verticalLineTo(16.5929f)
                lineTo(22.8219f, 16.0749f)
                lineTo(16.0f, 19.833f)
                close()
            }
            path(fill = SolidColor(Color(0xFFADCDAD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0467f, 17.1376f)
                lineTo(16.0f, 21.1161f)
                verticalLineTo(27.8521f)
            }
        }
        .build()
        return _etc!!
    }

private var _etc: ImageVector? = null
