package com.bentley.androidtemplete.di

import org.koin.androidx.fragment.dsl.fragment
import org.koin.dsl.module

val fragmentModule = module {
    fragment { MainFragment() }
}