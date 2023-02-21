package com.example.androidnotebook.model.repository

import android.util.Log
import com.example.androidnotebook.api.UserAPI
import com.example.androidnotebook.model.UserRequest
import com.example.androidnotebook.utils.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor (private val userApi: UserAPI) {

    suspend fun registerUser(userRequest: UserRequest) {
        val response = userApi.signup(userRequest)
        Log.d(TAG, response.body().toString())
    }

    suspend fun login(userRequest: UserRequest) {
        val response = userApi.signin(userRequest)
        Log.d(TAG, response.body().toString())
    }
}