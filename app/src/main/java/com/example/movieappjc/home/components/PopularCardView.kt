package com.example.movieappjc.home.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.rememberAsyncImagePainter
import com.example.movieappjc.api.PopularApiMovieData
import com.example.movieappjc.model.NewMovieData

@Composable
fun PopularCardView(
    popularMovieData: PopularApiMovieData,

    ){
    val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
    val fullPosterUrl = IMAGE_BASE_URL + popularMovieData.posterPath
    Box(modifier = Modifier.size(150.dp, 250.dp).padding(8.dp)
        .clip(RoundedCornerShape(12.dp))){
//        if(popularMovieData.posterPath!!.isNotEmpty()){
//            Image(painter = rememberAsyncImagePainter(model = "https://image.tmdb.org/t/p/w500\$%PopularApiMovieData.posterPath%7D"),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize())
//
//      }
        AsyncImage(
            model = fullPosterUrl,
            contentDescription = popularMovieData.title,
            onError = {
                Log.e("ImageError", it.result.throwable.message ?: "Unknown error")
            },
            onSuccess = {
                Log.d("ImageSuccess", "Loaded successfully")
            }
        )
        }
}