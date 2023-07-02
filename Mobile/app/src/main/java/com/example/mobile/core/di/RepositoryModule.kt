package com.example.mobile.core.di

import com.example.mobile.core.data.reository.AppRepository
import org.koin.dsl.module

val repositoryModule= module {
    single { AppRepository(get()) }
}