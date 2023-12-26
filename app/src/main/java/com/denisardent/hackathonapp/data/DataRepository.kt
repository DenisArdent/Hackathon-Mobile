package com.denisardent.hackathonapp.data

import com.denisardent.hackathonapp.data.network.AuthorizationResponseEntity
import com.denisardent.hackathonapp.data.network.RegistrationResponseEntity

interface DataRepository {
    suspend fun getSubjects(): List<Subject>
}