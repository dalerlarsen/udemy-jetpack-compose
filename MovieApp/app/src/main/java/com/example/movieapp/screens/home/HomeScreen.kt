package com.example.movieapp.screens.home

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.MovieRow
import com.example.movieapp.navigation.MovieScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Magenta, elevation = 5.dp) {
            Text(text = "Movies")
        }
    }) {
        MainContent(navController)
    }
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<String> = listOf(
        "Avatar",
        "300",
        "Harry Potter",
        "Harry Potter2",
        "Harry Potter3",
        "Harry Potter4",
        "Harry Potter5",
        "Harry Potter6",
        "Harry Potter7",
        "Harry Potter8",
        "Life"
    )
) {

    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it) { movie ->
//                    Log.d("TAG", "MainContent: $movie")
                    navController.navigate(route = MovieScreens.DetailsScreen.name + "/$movie")
                }
            }
        }

    }

}
