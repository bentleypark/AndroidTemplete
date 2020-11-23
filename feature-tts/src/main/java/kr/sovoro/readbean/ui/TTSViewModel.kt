package kr.sovoro.readbean.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bentley.data.repository.MainRepository
import kotlinx.coroutines.launch
import timber.log.Timber

class TTSViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun requestTTS() {
        Timber.d("requestTTS")
        viewModelScope.launch {
           mainRepository.requestTTS("test")
        }
    }
}