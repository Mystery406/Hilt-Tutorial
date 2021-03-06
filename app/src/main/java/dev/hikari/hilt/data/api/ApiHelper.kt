package dev.hikari.hilt.data.api

import dev.hikari.hilt.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}