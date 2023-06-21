package com.example.sneakersshopapp.secondScreenParts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sneakersshopapp.R

@Composable
fun FooterReviews(){
    Column {
        Row(){
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
                )
            Column() {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Username")
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ratingspng),
                        contentDescription = null,
                        modifier = Modifier.height(15.dp)
                        )
                }

                Text(text = "Dqwdqwdwqdwqdwqdwqdqwd\ndjqhwlbdwqbbjsdhbvorv")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(){
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Column() {
                Row(verticalAlignment = Alignment.Top) {
                    Text(text = "Username")
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ratingspng),
                        contentDescription = null,
                        modifier = Modifier.height(15.dp)
                    )
                }

                Text(text = "Dqwdqwdwqdwqdwqdwqdqwd")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(){
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Column() {
                Row(verticalAlignment = Alignment.Top) {
                    Text(text = "Username")
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ratingspng),
                        contentDescription = null,
                        modifier = Modifier.height(15.dp)
                    )
                }

                Text(text = "Dqwdqwdwqdwqdwqdwqdqwd\nwqdoqwndwqd")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(){
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Column() {
                Row(verticalAlignment = Alignment.Top) {
                    Text(text = "Username")
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ratingspng),
                        contentDescription = null,
                        modifier = Modifier.height(15.dp)
                    )
                }

                Text(text = "Dqwdqw")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(){
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Column() {
                Row(verticalAlignment = Alignment.Top) {
                    Text(text = "Username")
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ratingspng),
                        contentDescription = null,
                        modifier = Modifier.height(15.dp)
                    )
                }

                Text(text = "Dqwdqwdwqdwqdwqdwqdqwd")
            }
        }
    }
}


@Preview
@Composable
fun FooterReviewsPreview(){
    FooterReviews()
}