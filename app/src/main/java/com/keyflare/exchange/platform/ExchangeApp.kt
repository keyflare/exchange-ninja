package com.keyflare.exchange.platform

import android.app.Application
import com.keyflare.exchange.BuildConfig
import com.keyflare.exchange.core.di.ApplicationDiComponent
import timber.log.Timber

class ExchangeApp : Application() {

    val deps: ApplicationDiComponent = ApplicationDiComponent(
        applicationContext = this,
    )

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
