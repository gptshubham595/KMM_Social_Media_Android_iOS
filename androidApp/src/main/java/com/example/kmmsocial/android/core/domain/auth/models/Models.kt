package com.example.kmmsocial.android.core.domain.auth.models

data class SignupUiState(
    val email: String = "",
    val password: String = "",
    val userName: String = "",
)

data class LoginUiState(
    val email: String = "",
    val password: String = "",
)

enum class AuthState {
    AUTHENTICATED,
    UNAUTHENTICATED,
    LOADING
}

enum class DataChange {
    EMAIL,
    PASSWORD,
    USERNAME
}

data class SignupDateChange(
    val changeParam: DataChange,
    val value: String
)

data class LoginDateChange(
    val changeParam: DataChange,
    val value: String
)
