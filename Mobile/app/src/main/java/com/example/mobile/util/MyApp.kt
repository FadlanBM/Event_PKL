package com.example.mobile.util

import android.app.Application
import com.example.mobile.core.di.appModule
import com.example.mobile.core.di.repositoryModule
import com.example.mobile.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}