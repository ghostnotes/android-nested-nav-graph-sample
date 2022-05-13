package co.ghostnotes.sample.nestednavgraph

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.mainGraph(navController: NavHostController) {
    navigation(startDestination = "MainA", route = "Main") {
        composable(
            "MainA",
        ) {
            MainScreenA(navController)
        }
        composable(
            "MainB",
        ) {
            MainScreenB(navController)
        }
        composable(
            "MainC",
        ) {
            MainScreenC(navController)
        }

    }
}

@Composable
fun MainScreenA(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "MainA")
        Button(onClick = { navController.navigate("MainB") }) {
            Text(text = "NEXT")
        }
    }
}

@Composable
fun MainScreenB(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "MainB")
        Button(onClick = { navController.navigate("MainC") }) {
            Text(text = "NEXT")
        }
    }
}

@Composable
fun MainScreenC(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "MainC")
        Button(onClick = { navController.navigate("Settings") }) {
            Text(text = "NEXT")
        }
    }
}