package com.homenurturing.entertainmentex.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.homenurturing.entertainmentex.R
import com.homenurturing.entertainmentex.ui.theme.EntertainmentEXTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreen(navigateHome: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(2000) // Simulate splash screen duration (2 seconds)
        navigateHome()
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Add your splash screen logo or image here
        Image(
            painter = painterResource(id = R.drawable.jjk1), // Replace with your image resource
            contentDescription = "App Logo"
        )
    }
}


@Composable
fun MySplash(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

    }

}

@Preview(showBackground = true)
@Composable
fun SplashPreview(){
    EntertainmentEXTheme {
        MySplash()
    }

}
