package com.davidorellana.logincomposeretrofit2.ui.login.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonLogin(
    onclick: () -> Unit,
    enabled: Boolean
) {
    Button(
        onClick = onclick,
        modifier = Modifier.width(200.dp),
        elevation = ButtonDefaults.elevation(defaultElevation = 5.dp),
        enabled = enabled,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Blue
        )
    ) {
        Text(
            text = "Login",
            fontSize = 35.sp,
            color = Color.White
        )
    }
}