package com.example.movieappjc.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class PopularApiMovieData(
    val title: String,
    @SerialName("overview") val description: String,
    @SerialName("poster_path") val posterPath: String?
)
