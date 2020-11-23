package kr.sovoro.readbean.di

import kr.sovoro.readbean.ui.TTSFragment
import kr.sovoro.readbean.ui.TTSViewModel
import org.koin.androidx.fragment.dsl.fragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ttsModule = module {
    fragment { TTSFragment() }
    viewModel {
        TTSViewModel(get())
    }
}
