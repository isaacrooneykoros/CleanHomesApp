package com.homenurturing.entertainmentex.ui.theme.screens.signup

import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun Signupsc(onSignup: (String, String) -> Unit) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var isError = false


    Column(
        modifier = Modifier.fillMaxSize(),
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Text(text = "Join the Fun!", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            isError = isError && username.isEmpty()
        )
        if (isError && username.isEmpty()) {
            Text(text = "Username cannot be empty")
        }
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            isError = isError && (password.isEmpty() || password != confirmPassword)
        )
        if (isError && (password.isEmpty() || password != confirmPassword)) {
            Text(text = "Password cannot be empty or does not match confirmation")
        }
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirm Password") },
            visualTransformation = PasswordVisualTransformation(),
            isError = isError && password != confirmPassword
        )
        if (isError && password != confirmPassword) {
            Text(text = "Passwords do not match")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                isError = username.isEmpty() || password.isEmpty() || password != confirmPassword
                if (!isError) {
                    onSignup(username, password)
                }
            }
        ) {
            Text(text = "Sign Up")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview() {
        Signupsc(onSignup = { String })

}