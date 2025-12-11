package com.example.movieappjc.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen2(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize().padding(vertical = 8.dp, horizontal = 8.dp)
    ) {

        Greeting(modifier = modifier)
        Spacer(modifier = Modifier.height(8.dp))
        SearchBar()
        Spacer(modifier = Modifier.height(8.dp))

        Menu()
        Spacer(modifier = Modifier.height(8.dp))


    }
}