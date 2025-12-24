package com.example.movieappjc.movieDetail

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.movieappjc.R
import com.example.movieappjc.api.MovieMemoryStore

@Composable
fun MovieDetailScreen() {
    val scrollState = rememberScrollState()
    val movie = MovieMemoryStore.selectedMovie

    if (movie == null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("No movie selected")
        }
        return
    }

    val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
    val fullPosterUrl = IMAGE_BASE_URL + (movie.posterPath ?: "")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        // Poster Image
        AsyncImage(
            model = fullPosterUrl,
            contentDescription = movie.title,
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop,
            onError = {
                Log.e("ImageError", it.result.throwable.message ?: "Unknown error")
            },
            onSuccess = {
                Log.d("ImageSuccess", "Loaded successfully")
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Movie Title
        Text(
            text = movie.title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Movie Description
        Text(
            text = movie.description,
            fontSize = 16.sp
        )
    }
}

