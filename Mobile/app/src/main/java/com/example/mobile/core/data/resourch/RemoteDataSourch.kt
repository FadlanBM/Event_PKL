package com.example.mobile.core.data.resourch

import com.example.mobile.core.data.resourch.network.ApiService
import com.example.mobile.core.data.resourch.request.LoginRequest

class RemoteDataSourch(val api:ApiService) {
    suspend fun login(data:LoginRequest)=api.login(data)
}