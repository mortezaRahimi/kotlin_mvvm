package com.mortex.learn.kotlinmvvmrxroom.network

import com.mortex.learn.kotlinmvvmrxroom.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}