package com.example.movieappjc.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(64.dp)
            .background(
                color = Color(0xFF1F1F1F),        // dark background
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
            )
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier.size(36.dp, 36.dp)
            .background(color = Color.White,
                shape = CircleShape,)
        ){
            IconButton(onClick = { /* TODO: Home */ }) {
                Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.Black)
            }
        }
        IconButton(onClick = { /* TODO: Search */ }) {
            Icon(Icons.Default.PlayArrow, contentDescription = "Search", tint = Color.White)
        }
        IconButton(onClick = { /* TODO: Favorites */ }) {
            Icon(Icons.Default.Favorite, contentDescription = "Favorites", tint = Color.White)
        }
        IconButton(onClick = { /* TODO: Profile */ }) {
            Icon(Icons.Default.Person, contentDescription = "Profile", tint = Color.White)
        }
    }
}


