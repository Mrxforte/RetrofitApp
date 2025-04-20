package com.example.retrofitapp.api

import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiInterface {
    @GET("https://api.restful-api.dev/objects")
    suspend fun getObjectsList():ResponseBody
}