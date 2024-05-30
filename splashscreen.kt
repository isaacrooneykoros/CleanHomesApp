package com.example.Sema.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Sema.R
import com.example.Sema.navigation.ROUT_DASHBOARD
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun Image(imageVector: Int, contentDescription: String, modifier: Modifier) {

}

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

        ) {

        val coroutine = rememberCoroutineScope()
        coroutine.launch{
            delay(2000)
            navController.navigate(ROUT_DASHBOARD)
        }

        Image(imageVector = R.drawable.welcomeback ,
            contentDescription ="welcome",
            modifier =Modifier.size(200.dp)
        )

        Text(
            text ="Welcome To Clean Home Services ",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start =30.dp ,end=30.dp)

        )

    }

}

fun Image(imageVector: Int, contentDescription: String) {

}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}