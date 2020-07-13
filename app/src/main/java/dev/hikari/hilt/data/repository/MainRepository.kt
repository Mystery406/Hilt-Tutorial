package dev.hikari.hilt.data.repository

import dev.hikari.hilt.data.api.ApiHelper
import dev.hikari.hilt.data.model.User
import retrofit2.Response
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers(): Response<List<User>> = apiHelper.getUsers()

}