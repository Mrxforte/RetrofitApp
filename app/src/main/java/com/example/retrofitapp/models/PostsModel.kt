package com.example.retrofitapp.models

data class PostsModel(
    val userId: Long,
    val id: Long,
    val title: String,
    val body: String,
)
