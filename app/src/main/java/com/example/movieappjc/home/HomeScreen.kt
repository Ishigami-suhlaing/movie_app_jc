package com.example.movieappjc.home

import androidx.compose.runtime.Composable
import com.example.movieappjc.model.MovieData
import com.example.movieappjc.view.CustomMovieListView

val movieItems = listOf<MovieData>(
        MovieData(title = "Title1", actor = "Mg Mg1"),
        MovieData(title = "Title2", actor = "Mg Mg2"),
        MovieData(title = "Title3", actor = "Mg Mg3"),
        MovieData(title = "Title4", actor = "Mg Mg4"),
        MovieData(title = "Title5", actor = "Mg Mg5"),
        MovieData(title = "Title6", actor = "Mg Mg6"),
        MovieData(title = "Title7", actor = "Mg Mg7"),
        MovieData(title = "Title8", actor = "Mg Mg8"),
        MovieData(title = "Title9", actor = "Mg Mg9"),
        MovieData(title = "Title10", actor = "Mg Mg10"),
    )

@Composable
fun HomeScreen(
) {
    CustomMovieListView(movieItems)
}