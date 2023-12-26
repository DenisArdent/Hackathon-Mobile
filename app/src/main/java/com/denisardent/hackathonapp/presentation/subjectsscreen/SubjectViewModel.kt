package com.denisardent.hackathonapp.presentation.subjectsscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisardent.hackathonapp.Repositories
import com.denisardent.hackathonapp.data.Subject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SubjectsViewModel: ViewModel() {
    private val _subjects = MutableStateFlow(SubjectsModelState())
    val subjects = _subjects.asStateFlow()

    init {
        val dataRepository = Repositories.dataRepository
        viewModelScope.launch {
            val subjectsList = dataRepository.getSubjects()
            _subjects.emit(
                SubjectsModelState(
                    subjectsList = subjectsList,
                    isSubjectsLoading = false
                )
            )
            }

        }
    }

data class SubjectsModelState(
    val subjectsList: List<Subject> = emptyList(),
    val isSubjectsLoading: Boolean = true
)