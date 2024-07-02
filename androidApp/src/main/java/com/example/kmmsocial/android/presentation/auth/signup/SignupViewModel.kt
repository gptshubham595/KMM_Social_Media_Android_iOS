package com.example.kmmsocial.android.presentation.auth.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.kmmsocial.android.core.domain.auth.models.SignupUiState

class SignupViewModel : ViewModel() {
    var uiState by mutableStateOf(SignupUiState())
        private set

    fun updateUserName(userName: String) {
        uiState = uiState.copy(userName = userName)
    }

    fun updateEmail(email: String) {
        uiState = uiState.copy(email = email)
    }

    fun updatePassword(password: String) {
        uiState = uiState.copy(password = password)
    }
}