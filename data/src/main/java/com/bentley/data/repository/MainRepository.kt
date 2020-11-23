package com.bentley.data.repository

import com.bentley.data.api.ApiService
import com.bentley.data.mapper.NetworkMapper
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import okhttp3.ResponseBody
import timber.log.Timber
import java.io.IOException

class MainRepository
constructor(
//    private val blogDao: BlogDao,
    private val apiService: ApiService,
//    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
) {
    fun requestTTS(text: String) {
        val response = apiService.requestTTS("mijin", text)
        response.enqueue(object : retrofit2.Callback<ResponseBody> {
            override fun onFailure(call: retrofit2.Call<ResponseBody>, t: Throwable) {
                Timber.e(t)
            }

            override fun onResponse(
                call: retrofit2.Call<ResponseBody>,
                response: retrofit2.Response<ResponseBody>
            ) {
                if (response.isSuccessful) {
                    Timber.d("body ${response.body()}")
                }
            }

        })

    }
}