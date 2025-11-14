package cintiaangelo.com.github.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ImcScreen(navController: NavHostController) {
    var nome by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Cálculo de IMC", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Seu nome") }
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = peso,
                onValueChange = { peso = it },
                label = { Text("Peso (kg)") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = altura,
                onValueChange = { altura = it },
                label = { Text("Altura (m)") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                val p = peso.toFloatOrNull()
                val a = altura.toFloatOrNull()

                if (p != null && a != null && a > 0) {
                    val imc = p / (a * a)
                    resultado = "Olá $nome, seu IMC é %.2f".format(imc)
                } else {
                    resultado = "Valores inválidos"
                }
            }) {
                Text("Calcular IMC")
            }

            Spacer(modifier = Modifier.height(15.dp))

            if (resultado.isNotEmpty()) {
                Text(resultado)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { navController.navigate("menu") }) {
                Text("Voltar ao Menu")
            }
        }
    }
}
