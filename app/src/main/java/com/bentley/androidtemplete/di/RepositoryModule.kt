package com.bentley.androidtemplete.di

import com.bentley.data.mapper.provideNetworkMapper
import com.bentley.data.repository.MainRepository
import org.koin.dsl.module

val repositoryModule = module {

    single {
        provideNetworkMapper()
    }
    single {
        MainRepository(get(), get())
    }
}