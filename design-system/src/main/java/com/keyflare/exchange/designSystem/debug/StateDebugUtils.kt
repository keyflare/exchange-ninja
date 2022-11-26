package com.keyflare.exchange.designSystem.debug

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.*

@Composable
@SuppressLint("LogNotTimber")
fun State<*>.LogChanges(message: String) {
    LaunchedEffect(key1 = value) {
        Log.d("!!!", "State Change ($message): $value")
    }
}
