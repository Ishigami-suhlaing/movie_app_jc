package com.example.movieappjc.home.components

import android.media.Rating
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Rating(){
    Row() {
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Play",
            tint = Color(0xfffcdf03),
            modifier = Modifier.size(20.dp)
        )
        Spacer(Modifier.padding(2.dp))
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Play",
            tint = Color(0xfffcdf03),
            modifier = Modifier.size(20.dp)
        )
        Spacer(Modifier.padding(2.dp))
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Play",
            tint = Color(0xfffcdf03),
            modifier = Modifier.size(20.dp)
        )
        Spacer(Modifier.padding(2.dp))
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Play",
            tint = Color(0xfffcdf03),
            modifier = Modifier.size(20.dp)
        )
        Spacer(Modifier.padding(2.dp))
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Play",
            tint = Color.Black,
            modifier = Modifier.size(20.dp)
        )

    }
}