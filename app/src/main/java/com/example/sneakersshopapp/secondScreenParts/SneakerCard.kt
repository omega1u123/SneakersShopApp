package com.example.sneakersshopapp.secondScreenParts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sneakersshopapp.R

@Composable
fun SneakerCard(){
   Column() {
       Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
           Image(
               painter = painterResource(id = R.drawable.nike_logo),
               contentDescription = null,
               modifier = Modifier.height(50.dp)

           )

           Image(
               painter = painterResource(id = R.drawable.favorite),
               contentDescription = null,
               modifier = Modifier.height(40.dp)

           )
       }

           Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Center) {

               Image(painter = painterResource(id = R.drawable.nike_air_max_main),
                   contentDescription = null,
                    modifier = Modifier.size(350.dp)
                   )
           }
    }


}

@Preview
@Composable
fun SneakerCardPreview(){
    SneakerCard()
}