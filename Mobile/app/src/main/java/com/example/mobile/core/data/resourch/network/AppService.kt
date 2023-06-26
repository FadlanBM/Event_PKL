package com.example.mobile.core.data.resourch.network

import com.example.mobile.core.data.resourch.request.LoginRequest
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AppService {
@POST("login")
suspend fun login(
@Body login:LoginRequest
):Response<ResponseBody>

}