package com.davidorellana.logincomposeretrofit2.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.davidorellana.logincomposeretrofit2.R

@Composable
fun Home() {
    val listColorBackground = listOf(
        Color(238, 113, 0, 255),
        Color(101, 0, 126, 255),
        Color(0, 47, 187),
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listColorBackground
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_home_welcome),
            contentDescription = "Icon Home",
            modifier = Modifier.size(400.dp)
        )
    }
}