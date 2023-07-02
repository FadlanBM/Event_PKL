package com.example.mobile.core.data.resourch.network

import com.example.mobile.util.BaseApi
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

<<<<<<< Updated upstream:Mobile/app/src/main/java/com/example/mobile/core/data/resourch/network/AppConfig.kt
object AppConfig {
    private  const val BASE_API =""
=======
object ApiConfig {
    private  const val URL_API =BaseApi.BASE_API+"api/auth/"
>>>>>>> Stashed changes:Mobile/app/src/main/java/com/example/mobile/core/data/resourch/network/ApiConfig.kt
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
                .baseUrl(URL_API)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
<<<<<<< Updated upstream:Mobile/app/src/main/java/com/example/mobile/core/data/resourch/network/AppConfig.kt
    val provideAppService:AppService
        get() = client.create(provideAppService::class.java)
=======
    val provideApiService:ApiService
        get() = client.create(ApiService::class.java)
>>>>>>> Stashed changes:Mobile/app/src/main/java/com/example/mobile/core/data/resourch/network/ApiConfig.kt
}