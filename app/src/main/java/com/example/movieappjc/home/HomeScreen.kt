package com.example.movieappjc.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieappjc.R
import com.example.movieappjc.home.components.Greeting
import com.example.movieappjc.home.components.Menu
import com.example.movieappjc.home.components.NewCard
import com.example.movieappjc.home.components.RecommendCard
import com.example.movieappjc.home.components.SearchBar
import com.example.movieappjc.model.NewMovieData
import com.example.movieappjc.model.RecommendMovieData


private val recommendMovieData = listOf<RecommendMovieData>(
    RecommendMovieData("Attack on Titan", "Description 1", R.drawable.attack_on_titan),
    RecommendMovieData("Suzume", "Description 2", R.drawable.suzume),
    RecommendMovieData("Akatsuki", "Description 3", R.drawable.naruto)
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
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    val scrollState = rememberScrollState()

    Column(

        modifier = modifier.fillMaxSize().padding(vertical = 8.dp, horizontal = 8.dp).verticalScroll(scrollState)
    ) {

        Greeting(modifier = Modifier)
        Spacer(modifier = Modifier.height(8.dp))

        SearchBar(modifier = Modifier)
        Spacer(modifier = Modifier.height(8.dp))

        Menu(modifier = Modifier)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Ongoing Series", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(8.dp))

        RecommendCard(recommendMovieData)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Christmas Choices", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(8.dp))
        NewCard(newMovieData)

    }
}