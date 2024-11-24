import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorBlocksUI()
        }
    }
}

@Composable
fun ColorBlocksUI() {
    Column(
        modifier = Modifier
            .fillMaxSize() // Remplit tout l'espace de l'écran
    ) {
        // Bloc rouge occupant la moitié supérieure de l'écran
        Box(
            modifier = Modifier
                .fillMaxWidth() // Remplit toute la largeur
                .weight(1f) // Prend la moitié de l'espace vertical
                .background(Color.Red) // Couleur de fond rouge
        )

        // Deux blocs en dessous divisés également
        Row(
            modifier = Modifier
                .fillMaxWidth() // Remplit toute la largeur
                .weight(1f) // Prend la moitié de l'espace vertical
        ) {
            // Bloc bleu à gauche
            Box(
                modifier = Modifier
                    .weight(1f) // Prend la moitié de l'espace horizontal
                    .fillMaxHeight() // Prend toute la hauteur disponible
                    .background(Color.Blue) // Couleur de fond bleue
            )

            // Bloc vert à droite
            Box(
                modifier = Modifier
                    .weight(1f) // Prend la moitié de l'espace horizontal
                    .fillMaxHeight() // Prend toute la hauteur disponible
                    .background(Color.Green) // Couleur de fond verte
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewColorBlocksUI() {
    ColorBlocksUI()
}
