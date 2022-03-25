package com.generation.todo.api

import com.generation.todo.util.Constants
import retrofit2.Retrofit



object RetrofitInstance {

    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    val api: ApiService by lazy {

        retrofit.create(ApiService::class.java)

    }


}


