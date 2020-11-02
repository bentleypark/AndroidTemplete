package com.bentley.androidtemplete

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class KoinFragmentFactory: FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            HomeFragment::class.java.name -> HomeFragment()
            else -> super.instantiate(classLoader, className)
        }
    }
}