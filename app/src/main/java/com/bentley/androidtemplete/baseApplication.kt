package com.bentley.androidtemplete

import android.app.Application
import com.bentley.common.utils.log.FileLogTree
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class baseApplication : Application() {

    private val logModule = module {
        single {
            FileLogTree(get())
        }
    }

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