package com.example.androidui3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AndroidUI3(){
    Column (modifier = Modifier.fillMaxSize().padding(8.dp)){
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Outlined.AccountCircle, contentDescription = "",
                modifier = Modifier.size(200.dp),
                tint = Color(0xFFFFB6C1)
            )
        }
        Column(modifier = Modifier.fillMaxWidth().padding(8.dp).background(Color(0xFFFDEBFF)),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center) {
            Text("Accessibility", fontSize = 24.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(8.dp))

            Text("The latest news on accessibility features and services, helping you to improve your app's usability, particularly for users with disabilities.", fontSize = 16.sp, fontWeight = FontWeight.Normal)
        }

    }

}