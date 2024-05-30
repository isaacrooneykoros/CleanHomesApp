package com.example.Sema.ui.theme.screens.insert

import com.google.firebase.database.Exclude

data class Courses(
    @Exclude var courseID: String? = "",
    var courseName: String? = "",
    var courseDuration: String? = "",
    var courseDescription: String? = ""
)
