package com.bentley.data.api

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    companion object {
        const val BASE_URL = "https://naveropenapi.apigw.ntruss.com/tts-premium/"
    }

    @FormUrlEncoded
    @POST("/v1/tts")
    suspend fun requestTTS(
        @Field("speaker") speaker: String,
        @Field("text") text: String,
        @Field("speed") speed: Int,
        @Field("volume") volume: Int,
        @Field("pitch") pitch: Int,
    )
}