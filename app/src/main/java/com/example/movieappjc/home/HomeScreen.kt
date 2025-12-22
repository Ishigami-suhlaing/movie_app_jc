package com.example.movieappjc.home

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movieappjc.R
import com.example.movieappjc.api.NetworkClient
import com.example.movieappjc.api.PopularApiMovieData
import com.example.movieappjc.home.components.Greeting
import com.example.movieappjc.home.components.Menu
import com.example.movieappjc.home.components.PopularCard
import com.example.movieappjc.home.components.UpComingCard
import com.example.movieappjc.home.components.SearchBar
import com.example.movieappjc.model.NewMovieData
import com.example.movieappjc.model.UpComingMovieFixedData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


private val upComingMovieFixedData = listOf<UpComingMovieFixedData>(
    UpComingMovieFixedData("Attack on Titan", "Description 1", R.drawable.attack_on_titan),
    UpComingMovieFixedData("Suzume", "Description 2", R.drawable.suzume),
    UpComingMovieFixedData("Akatsuki", "Description 3", R.drawable.naruto)
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
    val popularMovies = remember { mutableStateListOf<PopularApiMovieData>() }
//    val upComingMovies = remember { mutableStateListOf<UpComingApiMovieData>() }
    val upComingMovies = upComingMovieFixedData
    val isLoading = remember{ mutableStateOf(true) }

    LaunchedEffect(Unit){
        withContext(Dispatchers.IO){
            try{
                isLoading.value = true
                popularMovies.clear()
                val popularMovieResponse = NetworkClient().fetchPopularMovies()

//                upComingMovies.clear()
//                val upComingMovieResponse = NetworkClient().fetchUpComingMovies()

                popularMovies.addAll(popularMovieResponse.results.map {
                    PopularApiMovieData(it.title,it.description,it.posterPath)
                })

//                upComingMovies.addAll(upComingMovieResponse.results.map {
//                    UpComingApiMovieData(it.title, it.description, it.posterPath)
//                })


                isLoading.value = false

            }catch (e: Exception){
                Log.e("API_DEBUG", "API failed", e)
            }
        }
    }


    if(isLoading.value){
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            CircularProgressIndicator()
        }
    }else{
        Column(

            modifier = modifier.fillMaxSize().padding(vertical = 8.dp, horizontal = 8.dp).verticalScroll(scrollState)
        ) {

            Greeting(modifier = Modifier)
            Spacer(modifier = Modifier.height(8.dp))

            SearchBar(modifier = Modifier)
            Spacer(modifier = Modifier.height(8.dp))

            Menu(modifier = Modifier)
            Spacer(modifier = Modifier.height(8.dp))

            UpComingCard(upComingMovies)
            Spacer(modifier = Modifier.height(8.dp))

            PopularCard(popularMovies)

        }
    }



}