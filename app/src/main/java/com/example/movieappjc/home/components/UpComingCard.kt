package com.example.movieappjc.home.components

import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import com.example.movieappjc.api.UpComingApiMovieData

@Composable
fun UpComingCard(recommendMovieItems: List<UpComingApiMovieData>){
    LazyRow() {
        items(
            recommendMovieItems
        ){
            UpComingCardView(it)
        }
    }

}
