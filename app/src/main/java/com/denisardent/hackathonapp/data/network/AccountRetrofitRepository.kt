package com.denisardent.hackathonapp.data.network

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AccountRetrofitRepository(private val accountApi: AccountApi){
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
}