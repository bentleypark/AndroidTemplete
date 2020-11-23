package com.bentley.androidtemplete.di

import android.content.Context
import kr.sovoro.readbean.di.sttModule
import kr.sovoro.readbean.di.ttsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.KoinExperimentalAPI
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

@KoinExperimentalAPI
object KoinModule {
    fun setupKoin(context: Context) {
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(context)
            fragmentFactory()
            modules(
                listOf(
                    logModule,
                    networkModule,
                    repositoryModule,
                    viewModelModule,
                    fragmentModule,
                    sttModule,
                    ttsModule
                )
            )
        }
    }
}