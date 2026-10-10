package cl.duoc.fotomotion

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp

@Composable
fun FotoScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "FotoMotion",
            style = MaterialTheme.typography.headlineMedium
        )
        Button(
            onClick = { }
        ) {
            Text("Seleccionar fotografía")
        }
    }
}