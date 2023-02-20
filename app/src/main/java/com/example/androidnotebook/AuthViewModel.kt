package com.example.androidnotebook

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidnotebook.model.UserRequest
import com.example.androidnotebook.model.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {
    fun registerUser(userRequest: UserRequest) {
        viewModelScope.launch {
            userRepository.registerUser(userRequest)
        }
    }

    fun loginUser(userRequest: UserRequest) {
        viewModelScope.launch {
            userRepository.login(userRequest)
        }
    }
}