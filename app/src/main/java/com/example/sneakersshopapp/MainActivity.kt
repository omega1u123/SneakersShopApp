package com.example.sneakersshopapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.sneakersshopapp.screens.FirstScreen
import com.example.sneakersshopapp.screens.SecondScreen
import com.example.sneakersshopapp.ui.theme.SneakersShopAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SneakersShopAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {
                    MyApp()
                }
            }
        }
    }
}


@Composable
fun MyApp(){
    var showFirstSreen by remember{
        mutableStateOf(true)
    }


    if (showFirstSreen){
        FirstScreen(onCLicked = { showFirstSreen = false })
    }else{
        SecondScreen(onClicked = {showFirstSreen = true})
    }


}






