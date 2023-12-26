package com.denisardent.hackathonapp.data.network

import com.denisardent.hackathonapp.data.DataRepository
import com.denisardent.hackathonapp.data.Subject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RetrofitDataRepository(private val accountApi: AccountApi, private val subjectsApi: SubjectsApi):
    DataRepository {
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

    override suspend fun getSubjects(): List<Subject>{
        return withContext(Dispatchers.IO){
            subjectsApi.getSubjects().map { subjectsResponse ->
                Subject(subjectsResponse.title, 1.0f/subjectsResponse.maxProgress)
            }
        }
    }
}