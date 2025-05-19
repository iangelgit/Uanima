import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Navbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center, // ⬅️ centra los elementos
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Inicio",
            modifier = Modifier
                .clickable { /* Acción botón Inicio */ }
                .padding(end = 32.dp)
        )
        Text(
            text = "Configuración",
            modifier = Modifier.clickable { /* Acción botón Configuración */ }
        )
    }
}
