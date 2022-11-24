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

public val CryptoIcons.Cro: ImageVector
    get() {
        if (_cro != null) {
            return _cro!!
        }
        _cro = Builder(name = "Cro", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF103F68)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9999f, 0.0f)
                curveTo(7.1635f, 0.0f, 0.0f, 7.1643f, 0.0f, 16.0f)
                curveTo(0.0f, 24.8379f, 7.1635f, 32.0f, 15.9999f, 32.0f)
                curveTo(24.8365f, 32.0f, 32.0f, 24.8379f, 32.0f, 16.0f)
                curveTo(32.0f, 7.1643f, 24.8365f, 0.0f, 15.9999f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2949f, 13.6169f)
                horizontalLineTo(20.5421f)
                lineTo(19.6301f, 9.7799f)
                horizontalLineTo(12.2066f)
                lineTo(11.2949f, 13.6169f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5718f, 16.2926f)
                lineTo(18.3375f, 14.1868f)
                horizontalLineTo(13.5356f)
                lineTo(14.3015f, 16.2926f)
                lineTo(14.0648f, 18.7065f)
                horizontalLineTo(17.8083f)
                lineTo(17.5718f, 16.2926f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5356f, 18.8505f)
                verticalLineTo(16.2925f)
                lineTo(11.2952f, 14.8605f)
                lineTo(8.7788f, 16.7624f)
                lineTo(12.2023f, 22.7607f)
                horizontalLineTo(13.5356f)
                lineTo(15.2023f, 21.2579f)
                verticalLineTo(20.4643f)
                lineTo(13.5356f, 18.8505f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3013f, 16.2925f)
                verticalLineTo(18.8505f)
                lineTo(16.6348f, 20.4643f)
                verticalLineTo(21.2579f)
                lineTo(18.3013f, 22.7607f)
                horizontalLineTo(19.6346f)
                lineTo(23.0581f, 16.7624f)
                lineTo(20.5419f, 14.8605f)
                lineTo(18.3013f, 16.2925f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.5033f, 20.9476f)
                lineTo(15.9604f, 25.8641f)
                lineTo(7.4966f, 20.9587f)
                verticalLineTo(11.0345f)
                lineTo(15.9599f, 6.1357f)
                lineTo(24.5033f, 11.0612f)
                verticalLineTo(20.9476f)
                close()
                moveTo(15.959f, 5.0096f)
                lineTo(6.5212f, 10.4715f)
                verticalLineTo(21.5194f)
                lineTo(15.9586f, 26.9902f)
                lineTo(25.4786f, 21.5106f)
                verticalLineTo(10.4981f)
                lineTo(15.959f, 5.0096f)
                close()
            }
        }
        .build()
        return _cro!!
    }

private var _cro: ImageVector? = null
