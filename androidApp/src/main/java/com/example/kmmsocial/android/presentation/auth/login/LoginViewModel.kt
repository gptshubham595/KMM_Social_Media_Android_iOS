package com.example.kmmsocial.android.presentation.auth.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.kmmsocial.android.core.domain.auth.models.LoginUiState
import com.example.kmmsocial.android.core.domain.auth.models.SignupUiState

class LoginViewModel : ViewModel() {
    var uiState by mutableStateOf(LoginUiState())
        private set
    
    fun updateEmail(email: String) {
        uiState = uiState.copy(email = email)
    }

    fun updatePassword(password: String) {
        uiState = uiState.copy(password = password)
    }
}