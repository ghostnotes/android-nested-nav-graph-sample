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
fun NavGraphBuilder.loginGraph(navController: NavHostController) {
    navigation(startDestination = "LoginA", route = "Login") {
        composable(
            "LoginA",
        ) {
            LoginScreenA(navController)
        }
        composable(
            "LoginB",
        ) {
            LoginScreenB(navController)
        }
        composable(
            "LoginC",
        ) {
            LoginScreenC(navController)
        }

    }
}

@Composable
fun LoginScreenA(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "LoginA")
        Button(onClick = { navController.navigate("LoginB") }) {
            Text(text = "NEXT")
        }
    }
}

@Composable
fun LoginScreenB(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "LoginB")
        Button(onClick = { navController.navigate("LoginC") }) {
            Text(text = "NEXT")
        }
    }
}

@Composable
fun LoginScreenC(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "LoginC")
        Button(onClick = { navController.navigate("Main") }) {
            Text(text = "NEXT")
        }
    }
}