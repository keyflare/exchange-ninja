@file:Suppress("DEPRECATION")

package com.keyflare.exchange.designSystem.theme

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.keyflare.exchange.designSystem.R
import com.keyflare.exchange.designSystem.common.CustomTypography

val interFamily = FontFamily(
    Font(R.font.inter_500_medium, FontWeight.Medium),
    Font(R.font.inter_600_semibold, FontWeight.SemiBold),
    Font(R.font.inter_700_bold, FontWeight.Bold),
)

val Type = CustomTypography(
    digitL = TextStyle(
        fontFamily = interFamily,
        fontSize = 40.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    digitM = TextStyle(
        fontFamily = interFamily,
        fontSize = 36.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    digitS = TextStyle(
        fontFamily = interFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    heading1 = TextStyle(
        fontFamily = interFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    heading2 = TextStyle(
        fontFamily = interFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    heading3 = TextStyle(
        fontFamily = interFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.25).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    heading4 = TextStyle(
        fontFamily = interFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.25).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    body1 = TextStyle(
        fontFamily = interFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = (-0.25).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    body2 = TextStyle(
        fontFamily = interFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = (-0.25).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
    body3 = TextStyle(
        fontFamily = interFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = (-0.25).sp,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
    ),
)
