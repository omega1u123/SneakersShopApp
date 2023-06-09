package com.example.sneakersshopapp.secondScreenParts

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SizeBar(){
    Column() {
        Text(
            text = "Select Size"
        )
    }
}


@Preview
@Composable
fun SizeBarPreview(){
    SizeBar()
}