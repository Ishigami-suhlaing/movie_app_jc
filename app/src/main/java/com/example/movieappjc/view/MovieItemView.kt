package com.example.movieappjc.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.movieappjc.model.MovieData

@Composable
fun MovieItemView(movie: MovieData){
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)
            .background(Color.White)
    ) {

        Text(
            text = movie.title,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = movie.actor,
            color = Color.Black
        )
    }
}