package com.example.movieappjc.api

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ApiCardTestPageView(
    movieData: ApiMovieData,

    ) {
    Column(

    ) {

        Text(text = movieData.title)
        Text(text = movieData.description)
    }

}