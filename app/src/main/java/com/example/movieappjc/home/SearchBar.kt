package com.example.movieappjc.home


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    placeholderText: String = "Search here"
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(52.dp)
            .background(
                color = Color.LightGray,            // soft, modern grey
                shape = RoundedCornerShape(30.dp)     // highly rounded edges
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(12.dp))

        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = null,
            tint  = Color(0xFF8A8A8E),
            )                 // modern subtle grey


        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = placeholderText,
            color = Color(0xFF8A8A8E),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

