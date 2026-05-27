package ec.edu.puce.githubclient.models

import com.google.gson.annotations.SerializedName

data class Repository(
    val id: Long,
    val name: String,
    val description: String?,
    val owner: Owner // Esto es necesario para la imagen
)

data class Owner(
    @SerializedName("avatar_url")
    val avatarUrl: String
)