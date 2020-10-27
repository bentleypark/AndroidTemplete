package com.bentley.androidtemplete.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

object KoinModule {
    fun setupKoin(context: Context) {
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(context)
            modules(
                listOf(
                    logModule,
                    networkModule,
                    repositoryModule,
                    viewModelModule,
                    fragmentModule
                )
            )
        }
    }
}