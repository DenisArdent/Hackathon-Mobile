package com.denisardent.hackathonapp.data.network

import retrofit2.http.Body
import retrofit2.http.POST

interface AccountApi {


    @POST("authorization")
    suspend fun authorization(@Body body: AuthorizationRequestEntity): AuthorizationResponseEntity

    /**
     * Creates new account
     */
    @POST("registration")
    suspend fun signUp(@Body body: AuthorizationRequestEntity): RegistrationResponseEntity
}