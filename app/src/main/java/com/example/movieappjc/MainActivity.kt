package com.example.movieappjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.movieappjc.api.ApiCardTestPageView
import com.example.movieappjc.api.ApiTestPage
import com.example.movieappjc.home.components.BottomNavBar
import com.example.movieappjc.home.HomeScreen
import com.example.movieappjc.ui.theme.MovieAppJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieAppJCTheme {
                Scaffold(

                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    ApiTestPage(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

