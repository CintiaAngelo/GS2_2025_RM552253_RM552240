package cintiaangelo.com.github.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun EquipeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Equipe", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(20.dp))

            Text("Integrante 1: Cintia Cristina Braga Angelo 552253")
            Text("Integrante 2: Henrique Mosseri 552240")

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { navController.navigate("menu") }) {
                Text("Voltar ao Menu")
            }
        }
    }
}
