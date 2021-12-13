package com.davidorellana.logincomposeretrofit2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.davidorellana.logincomposeretrofit2.ui.theme.LoginComposeRetrofit2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginComposeRetrofit2Theme {

            }
        }
    }
}