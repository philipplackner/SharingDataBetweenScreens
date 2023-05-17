package com.plcoding.sharingdataprep.content

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.plcoding.sharingdataprep.content.util.PersistentViewModel1
import com.plcoding.sharingdataprep.content.util.PersistentViewModel2

@Composable
fun PersistentStorageSample() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "screen1"
    ) {
        composable("screen1") {
            val viewModel = hiltViewModel<PersistentViewModel1>()

            LaunchedEffect(Unit) {
                println("Session: ${viewModel.session}")
            }

            Screen1(
                onNavigateToScreen2 = {
                    viewModel.saveSession()
                    navController.navigate("screen2")
                }
            )
        }
        composable(
            route = "screen2"
        ) {
            val viewModel = hiltViewModel<PersistentViewModel2>()

            LaunchedEffect(Unit) {
                println("Session: ${viewModel.session}")
            }

            Screen2()
        }
    }
}

@Composable
private fun Screen1(
    onNavigateToScreen2: () -> Unit
) {
    Button(onClick = {
        onNavigateToScreen2()
    }) {
        Text(text = "Go to next screen")
    }
}

@Composable
private fun Screen2() {
    Text(text = "Hello world")
}