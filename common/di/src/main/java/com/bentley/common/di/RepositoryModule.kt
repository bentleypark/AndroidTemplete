package com.bentley.common.di

import com.bentley.data.mapper.provideNetworkMapper
import com.bentley.data.repository.MainRepository
import org.koin.dsl.module

val repositoryModule = module {

    factory {
        provideNetworkMapper()
    }
    single {
        MainRepository(get(), get())
    }
}