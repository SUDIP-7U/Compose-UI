package com.example.doctoraspects

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun WhatsAppCloneApp() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {

        },
        bottomBar = { BottomNavigationBar(navController) }

    ) { innerPadding ->
        NavHost(
            navController, startDestination = "chats",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("chats") { ChatListScreen() }
            composable("calls") { CallsScreen() }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar(
        containerColor = Color.Magenta
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Filled.CheckCircle, contentDescription = "Chats") },
            label = { Text("Chats") },
            selected = false,
            onClick = { navController.navigate("chats") }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Call, contentDescription = "Calls") },
            label = { Text("Calls") },
            selected = false,
            onClick = { navController.navigate("calls") }
        )
    }
}

@Composable
fun ChatListScreen() {
    Box(modifier = Modifier.background(Color.Blue)
        .fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Chat List", fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun CallsScreen() {
    Box(modifier = Modifier.background(Color.Green)
        .fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Text(text = "Calls", fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}

