package com.keyflare.exchange.designSystem.common

import androidx.compose.ui.Modifier

inline fun Modifier.addIf(condition: Boolean, modification: Modifier.() -> Modifier) =
    if (condition) modification() else this