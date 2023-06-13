package com.example.sneakersshopapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sneakersshopapp.secondScreenParts.Price
import com.example.sneakersshopapp.secondScreenParts.SizeBar
import com.example.sneakersshopapp.secondScreenParts.SneakerCard
import com.example.sneakersshopapp.secondScreenParts.TopBar


@Composable
fun SecondScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(20.dp))
        SneakerCard()
        Spacer(modifier = Modifier.height(20.dp))
        Price()
        Spacer(modifier = Modifier.height(20.dp))
        SizeBar()
    }
}

@Preview
@Composable
fun SecondScreenPreview(){
    SecondScreen()
}