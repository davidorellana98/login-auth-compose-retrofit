package com.davidorellana.logincomposeretrofit2.ui.login.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun TextLogin() {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.ExtraBold, color = Color.Blue, letterSpacing = 10.sp)) {
                append("L")
            }
            withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.ExtraBold, color = Color.Red, letterSpacing = 10.sp)) {
                append("O")
            }
            withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.ExtraBold, color = Color.Green, letterSpacing = 10.sp)) {
                append("G")
            }
            withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.ExtraBold, color = Color.Cyan, letterSpacing = 10.sp)) {
                append("I")
            }
            withStyle(style = SpanStyle(fontSize = 30.sp, fontWeight = FontWeight.ExtraBold, color = Color.Magenta, letterSpacing = 10.sp)) {
                append("N")
            }
        }
    )
}