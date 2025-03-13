package com.example.doctoraspects

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyApp() {
    var text by remember { mutableStateOf("AFROBEAT INSTRUMENTAL - DARLING") }
    var userInput by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = text,
            color = Color.Blue,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = userInput,
            onValueChange = { userInput = it },
            label = { Text("Enter text") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { text = userInput },
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("Update")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Sample Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
    }
}