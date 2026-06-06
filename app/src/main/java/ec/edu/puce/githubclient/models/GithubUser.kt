package ec.edu.puce.githubclient.models

import com.google.gson.annotations.SerializedName

/// cambio para commit


data class GithubUser(
    val id: String,
    val login: String,
    @SerializedName("avatar_url")
    val avatarUrl: String
)