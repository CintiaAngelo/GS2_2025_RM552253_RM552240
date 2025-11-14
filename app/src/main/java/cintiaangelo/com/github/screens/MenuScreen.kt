package cintiaangelo.com.github.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MenuScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Menu", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { navController.navigate("imc") }) {
                Text("Cálculo de IMC")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = { navController.navigate("equipe") }) {
                Text("Equipe")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { navController.navigate("login") }) {
                Text("Voltar ao Login")
            }
        }
    }
}
