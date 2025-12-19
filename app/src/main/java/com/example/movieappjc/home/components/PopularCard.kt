package com.example.movieappjc.home.components

import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import com.example.movieappjc.api.PopularApiMovieData
import com.example.movieappjc.model.NewMovieData

@Composable
fun PopularCard(popularMovieItems: List<PopularApiMovieData>){
    LazyRow() {
        items(
            popularMovieItems
        ){
            PopularCardView(it)
        }
    }

}