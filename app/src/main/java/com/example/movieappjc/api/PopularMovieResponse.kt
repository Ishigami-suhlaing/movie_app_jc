package com.example.movieappjc.api

import kotlinx.serialization.Serializable

@Serializable
data class PopularMovieResponse(
    val results: List<PopularApiMovieData>
)