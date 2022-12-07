package com.keyflare.exchange.designSystem.common

import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect

@Composable
inline fun BackPressedCallback(
    enabled: Boolean,
    crossinline body: () -> Unit,
) {
    val dispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    val callback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() = body()
    }

    DisposableEffect(key1 = enabled) {
        if (enabled) {
            dispatcher?.addCallback(callback)
        }
        onDispose {
            callback.remove()
        }
    }
}
