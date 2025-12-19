package com.example.movieappjc.home.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.rememberAsyncImagePainter
import com.example.movieappjc.api.UpComingApiMovieData
import com.example.movieappjc.model.RecommendMovieData

@Composable
fun UpComingCardView(
    upComingMovieData: UpComingApiMovieData,
    modifier: Modifier = Modifier
) {


    Column(
        modifier.padding(horizontal = 8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.size(250.dp, 150.dp)
            .clip(RoundedCornerShape(12.dp))){
//            Image(painter = painterResource(upComingMovieData.posterPath.toInt()),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize())

            val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
            val fullPosterUrl = IMAGE_BASE_URL + upComingMovieData.posterPath


//            if(upComingMovieData.posterPath!!.isNotEmpty()){
//                Image(painter = rememberAsyncImagePainter(model = fullPosterUrl),
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxSize())
//                Log.d("PosterURL", fullPosterUrl)
//
//            }

            AsyncImage(
                model = fullPosterUrl,
                contentDescription = upComingMovieData.title,
                onError = {
                    Log.e("ImageError", it.result.throwable.message ?: "Unknown error")
                },
                onSuccess = {
                    Log.d("ImageSuccess", "Loaded successfully")
                }
            )


            IconButton(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(56.dp)
                    .background(Color.White.copy(alpha = 0.5f), shape = CircleShape)
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    tint = Color.Black,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
        Text(text = upComingMovieData.title)
        Rating()

    }
}

