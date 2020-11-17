package kr.sovoro.readbean.ui

import android.Manifest
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.bentley.common.base.ViewBindingHolder
import com.bentley.common.base.ViewBindingHolderImpl
import kr.sovoro.readbean.databinding.FragmentSttBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber
import java.util.*

class STTFragment : Fragment(),
    ViewBindingHolder<FragmentSttBinding> by ViewBindingHolderImpl() {

    private val viewModel: STTViewModel by viewModel()

    private var isTranslationOngoing = false
    private val permissions = arrayOf(
        Manifest.permission.RECORD_AUDIO
    )

    private val sttAcitivity = registerForActivityResult(STTAcitivityContract()) { result ->
        if (result!!.isNotEmpty()) {
            binding!!.apply {
                textFinal.text = result
            }
        }
    }

    private val askMultiplePermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { map ->
            for (entry in map.entries) {
                Toast.makeText(
                    requireContext(),
                    "${entry.key} = ${entry.value}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    lateinit var observer: SpeechRecognizerObserver


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        askMultiplePermissions.launch(permissions)
        observer = SpeechRecognizerObserver(requireContext())
        lifecycle.addObserver(observer)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = initBinding(FragmentSttBinding.inflate(layoutInflater), this) {
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        observer.selectImage()

        binding!!.btnTranslate.setOnClickListener {
//            sttAcitivity.launch("STT Test")
            observer.speechRecognizer.startListening(createIntent(requireContext()))
        }
    }

    private fun createIntent(context: Context): Intent {

        return Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
            )
            putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
            putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, context.packageName)
            putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true)
            putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1)
        }
    }

    companion object {
        fun newInstance() = STTFragment()

        const val REQUEST_CODE_STT = 1
    }
}

class SpeechRecognizerObserver(private val context: Context) : RecognitionListener,
    DefaultLifecycleObserver {

    lateinit var speechRecognizer: SpeechRecognizer

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Timber.d("onCreate")
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(context)
        speechRecognizer.setRecognitionListener(this)
    }

    override fun onReadyForSpeech(params: Bundle?) {
        Timber.d("onReadyForSpeech")
    }

    override fun onBeginningOfSpeech() {
        Timber.d("onBeginningOfSpeech")
    }

    override fun onRmsChanged(rmsdB: Float) {
    }

    override fun onBufferReceived(buffer: ByteArray?) {
    }

    override fun onEndOfSpeech() {
        Timber.d("onEndOfSpeech")
    }

    override fun onError(error: Int) {
    }

    override fun onResults(results: Bundle?) {
        Timber.d("onResults")
        Timber.d("${results!!.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)}")
    }

    override fun onPartialResults(partialResults: Bundle?) {
        Timber.d("onPartialResults")
        Timber.d("${partialResults!!.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)}")
    }

    override fun onEvent(eventType: Int, params: Bundle?) {
    }
}
