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
fun NavGraphBuilder.settingsGraph(navController: NavHostController) {
    navigation(startDestination = "SettingsA", route = "Settings") {
        composable(
            "SettingsA",
        ) {
            SettingsScreenA(navController)
        }
        composable(
            "SettingsB",
        ) {
            SettingsScreenB(navController)
        }
        composable(
            "SettingsC",
        ) {
            SettingsScreenC(navController)
        }

    }
}

@Composable
fun SettingsScreenA(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "SettingsA")
        Button(onClick = { navController.navigate("SettingsB") }) {
            Text(text = "NEXT")
        }
    }
}

@Composable
fun SettingsScreenB(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "SettingsB")
        Button(onClick = { navController.navigate("SettingsC") }) {
            Text(text = "NEXT")
        }
    }
}

@Composable
fun SettingsScreenC(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "SettingsC")
        Text(text = "Last page.")
    }
}