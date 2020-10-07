package com.bentley.androidtemplete

import android.app.Application
import com.bentley.common.di.logModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class baseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@baseApplication)
            modules(
                listOf(logModule)
            )
        }
    }
}