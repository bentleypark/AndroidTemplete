package com.bentley.common.di

import com.bentley.data.api.provideApiService
import com.bentley.data.api.provideOkHttp
import com.bentley.data.api.provideRetrofit
import org.koin.dsl.module

val networkModule = module {

    factory {
        provideOkHttp()
    }
    single {
        provideRetrofit(get())
    }
    single {
        provideApiService(get())
    }
}