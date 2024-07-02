package com.example.kmmsocial.android.di

import com.example.kmmsocial.android.presentation.auth.login.LoginViewModel
import com.example.kmmsocial.android.presentation.auth.signup.SignupViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { LoginViewModel() }
    viewModel { SignupViewModel() }
}