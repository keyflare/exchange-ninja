package com.keyflare.exchange.designSystem.theme

import androidx.compose.ui.graphics.Color
import com.keyflare.exchange.designSystem.common.CustomColors

private val colorAbsoluteBlack = Color(0xFF000000)
private val colorGray12 = Color(0xFF121212)
private val colorGray1C = Color(0xFF1C1C1E)
private val colorGray36 = Color(0xFF363636)
private val colorGray4D = Color(0xFF4D4D4D)
private val colorGray6 = Color(0xFF666666)
private val colorGray9 = Color(0xFF999999)
private val colorGrayC = Color(0xFFCCCCCC)
private val colorGrayCF = Color(0xFFCFCFCF)
private val colorGrayF3 = Color(0xFFF3F3F3)
private val colorAbsoluteWhite = Color(0xFFFFFFFF)
private val colorAlertLight = Color(0xFFFF4433)
private val colorAlertDark = Color(0xFFFF5B4D)
private val colorSuccessLight = Color(0xFF3CB200)
private val colorSuccessDark = Color(0xFF5FB336)
private val colorActionLight = Color(0xFF196DFF)
private val colorActionDark = Color(0xFF3D7EFF)
private val colorAccent = Color(0xFFFEA00A)
private val colorInteractionLight = Color(0xFF979EA7)
private val colorInteractionDark = Color(0xFF8B929B)
private val colorWhiteAlfa10 = Color(0x1AFFFFFF)
private val colorBlackAlfa7 = Color(0x12000000)

internal val LightColors = CustomColors(
    textPrimary = colorAbsoluteBlack,
    textAction = colorActionLight,
    textPrimaryVariant = colorGray4D,
    textSecondary = colorGray9,
    textAdditional = colorGrayC,
    textAlert = colorAlertLight,
    textSuccess = colorSuccessLight,
    background = colorAbsoluteWhite,
    surface = colorAbsoluteWhite,
    surfaceSecondary = colorGrayF3,
    surfaceSecondaryVariant = colorGrayCF,
    surfaceAction = colorActionLight,
    surfaceAccent = colorAccent,
    iconsPrimary = colorInteractionLight,
    iconsSecondary = colorAbsoluteWhite,
    iconsAction = colorActionLight,
    divider = colorBlackAlfa7,
)

internal val DarkColors = CustomColors(
    textPrimary = colorAbsoluteWhite,
    textAction = colorActionDark,
    textPrimaryVariant = colorGrayC,
    textSecondary = colorGray9,
    textAdditional = colorGray6,
    textAlert = colorAlertDark,
    textSuccess = colorSuccessDark,
    background = colorGray12,
    surface = colorGray1C,
    surfaceSecondary = colorGray36,
    surfaceSecondaryVariant = colorGray9,
    surfaceAction = colorActionDark,
    surfaceAccent = colorAccent,
    iconsPrimary = colorInteractionDark,
    iconsSecondary = colorAbsoluteWhite,
    iconsAction = colorActionDark,
    divider = colorWhiteAlfa10,
)
