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
import com.example.movieappjc.home.components.BottomNavBar
import com.example.movieappjc.home.HomeScreen2
import com.example.movieappjc.ui.theme.MovieAppJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieAppJCTheme {
                Scaffold(

                    bottomBar = { BottomNavBar(modifier = Modifier.navigationBarsPadding()) },
                    modifier = Modifier.fillMaxSize()) { innerPadding ->

                    HomeScreen2(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}