package com.example.doctoraspects

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        BasicTextField(
            value = searchText,
            onValueChange = { searchText = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.LightGray, shape = MaterialTheme.shapes.small),
            decorationBox = { innerTextField ->
                if (searchText.isEmpty()) Text("Search products..", color = Color.Gray)
                innerTextField()
            }
        )
    }
}

@Composable
fun MenuGrid() {
    val items = listOf(
        "BAKLAVA", "Iftar Platter", "Sunday Saver's", "Breakfast B2G1",
        "Cake Offer B3G1", "Biscoff Cheesecake", "Cakes", "Breakfast & Brunch"
    )

    LazyVerticalGrid(columns = GridCells.Fixed(2), contentPadding = PaddingValues(8.dp)) {
        items(items.size) { index ->
            MenuItem(name = items[index])
        }
    }
}

@Composable
fun MenuItem(name: String) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = android.R.drawable.ic_menu_gallery),
                contentDescription = name,
                modifier = Modifier.size(120.dp)
            )
            Text(name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Yogis() {
    MenuItem("Sudip")
}
