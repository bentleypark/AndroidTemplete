package com.bentley.androidtemplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bentley.androidtemplete.databinding.ActivityMainBinding
import com.bentley.common.ex.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvTitle.text = "View Binding"
    }
}