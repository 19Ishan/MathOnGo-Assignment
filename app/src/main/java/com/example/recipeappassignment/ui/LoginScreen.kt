package com.example.recipeappassignment.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recipeappassignment.R
import com.example.recipeappassignment.ui.theme.LoginButton

@Composable
fun LoginScreen (
    navController: NavController
) {
    Box (modifier = Modifier.fillMaxSize()) {
        Image (
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Column (
            modifier = Modifier
//                .align(Alignment.BottomStart)
                .padding(start = 16.dp, top = 585.dp, end = 16.dp, bottom = 20.dp),
//                .padding(bottom = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
            ) {
            Text (
                text = "Welcome To",
                color = Color.White,
                fontStyle = FontStyle.Italic,
                fontSize = 50.sp
            )
            Text (
                text = "Recipe",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 60.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text (
                text = "Please sign with google",
                fontSize = 15.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(27.dp))
            Button (
                modifier = Modifier.width(380.dp).height(50.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    navController.navigate("home")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = LoginButton
                )
            ) {
                Icon (
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google Icon",
                    tint = Color.White,
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text (
                    text = "Continue with google",
                    color = Color.White
                )
            }
        }
    }
}