package com.example.movieappjc.home.components

import androidx.compose.runtime.Composable
import com.example.movieappjc.model.RecommendMovieData
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items

@Composable
fun RecommendCard(recommendMovieItems: List<RecommendMovieData>){
    LazyRow() {
        items(
            recommendMovieItems
        ){
            RecommendCardView(it)
        }
    }

}
