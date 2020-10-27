package com.bentley.androidtemplete.di

import com.bentley.data.api.provideApiService
import com.bentley.data.api.provideOkHttp
import com.bentley.data.api.provideRetrofit
import org.koin.dsl.module

val networkModule = module {

    single {
        provideOkHttp()
    }
    single {
        provideRetrofit(get())
    }
    single {
        provideApiService(get())
    }
}