package com.example.kmmsocial.android.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.kmmsocial.android.presentation.auth.NavGraphs
import com.ramcosta.composedestinations.DestinationsNavHost

@Composable
fun SocialAppLauncher() {

    val navController = rememberNavController()

    DestinationsNavHost(navGraph = NavGraphs.root, navController = navController)
}