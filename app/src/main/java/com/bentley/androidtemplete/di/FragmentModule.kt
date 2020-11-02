package com.bentley.androidtemplete.di

import com.bentley.androidtemplete.HomeFragment
import org.koin.androidx.fragment.dsl.fragment
import org.koin.dsl.module

val fragmentModule = module {
    fragment { HomeFragment() }
}