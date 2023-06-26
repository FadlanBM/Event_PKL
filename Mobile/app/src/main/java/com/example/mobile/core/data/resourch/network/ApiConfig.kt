package com.example.mobile.core.data.resourch.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiConfig {
    private  const val BASE_API =""
    private val client:Retrofit
        get() {
            val gson=GsonBuilder()
                .setLenient()
                .create()
            val timeout=40L

            val interceptor=HttpLoggingInterceptor()
            interceptor.level=HttpLoggingInterceptor.Level.BODY
            val client:OkHttpClient=OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(60,TimeUnit.SECONDS)
                .writeTimeout(60,TimeUnit.SECONDS)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_API)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    val provideApiService:ApiService
        get() = client.create(provideApiService::class.java)
}