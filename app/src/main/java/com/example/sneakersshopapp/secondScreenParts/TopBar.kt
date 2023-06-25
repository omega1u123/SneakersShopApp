package com.example.sneakersshopapp.secondScreenParts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sneakersshopapp.R


@Composable
fun TopBar(onClicked: () -> Unit){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
        ) {

        Button(
            onClick = { onClicked() },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(50.dp).height(30.dp),
            shape = RectangleShape,
            contentPadding = PaddingValues(0.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.hamburger__1_),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Text(
            text = "Running",
            fontSize = 35.sp
        )

        Image(
            painter = painterResource(id = R.drawable.cart2),
            contentDescription = null,
            modifier = Modifier.height(35.dp)
        )
    }
}


@Preview
@Composable
fun TopBarPreview(){
    TopBar({})
}
