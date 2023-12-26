package com.denisardent.hackathonapp

import android.content.Context
import androidx.room.Room
import com.denisardent.hackathonapp.data.DataRepository
import com.denisardent.hackathonapp.data.local.AppDatabase
import com.denisardent.hackathonapp.data.local.RoomDataRepository
import com.denisardent.hackathonapp.data.network.AccountApi
import com.denisardent.hackathonapp.data.network.SubjectsApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repositories {
    private lateinit var applicationContext: Context

    private val retrofit: Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    private val accountApi = retrofit.create(AccountApi::class.java)
    private val subjectsApi = retrofit.create(SubjectsApi::class.java)

    private val database: AppDatabase by lazy<AppDatabase> {
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "database.db")
            .createFromAsset("initial_database.db")
            .build()
    }

    lateinit var roomDatabase: AppDatabase
    lateinit var dataRepository: DataRepository

    fun init(context: Context) {
        applicationContext = context
        roomDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "database.db")
            .createFromAsset("test.db")
            .build()
        dataRepository = RoomDataRepository(roomDatabase.getSubjectsDao())
    }
}

const val BASE_URL = "http://213.171.5.251"