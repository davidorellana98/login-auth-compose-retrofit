package com.davidorellana.logincomposeretrofit2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.davidorellana.logincomposeretrofit2.ui.home.Home
import com.davidorellana.logincomposeretrofit2.ui.login.Login
import com.davidorellana.logincomposeretrofit2.viewmodel.LoginViewModel

@Composable
fun NavigationScreen(viewModel: LoginViewModel) {

    val navController = rememberNavController()
    val loadingProgressBar = viewModel.progressBar.value
    val imageError = viewModel.imageErrorAuth.value

    NavHost(
        navController = navController,
        startDestination = Destination.getStartDestination()
    ) {
        composable(route = Destination.Login.route) {
            if (viewModel.isSuccessLoading.value) {
                LaunchedEffect(key1 = Unit) {
                    navController.navigate(route = Destination.Home.route) {
                        popUpTo(route = Destination.Login.route) {
                            inclusive = true
                        }
                    }
                }
            } else {
                Login(
                    loadingProgressBar = loadingProgressBar,
                    onclickLogin = viewModel::login,
                    imageError = imageError
                )
            }
        }

        composable(route = Destination.Home.route) {
            Home()
        }
    }
}