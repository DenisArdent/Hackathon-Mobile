package com.denisardent.hackathonapp.data.network

import com.google.gson.annotations.SerializedName

data class AuthorizationRequestEntity(
    @SerializedName("username") val username: String,
    @SerializedName("password")val password: String,
)
