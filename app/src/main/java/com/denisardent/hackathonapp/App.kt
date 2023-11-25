package com.denisardent.hackathonapp

import com.denisardent.hackathonapp.data.network.AccountApi
import com.denisardent.hackathonapp.data.network.RetrofitRepository
import com.denisardent.hackathonapp.data.network.SubjectsApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repositories {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitRepository: RetrofitRepository

    init {
        val accountApi = retrofit.create(AccountApi::class.java)
        val subjectsApi = retrofit.create(SubjectsApi::class.java)
        retrofitRepository = RetrofitRepository(accountApi, subjectsApi)
    }
}

const val BASE_URL = "http://213.171.5.251"