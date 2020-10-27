package com.bentley.androidtemplete

import android.app.Application
import com.bentley.androidtemplete.di.KoinModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        setupKoin()
    }

    private fun setupKoin() = KoinModule.setupKoin(this)
}