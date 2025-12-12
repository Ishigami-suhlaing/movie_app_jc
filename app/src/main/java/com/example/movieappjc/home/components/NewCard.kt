package com.example.movieappjc.home.components

import androidx.compose.runtime.Composable
import com.example.movieappjc.model.RecommendMovieData
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import com.example.movieappjc.model.NewMovieData

@Composable
fun NewCard(newMovieItems: List<NewMovieData>){
    LazyRow() {
        items(
            newMovieItems
        ){
            NewCardView(it)
        }
    }

}