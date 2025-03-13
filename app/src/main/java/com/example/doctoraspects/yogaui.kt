package com.example.doctoraspects

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun YogaSettingsUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Swipe down to start practicing",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SettingItem("Type", "Vinyasa")
            SettingItem("Level", "Beginner 1")
            SettingItem("Voice", "Selama")
            SettingItem("Instruction", "Full")
            SettingItem("Boost", "None")
            SettingItem("Secondary Boost", "None")
            SettingItem("View Poses", "0 Liked, 0 Disliked")
            SettingItem("Transition Speed", "Default")
            SettingItem("Hold Lengths", "Auto")
            SettingItem("Warmup", "Normal")
            SettingItem("Cooldown", "Normal")
            SettingItem("Savasana", "2 Minutes")
            SettingItem("Style", "Alt Beats")
        }
    }
}

@Composable
fun SettingItem(title: String, value: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(Color.DarkGray)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = title, color = Color.White, fontWeight = FontWeight.Bold)
            Text(text = value, color = Color.LightGray)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Yes() {
    SettingItem("kala",   "500")
}
