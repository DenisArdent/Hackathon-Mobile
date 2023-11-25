package com.denisardent.hackathonapp

import android.app.Application
import com.denisardent.hackathonapp.data.network.AccountApi
import com.denisardent.hackathonapp.data.network.AccountRetrofitRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Repositories {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val accountRetrofitRepository: AccountRetrofitRepository

    init {
        val accountApi = retrofit.create(AccountApi::class.java)
        accountRetrofitRepository = AccountRetrofitRepository(accountApi)
    }
}

const val BASE_URL = "http://213.171.5.251"