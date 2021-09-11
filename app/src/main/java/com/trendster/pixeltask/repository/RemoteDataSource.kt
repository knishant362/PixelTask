package com.trendster.pixeltask.repository

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.trendster.pixeltask.data.ApiService
import com.trendster.pixeltask.model.OfferData
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RemoteDataSource {

    private val BASE_URL = "https://www.mlm.pixelsoftwares.com/"
    private val token = "96a02d9459756c7fb552363c0b43ab8e"

    private fun okHttpProvider(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(
                Interceptor {
                    val builder = it.request().newBuilder()
//                    builder.header("Content-Type", "application/json")
                    builder.header("Token", token)
                    return@Interceptor it.proceed(builder.build())
                }
            )
            .readTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(30, TimeUnit.SECONDS)
            .build()

    var gson: Gson = GsonBuilder()
        .setLenient()
        .create()

    private val apicall = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpProvider())
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
        .create(ApiService::class.java)

    suspend fun getData(): Response<OfferData> {
        return apicall.getData()
    }
}
