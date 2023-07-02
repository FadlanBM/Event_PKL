package com.example.mobile.core.data.reository

import android.util.Log
import com.example.mobile.core.data.resourch.RemoteDataSourch
import com.example.mobile.core.data.resourch.request.LoginRequest
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class AppRepository(val remote:RemoteDataSourch) {
    fun login(data:LoginRequest)= flow {
        try {
            remote.login(data).let {
                if (it.isSuccessful){
                    val body=it.body()
                    emit(body)
                    Log.d("TAG","Berhasil Login"+body.toString())
                }else{
                    Log.d("TAG","Error")
                }
            }
        }catch (e:Exception){
                Log.d("TAG","Error = "+e.message)
        }
    }
}