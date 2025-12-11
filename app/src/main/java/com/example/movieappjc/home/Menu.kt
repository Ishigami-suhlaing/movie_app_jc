package com.example.movieappjc.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlin.math.round

@Composable
fun Menu(modifier: Modifier = Modifier){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(width = 60.dp, height = 40.dp)
                .background(
                    color = Color.Black,
                    shape = RoundedCornerShape(12.dp) ,

                )
                .border(1.dp, Color.LightGray, shape = RoundedCornerShape(12.dp),

                ),
        ){
            Text(text = "All", textAlign = TextAlign.Center, color = Color.White )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(width = 100.dp, height = 40.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(12.dp) ,

                    )
                .border(1.dp, Color.LightGray, shape = RoundedCornerShape(12.dp),

                    ),
        ){
            Text(text = "New to you", textAlign = TextAlign.Center, )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(width = 80.dp, height = 40.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(12.dp) ,

                    )
                .border(1.dp, Color.LightGray, shape = RoundedCornerShape(12.dp),

                    ),
        ){
            Text(text = "Favourite", textAlign = TextAlign.Center, )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(width = 60.dp, height = 40.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(12.dp) ,

                    )
                .border(1.dp, Color.LightGray, shape = RoundedCornerShape(12.dp),

                    ),
        ){
            Text(text = "Funny", textAlign = TextAlign.Center, )
        }







    }}