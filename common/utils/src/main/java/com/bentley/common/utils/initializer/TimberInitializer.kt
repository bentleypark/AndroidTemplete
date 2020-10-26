package com.bentley.common.utils.initializer

import android.content.Context
import androidx.startup.Initializer
import com.bentley.common.utils.BuildConfig
import timber.log.Timber

class TimberInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.d("TimberInitializer is initialized.")
    }

    override fun dependencies(): List<Class<out Initializer<*>>> =
        listOf(StheoInitializer::class.java)
}
