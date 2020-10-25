package com.bentley.androidtemplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bentley.androidtemplete.databinding.ActivityMainBinding
import com.bentley.common.ex.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvTitle.text = "View Binding"
        viewModel.setStateEvent(MainStateEvent.GetBlogsEvent)
    }
}