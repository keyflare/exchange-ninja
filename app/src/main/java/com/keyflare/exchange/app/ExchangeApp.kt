package com.keyflare.exchange.app

import android.app.Application
import com.keyflare.exchange.BuildConfig
import timber.log.Timber

class ExchangeApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
