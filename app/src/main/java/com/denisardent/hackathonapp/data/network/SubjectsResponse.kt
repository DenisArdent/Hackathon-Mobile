package com.denisardent.hackathonapp.data.network

data class SubjectsResponse(
    val id: String,
    val title: String,
    val description: String,
    val imageUrl: String,
    val questions: List<Question>,
    val maxProgress: Int
)

data class Question(
    val id: String,
    val title: String,
    val responses: List<String>,
    val trueResponseIndex: Int,
)
