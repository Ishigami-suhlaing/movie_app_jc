package com.example.movieappjc.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class NetworkClient {
    private val client = HttpClient() {
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                    prettyPrint = true
                }
            )


        }
        install(Logging) {
            level = LogLevel.BODY
        }
    }


    suspend fun fetchPopularMovies(): PopularMovieResponse{
        val response: HttpResponse = client.get("https://api.themoviedb.org/3/movie/popular?language=en-US&page=1"){
            parameter("language","en-US")
            parameter("page",1)
            header(HttpHeaders.Accept,"application/json")

            header(HttpHeaders.Authorization,"Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1MzM3MTZkN2MyYTUyYzE4MzcwMjgwZjZjZDgwOWZkYyIsIm5iZiI6MTc2NTcxNzk3MC4wMzUsInN1YiI6IjY5M2ViN2QyYTA2MTg5OTE4MmY3ODdmNiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.aeTXrzoPFOlnovQD3pHzWjlGN0X0cqAAdjeepvccsIc")
        }
        return response.body()
    }

    suspend fun fetchUpComingMovies(): PopularMovieResponse{
        val response: HttpResponse = client.get("https://api.themoviedb.org/3/movie/upcoming?language=en-US&page=1"){
            parameter("language","en-US")
            parameter("page",1)
            header(HttpHeaders.Accept,"application/json")

            header(HttpHeaders.Authorization,"Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1MzM3MTZkN2MyYTUyYzE4MzcwMjgwZjZjZDgwOWZkYyIsIm5iZiI6MTc2NTcxNzk3MC4wMzUsInN1YiI6IjY5M2ViN2QyYTA2MTg5OTE4MmY3ODdmNiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.aeTXrzoPFOlnovQD3pHzWjlGN0X0cqAAdjeepvccsIc")
        }
        return response.body()
    }





}