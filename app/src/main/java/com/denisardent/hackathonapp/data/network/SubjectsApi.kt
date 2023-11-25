package com.denisardent.hackathonapp.data.network

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface SubjectsApi {
    @GET("subjects")
    suspend fun getSubjects(): List<SubjectsResponse>
}