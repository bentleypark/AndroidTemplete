package com.bentley.data.api

import okhttp3.Interceptor
import okhttp3.Response

/**
 * Interceptor to add auth token to requests
 */
class AuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()

        requestBuilder.addHeader("X-NCP-APIGW-API-KEY-ID", "h1m2ubmnh3")
        requestBuilder.addHeader("X-NCP-APIGW-API-KEY", "P88xpx4aW7UXevSZqqYutcO7wxrUJ06KRxSzMfxY")
        return chain.proceed(requestBuilder.build())
    }
}
