package com.example.composecourse.optimization2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun WelcomeViewAlternative(
    username: String,
) {
    Text(text = "Welcome $username!")
}