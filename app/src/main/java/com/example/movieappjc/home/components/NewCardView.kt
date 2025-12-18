package com.example.movieappjc.home.components

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
import com.example.movieappjc.model.NewMovieData

@Composable
fun NewCardView(
    newMovieData: NewMovieData,

){
    Box(modifier = Modifier.size(150.dp, 250.dp).padding(8.dp)
        .clip(RoundedCornerShape(12.dp))){
        Image(painter = painterResource(newMovieData.poster),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize())

    }
}