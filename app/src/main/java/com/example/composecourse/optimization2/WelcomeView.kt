package com.example.composecourse.optimization2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.composecourse.ExternalUser

@Composable
fun WelcomeView(
    user: ExternalUser
) {
    Text(text = "Welcome ${user.username}!")
}