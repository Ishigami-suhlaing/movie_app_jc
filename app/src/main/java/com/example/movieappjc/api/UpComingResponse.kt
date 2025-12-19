package com.example.movieappjc.api

import kotlinx.serialization.Serializable

@Serializable
data class UpComingResponse (
    val results: List<PopularApiMovieData>

)