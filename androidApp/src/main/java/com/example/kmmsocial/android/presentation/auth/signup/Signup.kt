package com.example.kmmsocial.android.presentation.auth.signup

import androidx.compose.runtime.Composable
import com.example.kmmsocial.android.core.domain.auth.models.DataChange
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Destination(start = true)
@Composable
fun Signup(
    navigator: DestinationsNavigator // replacement for nav controller
) {
    val viewModel: SignupViewModel = koinViewModel()
    SignupScreen(uiState = viewModel.uiState) { onDataChange ->
        when (onDataChange.changeParam) {
            DataChange.EMAIL -> viewModel::updateEmail
            DataChange.PASSWORD -> viewModel::updatePassword
            DataChange.USERNAME -> viewModel::updateUserName
        }

    }
}