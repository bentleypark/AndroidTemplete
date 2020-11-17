package com.bentley.androidtemplete

import android.Manifest
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.bentley.androidtemplete.databinding.ActivityMainBinding
import com.bentley.common.ex.viewBinding
import org.koin.androidx.fragment.android.setupKoinFragmentFactory
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.KoinExperimentalAPI

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val viewModel: MainViewModel by viewModel()

//    private val permissions = arrayOf(
//        Manifest.permission.RECORD_AUDIO,
////        Manifest.permission.WRITE_EXTERNAL_STORAGE
//    )
//
//    private val requestPermission = registerForActivityResult(
//        ActivityResultContracts.RequestPermission()
//    ) { isGranted ->
//        if (isGranted) {
//            // action to do something
//        } else {
//
//        }
//    }

    @KoinExperimentalAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupKoinFragmentFactory()
        setContentView(binding.root)


//        requestPermission.launch(Manifest.permission.RECORD_AUDIO)
//        viewModel.setStateEvent(MainStateEvent.GetBlogsEvent)
//
//        viewModel.dataState.observe(this,
//            { dataState ->
//                when (dataState) {
//                    is DataState.Success<List<Blog>> -> {
//                        Timber.d(dataState.data.size.toString())
//                    }
//                }
//            }
//        )
    }
}