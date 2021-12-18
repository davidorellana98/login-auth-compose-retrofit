package com.davidorellana.logincomposeretrofit2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.davidorellana.logincomposeretrofit2.ui.navigation.NavigationScreen
import com.davidorellana.logincomposeretrofit2.ui.theme.LoginComposeRetrofit2Theme
import com.davidorellana.logincomposeretrofit2.viewmodel.LoginViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginComposeRetrofit2Theme {
                Surface(color = MaterialTheme.colors.background) {
                    NavigationScreen(viewModel = viewModel)
                }
            }
        }
    }
}