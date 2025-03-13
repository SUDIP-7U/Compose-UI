package com.example.doctoraspects

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun Screen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Button(onClick = { }, colors = ButtonDefaults.buttonColors(Color.Black)) {
                    Text("\uD83C\uDF4E", color = Color.White)
                }
                Button(onClick = {  }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
                    Text("G", color = Color.Black)
                }
                Button(onClick = { }, colors = ButtonDefaults.buttonColors(Color.Blue)) {
                    Text("f", color = Color.Yellow)
                }
            }
            Text("or", color = Color.White)
            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Enter email address", color = Color.LightGray) },
                modifier = Modifier.fillMaxWidth(0.8f),
                singleLine = true,
            )
            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Enter password", color = Color.LightGray) },
                modifier = Modifier.fillMaxWidth(0.8f),
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
            )
            Button(onClick = { /* Log In */ }, modifier = Modifier.fillMaxWidth(0.8f), shape = RoundedCornerShape(50)) {
                Text("LOG IN")
            }
            TextButton(onClick = { /* Forgot Password */ }) {
                Text("Forgot Password?", color = Color.White)
            }
        }
    }
}

