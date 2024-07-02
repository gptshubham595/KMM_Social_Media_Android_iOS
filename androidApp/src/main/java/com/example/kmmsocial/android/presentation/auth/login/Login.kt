package com.example.kmmsocial.android.presentation.auth.login

import androidx.compose.runtime.Composable
import com.example.kmmsocial.android.core.domain.auth.models.DataChange
import com.example.kmmsocial.android.core.domain.auth.models.LoginDateChange
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Destination
@Composable
fun Login(
    navigator: DestinationsNavigator // replacement for nav controller
) {
    val viewModel : LoginViewModel = koinViewModel()
    LoginScreen(uiState = viewModel.uiState) { onDataChange: LoginDateChange ->
        when(onDataChange.changeParam) {
            DataChange.EMAIL -> viewModel::updateEmail
            DataChange.PASSWORD -> viewModel::updatePassword
            DataChange.USERNAME -> {}
        }

    }
}