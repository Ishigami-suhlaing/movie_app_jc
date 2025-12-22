package com.example.movieappjc.home.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieappjc.api.PopularApiMovieData
import com.example.movieappjc.model.NewMovieData

@Composable
fun PopularCard(popularMovieItems: List<PopularApiMovieData>){
    Text(text = "Christmas Choices", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
    Spacer(modifier = Modifier.height(8.dp))
    LazyRow() {
        items(
            popularMovieItems
        ){
            PopularCardView(it)
        }
    }

}