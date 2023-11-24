package com.denisardent.hackathonapp.presentation.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisardent.hackathonapp.presentation.subjectsscreen.SubjectsModelState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProfileViewModel: ViewModel() {
    private val _state = MutableStateFlow(ProfileModelState())
    val subjects = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.emit(
                ProfileModelState("Vasya")
            )
        }
    }
}

data class ProfileModelState(
    val name: String = "",
)