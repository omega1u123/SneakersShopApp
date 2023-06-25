package com.example.sneakersshopapp.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun FirstScreen(onCLicked: () -> Unit){

    Row() {
        Text("First Screen")
        Button(onClick = { onCLicked() }) {

        }
    }
}

@Preview
@Composable
fun Prev(){
    FirstScreen({})
}