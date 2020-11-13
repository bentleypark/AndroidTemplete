package com.bentley.androidtemplete

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bentley.androidtemplete.databinding.ActivityMainBinding
import com.bentley.common.ex.viewBinding
import com.bentley.data.model.Blog
import com.bentley.data.state.DataState
import org.koin.androidx.fragment.android.setupKoinFragmentFactory
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.KoinExperimentalAPI
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val viewModel: MainViewModel by viewModel()

    @KoinExperimentalAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupKoinFragmentFactory()
        setContentView(binding.root)

        viewModel.setStateEvent(MainStateEvent.GetBlogsEvent)

        viewModel.dataState.observe(this,
            { dataState ->
                when (dataState) {
                    is DataState.Success<List<Blog>> -> {
                        Timber.d(dataState.data.size.toString())
                    }
                }
            }
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }
}