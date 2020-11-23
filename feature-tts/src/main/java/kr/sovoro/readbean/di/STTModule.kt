package kr.sovoro.readbean.di

import kr.sovoro.readbean.ui.STTFragment
import kr.sovoro.readbean.ui.STTViewModel
import org.koin.androidx.fragment.dsl.fragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val sttModule = module {
    fragment { STTFragment() }
    viewModel {
        STTViewModel(get())
    }
}
