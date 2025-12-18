package com.example.movieappjc.api

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


@Composable
fun ApiTestPage(modifier: Modifier = Modifier) {
    val popularMovies = remember { mutableStateListOf<ApiMovieData>() }

    LaunchedEffect(Unit){
        withContext(Dispatchers.IO){
            try{
                popularMovies.clear()
                val movieResponse = NetworkClient().fetchPopularMovies()
                popularMovies.clear()

                popularMovies.addAll(movieResponse.results.map {
                    ApiMovieData(it.title,it.description,it.posterPath)
                })


                Log.d("API_DEBUG", "Movies count: ${movieResponse.results.size}")


            }catch (e: Exception){
                Log.e("API_DEBUG", "API failed", e)
            }
        }
    }

    Box(modifier = modifier) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(popularMovies) { movie ->
                ApiCardTestPageView(movie)

            }
        }
    }
}



