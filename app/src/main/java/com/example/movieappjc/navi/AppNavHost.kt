package com.example.movieappjc.navi



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movieappjc.home.HomeScreen
import com.example.movieappjc.LoginScreen

@Composable
fun AppNavHost(
    modifier: Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(navController = navController)
        }

        composable("home") {
            HomeScreen()
        }
    }
}
