package com.example.movieappjc.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieappjc.R

@Composable
fun Greeting(modifier: Modifier){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(text = "Su! It's chill time....", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        Image(painter = painterResource(R.drawable.composeimg),
            modifier = Modifier.size(36.dp, 36.dp)
                .clip(CircleShape),
            contentDescription = null,
            contentScale = ContentScale.Crop
            )

    }
}