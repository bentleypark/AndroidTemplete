package com.bentley.androidtemplete.di

import com.bentley.common.utils.log.FileLogTree
import org.koin.dsl.module

val logModule = module {
    single {
        FileLogTree(get())
    }
}
