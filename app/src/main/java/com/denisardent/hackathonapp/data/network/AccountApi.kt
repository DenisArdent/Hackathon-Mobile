package com.denisardent.hackathonapp.data.network

interface AccountApi {
    suspend fun signIn(email: String, password: String)
    /**
     * Creates new account
     */
    suspend fun signUp()
}