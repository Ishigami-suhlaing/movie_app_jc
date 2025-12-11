package com.example.movieappjc.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.movieappjc.model.MovieData

@Composable
fun CustomMovieListView(movieItem: List<MovieData>){
    LazyColumn() {
        items(movieItem){
            MovieItemView(it)
        }


    }
}