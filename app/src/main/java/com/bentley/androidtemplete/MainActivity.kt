package com.bentley.androidtemplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.bentley.androidtemplete.databinding.ActivityMainBinding
import com.bentley.common.ex.viewBinding
import com.bentley.data.model.Blog
import com.bentley.data.state.DataState
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvTitle.text = "View Binding"
        viewModel.setStateEvent(MainStateEvent.GetBlogsEvent)

        viewModel.dataState.observe(this,
            { dataState ->
                when (dataState) {
                    is DataState.Success<List<Blog>> -> {
                        Timber.d(dataState.data.size.toString())
                    }
                }
            })
    }
}