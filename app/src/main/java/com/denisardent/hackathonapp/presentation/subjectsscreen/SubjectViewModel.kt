package com.denisardent.hackathonapp.presentation.subjectsscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisardent.hackathonapp.data.Subject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SubjectsViewModel: ViewModel() {
    private val _subjects = MutableStateFlow(SubjectsModelState())
    val subjects = _subjects.asStateFlow()

    init {
        viewModelScope.launch {
            _subjects.emit(
                SubjectsModelState(
                    subjectsList = listOf(Subject("Математика", 0.5f), Subject("Русский", 0.2f)
                        , Subject("Русский", 0.2f) , Subject("Русский", 0.2f)
                        , Subject("Русский", 0.2f), Subject("Русский", 0.2f)
                        , Subject("Русский", 0.2f), Subject("Русский", 0.2f)
                        , Subject("Русский", 0.2f), Subject("Русский", 0.2f)
                        , Subject("Русский", 0.2f), Subject("Русский", 0.2f)),
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