package com.example.sneakersshopapp.secondScreenParts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sneakersshopapp.R

@Composable
fun SizeBar(){
    val sizes = listOf(
        R.drawable._39,
        R.drawable._40,
        R.drawable._41,
        R.drawable._42,
        R.drawable._43,
        R.drawable._43,
        R.drawable._43)
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Select Size",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow(){
            items(sizes.size){ index ->
                Image(
                    painter = painterResource(id = sizes[index]),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp)
                    )
                Spacer(modifier = Modifier.width(5.dp))
            }
        }
    }
}


@Preview
@Composable
fun SizeBarPreview(){
    SizeBar()
}