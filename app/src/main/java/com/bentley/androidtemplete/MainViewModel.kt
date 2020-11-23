package com.bentley.androidtemplete

import androidx.lifecycle.*
import com.bentley.data.model.Blog
import com.bentley.data.repository.MainRepository
import com.bentley.data.state.DataState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    private val _dataState: MutableLiveData<DataState<List<Blog>>> = MutableLiveData()

    val dataState: LiveData<DataState<List<Blog>>>
        get() = _dataState

    fun setStateEvent(mainStateEvent: MainStateEvent) {
//        viewModelScope.launch {
//            when (mainStateEvent) {
//                is MainStateEvent.GetBlogsEvent -> {
//                    mainRepository.getBlogs()
//                        .onEach { dataState ->
//                            _dataState.value = dataState
//                        }
//                        .launchIn(viewModelScope)
//                }
//
//                MainStateEvent.None -> {
//                    // who cares
//                }
//            }
    }
}

sealed class MainStateEvent {

    object GetBlogsEvent : MainStateEvent()

    object None : MainStateEvent()
}