package com.example.mobile.core.di

import com.example.mobile.ui.Auth.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule= module {
    viewModel { LoginViewModel(get()) }
}