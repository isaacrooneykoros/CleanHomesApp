package com.homenurturing.entertainmentex.ui.theme.screens.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomePage() {
    // Your home page content here
    Text(text = "Welcome to the Home Page!")
}

@Composable
@Preview(showBackground = true)
fun HomePagePreview() {
    HomePage()
}