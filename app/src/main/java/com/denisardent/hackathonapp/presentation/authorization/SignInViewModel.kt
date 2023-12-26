package com.denisardent.hackathonapp.presentation.authorization

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisardent.hackathonapp.Repositories
import com.denisardent.hackathonapp.data.DataRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SignInViewModel(): ViewModel() {
    val accountRepository: DataRepository = Repositories.dataRepository
    private val _state = MutableStateFlow(SignInState(false, false))
    val state = _state.asStateFlow()

    suspend fun authorization(username: String, password: String){
        try {
//            val authToken = accountRepository.getAuthToken(username, password)
            viewModelScope.launch {
                _state.emit(SignInState(false, true))
            }
        } catch (e: Exception){
            viewModelScope.launch {
                _state.emit(SignInState(true))
            }
        }
    }

    suspend fun registration(username: String, password: String){
        try {
//            val authToken = accountRepository.registrateAccount(username, password)
            viewModelScope.launch {
            }
        } catch (e: Exception){
            viewModelScope.launch {
                _state.emit(SignInState(true))
            }
        }
    }
}

data class SignInState(
    var isError: Boolean,
    val isSuccesed: Boolean = false
)