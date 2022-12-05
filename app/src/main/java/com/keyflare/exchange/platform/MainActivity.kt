package com.keyflare.exchange.platform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.keyflare.exchange.common.extensions.cast
import com.keyflare.exchange.designSystem.theme.ExchangeTheme
import com.keyflare.exchange.mainScreen.api.mainScreenId
import com.keyflare.exchange.navigation.api.NavigationApi
import com.keyflare.exchange.navigation.api.NavigationState
import com.keyflare.exchange.navigation.core.api.presentation.NavigationReplaceContainer

class MainActivity : ComponentActivity() {
    private val deps by lazy { application.cast<ExchangeApp>().deps }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            ExchangeTheme {
                val appState by deps.store.states.collectAsState()

                NavigationApi.InitNavigationWith(
                    navigator = deps.navigator,
                    destinations = deps.navigationDestinations,
                ) {
                    deps.navigator.push(
                        backstackId = NavigationState.rootId,
                        destination = mainScreenId,
                    )

                    NavigationReplaceContainer(
                        backstack = appState.navigation.root,
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            }
        }
    }
}
