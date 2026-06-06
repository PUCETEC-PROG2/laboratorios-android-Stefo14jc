package ec.edu.puce.githubclient.models


/// cambio para commit


data class Repository(
    val id: String,
    val name: String,
    val description: String?,
    val language: String?,
    val owner: GithubUser
)