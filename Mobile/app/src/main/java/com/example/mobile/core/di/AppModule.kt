package com.example.mobile.core.di

import com.example.mobile.core.data.resourch.RemoteDataSourch
import com.example.mobile.core.data.resourch.network.ApiConfig
import org.koin.dsl.module

val appModule= module {
    single { ApiConfig.provideApiService }
    single { RemoteDataSourch(get()) }
}