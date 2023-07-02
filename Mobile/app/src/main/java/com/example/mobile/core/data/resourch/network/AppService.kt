package com.example.mobile.core.data.resourch.network

import com.example.mobile.core.data.resourch.request.LoginRequest
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

<<<<<<< Updated upstream:Mobile/app/src/main/java/com/example/mobile/core/data/resourch/network/AppService.kt
interface AppService {
@POST("login")
=======
interface ApiService {
@POST("loginmobile")
>>>>>>> Stashed changes:Mobile/app/src/main/java/com/example/mobile/core/data/resourch/network/ApiService.kt
suspend fun login(
@Body login:LoginRequest
):Response<ResponseBody>

}