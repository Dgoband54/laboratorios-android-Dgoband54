package ec.edu.puce.githubclient.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage // Librería Coil para imágenes
import ec.edu.puce.githubclient.models.Repository

@Composable
fun RepoItem(repo: Repository) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Imagen del usuario (Avatar)
            AsyncImage(
                model = repo.owner.avatarUrl,
                contentDescription = "Avatar de ${repo.owner.avatarUrl}",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape), // La hace circular
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Información del repositorio
            Column {
                Text(
                    text = repo.name,
                    style = MaterialTheme.typography.titleMedium
                )
                repo.description?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodySmall,
                        maxLines = 2
                    )
                }
            }
        }
    }
}