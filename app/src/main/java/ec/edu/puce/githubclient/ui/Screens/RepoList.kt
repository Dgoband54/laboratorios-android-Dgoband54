package ec.edu.puce.githubclient.ui.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ec.edu.puce.githubclient.ui.components.RepoItem

@Composable
fun RepoList(
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
    ){
        RepoItem(
            name = "Repositorio de Android",
            description = "repo creado con Kotlin para desarrollo movil",
            avatarUrl = "https://www.carteldeportivo.com/wp-content/uploads/2025/03/Canelo_Alvarez_-1.jpeg",
            language = "Kotlin"
        )

        RepoItem(
            name = "Repositorio de Django",
            description = "repo creado con Kotlin para desarrollo movil",
            avatarUrl = "https://media.eleditormendoza.com.ar/p/de37b65a018cdf48848e010906984521/adjuntos/372/imagenes/100/082/0100082808/mayweather-floyd.jpeg",
            language = "Kotlin"
        )

        RepoItem(

            name = "Repositorio de React",
            description = "repo creado con Kotlin para desarrollo movil",
            avatarUrl = "https://www.boxinginsider.com/wp-content/uploads/2022/12/Fj3n5rlUUAERj-R.jpg.webp",
            language = "Kotlin"
        )

    }

}

