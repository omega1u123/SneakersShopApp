package com.example.sneakersshopapp.firstScreenParts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Search(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MySearch()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MySearch(){
        val searchText = remember { mutableStateOf("") }
        val items = listOf("Item 1", "Item 2", "Item 3") // Здесь добавьте свои элементы или получите их из источника данных
        val filteredItems = items.filter { it.contains(searchText.value, ignoreCase = true) }

        Column {
            TextField(
                value = searchText.value,
                onValueChange = { value -> searchText.value = value },
                label = { Text(text = "Search...") }
            )
            LazyColumn {
                items(filteredItems) { item ->
                    Text(text = item)
                }
            }
        }
    }
