package com.denisardent.hackathonapp.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RetrofitRepository(private val accountApi: AccountApi, private val subjectsApi: SubjectsApi){
    suspend fun getAuthToken(username: String, password: String): AuthorizationResponseEntity{
        return withContext(Dispatchers.IO){
            accountApi.authorization(AuthorizationRequestEntity(username, password))
        }
    }

    suspend fun registrateAccount(username: String, password: String): RegistrationResponseEntity{
        return withContext(Dispatchers.IO){
            accountApi.signUp(AuthorizationRequestEntity(username, password))
        }
    }

    suspend fun getSubjects(): List<SubjectsResponse>{
        return withContext(Dispatchers.IO){
            subjectsApi.getSubjects()
        }
    }
}