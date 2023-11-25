package com.denisardent.hackathonapp.presentation.choice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisardent.hackathonapp.Repositories
import com.denisardent.hackathonapp.data.Subject
import com.denisardent.hackathonapp.data.network.Question
import com.denisardent.hackathonapp.presentation.subjectsscreen.SubjectsModelState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/*
class ChoseViewModel: ViewModel() {
    private val retrofitRepository = Repositories.retrofitRepository
    private val _state= MutableStateFlow(Question("df", "", emptyList(), 0))
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {

        }

    }
}

data class QuestionModel(
    val question: String,
    val answer
)*/
