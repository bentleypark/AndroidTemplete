package com.bentley.androidtemplete

import android.app.Application
import com.bentley.common.di.KoinModule
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()

//        setupKoin()
    }

//    private fun setupKoin() = KoinModule.setupKoin(this)
}