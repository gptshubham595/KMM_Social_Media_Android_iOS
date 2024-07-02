package com.example.kmmsocial.android.presentation.auth.signup

import android.util.Log
import androidx.compose.runtime.Composable
import com.example.kmmsocial.android.core.domain.auth.models.DataChange
import com.example.kmmsocial.android.core.domain.auth.models.SignupDateChange
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Destination(start = true)
@Composable
fun Signup(
    navigator: DestinationsNavigator // replacement for nav controller
) {
    val viewModel: SignupViewModel = koinViewModel()
    SignupScreen(
        uiState = viewModel.uiState,
//        onUsernameChange = viewModel::updateUserName,
        /*onEmailChange = viewModel::updateEmail,
        onPasswordChange = viewModel::updatePassword,*/
        onDataChange = { onDataChange: SignupDateChange ->
            Log.d("Signup", "onDataChange: $onDataChange")
            val value = onDataChange.value
            when (onDataChange.changeParam) {
                DataChange.EMAIL -> viewModel.updateEmail(onDataChange.value)
                DataChange.PASSWORD -> viewModel.updatePassword(onDataChange.value)
                DataChange.USERNAME -> viewModel.updateUserName(onDataChange.value)
            }

        })
}