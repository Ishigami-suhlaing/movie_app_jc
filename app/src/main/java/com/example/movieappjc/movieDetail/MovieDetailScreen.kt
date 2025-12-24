package com.example.movieappjc.movieDetail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movieappjc.api.MovieMemoryStore

@Composable
fun MovieDetailScreen() {
    val movie = MovieMemoryStore.selectedMovie

    if (movie == null) {
        Text("No movie selected")
        return
    }

    Column(

    ) {
        Text(movie.title)
        Text(movie.description)
    }
}
