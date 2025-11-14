package cintiaangelo.com.github.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cintiaangelo.com.github.screens.EquipeScreen
import cintiaangelo.com.github.screens.ImcScreen
import cintiaangelo.com.github.screens.LoginScreen
import cintiaangelo.com.github.screens.MenuScreen


@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") { LoginScreen(navController) }
        composable("menu") { MenuScreen(navController) }
        composable("imc") { ImcScreen(navController) }
        composable("equipe") { EquipeScreen(navController) }
    }
}
