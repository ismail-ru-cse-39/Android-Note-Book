package com.example.androidnotebook.model.repository

import android.util.Log
import com.example.androidnotebook.api.UserAPI
import com.example.androidnotebook.model.UserRequest
import javax.inject.Inject

class UserRepository @Inject constructor (private val userApi: UserAPI) {
    private val TAG = "UserRepository"

    suspend fun registerUser(userRequest: UserRequest) {
        val response = userApi.signup(userRequest)
        Log.d(TAG, response.body().toString())
    }

    suspend fun login(userRequest: UserRequest) {
        val response = userApi.signin(userRequest)
        Log.d(TAG, response.body().toString())
    }
}