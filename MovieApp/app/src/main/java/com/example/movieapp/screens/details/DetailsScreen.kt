package com.example.movieapp.screens.details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController, movieData: String?) {
    Scaffold(topBar = ) {
        
    }


//    Surface(
//        modifier = Modifier
//            .fillMaxHeight()
//            .fillMaxWidth()
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(text = movieData.toString(), style = MaterialTheme.typography.h5)
//            Spacer(modifier = Modifier.height(24.dp))
//            Button(onClick = {
//                navController.popBackStack()
//            }) {
//                Text(text = "Go Back")
//            }
//        }
    }
}