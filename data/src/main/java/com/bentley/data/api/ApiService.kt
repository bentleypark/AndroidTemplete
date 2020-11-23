package com.bentley.data.api

import com.bentley.data.model.TTSResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    companion object {
        const val BASE_URL = "https://naveropenapi.apigw.ntruss.com/"
    }

    @FormUrlEncoded
    @POST("tts-premium/v1/tts")
    fun requestTTS(
        @Field("speaker") speaker: String,
        @Field("text") text: String,
//        @Field("speed") speed: Int,
//        @Field("volume") volume: Int,
//        @Field("pitch") pitch: Int,
    ): Call<ResponseBody>
}