package com.example.retrofitapp.api

import com.example.retrofitapp.models.PostsModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("posts")
    suspend fun getObjectsList(): Response<List<PostsModel>>
}