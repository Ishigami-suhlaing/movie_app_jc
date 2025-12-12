package com.example.movieappjc.model

import com.example.movieappjc.R

data class NewMovieData(
    val title: String,
    val description: String,
    val poster: Int
)

private val newMovieData = listOf<NewMovieData>(
    NewMovieData("A fragrant Flower Bloms with Dignity", "Des1", R.drawable.a_fragrant_flower_bloms_with_dignity),
    NewMovieData("A Girl and Her Guard Dog", "Des2", R.drawable.a_girl_and_her_guard_dog),
    NewMovieData("A Star Brighter Than the Sun", "Des3", R.drawable.a_star_brighter_than_the_sun),
    NewMovieData("Anne Shirley", "Des4", R.drawable.anne_shirley),
    NewMovieData("Dark Gathering", "Des5", R.drawable.dart_gathering),
    NewMovieData("Honey Lemon Soda", "Des6", R.drawable.honey_lemon_soda),
    NewMovieData("Kimi Ni Todoke", "Des7", R.drawable.kimi_ni_todoke_from_me_to_you),
    NewMovieData("The Dinner Table Detective", "Des8", R.drawable.the_dinner_table_detective),
    NewMovieData("Tokopi Original Sin", "Des9", R.drawable.tokopi_original_sin),
    NewMovieData("Yano Kun's Ordinary Days", "Des10", R.drawable.yano_kun_ordinary_days))