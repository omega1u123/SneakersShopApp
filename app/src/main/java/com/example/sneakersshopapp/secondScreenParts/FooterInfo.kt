package com.example.sneakersshopapp.secondScreenParts


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sneakersshopapp.R

@Composable
fun FooterInfo(){

    var buttonColor1 by remember {
        mutableStateOf(Color.Black)
    }
    var buttonColor2 by remember {
        mutableStateOf(Color.Gray)
    }
    var buttonColor3 by remember {
        mutableStateOf(Color.Gray)
    }


    Column(modifier = Modifier.fillMaxWidth()) {
        Row() {
            Button(
                onClick = {
                        buttonColor1 = Color.Black
                        buttonColor2 = Color.Gray
                        buttonColor3 = Color.Gray
                          },
                colors = ButtonDefaults.buttonColors(Color.White),
                contentPadding = PaddingValues(10.dp)

            ) {
                Column() {
                    Text(
                        text = "DESCRIPTION",
                        color = buttonColor1,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    if (buttonColor1 == Color.Black ){
                        Image(painter = painterResource(id = R.drawable.active_border), contentDescription = null, modifier = Modifier.width(50.dp))
                    }
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {

                    buttonColor2 = Color.Black
                    buttonColor1 = Color.Gray
                    buttonColor3 = Color.Gray  },
                colors = ButtonDefaults.buttonColors(Color.White),
                contentPadding = PaddingValues(10.dp)

            ) {
                Column {
                    Text(
                        text = "DELIVERY",
                        color = buttonColor2,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    if (buttonColor2 == Color.Black ){
                        Image(painter = painterResource(id = R.drawable.active_border), contentDescription = null, modifier = Modifier.width(50.dp))
                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {
                    buttonColor3 = Color.Black
                    buttonColor1 = Color.Gray
                    buttonColor2 = Color.Gray },
                colors = ButtonDefaults.buttonColors(Color.White),
                contentPadding = PaddingValues(10.dp)

            ) {
                Column {
                    Text(
                        text = "REVIEWS",
                        color = buttonColor3,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    if (buttonColor3 == Color.Black ){
                        Image(painter = painterResource(id = R.drawable.active_border), contentDescription = null, modifier = Modifier.width(50.dp))
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        if(buttonColor1 == Color.Black && buttonColor2 == Color.Gray && buttonColor3 == Color.Gray){

            Text(text = stringResource(id = R.string.button1))

        }else if(buttonColor2 == Color.Black && buttonColor1 == Color.Gray && buttonColor3 == Color.Gray) {

            Text(text = "Coming soon....")

       }else if(buttonColor3 == Color.Black && buttonColor1 == Color.Gray && buttonColor2 == Color.Gray){

           // Text(text = "Coming soon....")
           FooterReviews()

       }
    }
}


@Preview
@Composable
fun FooterInfoPreview(){
    FooterInfo()
}

