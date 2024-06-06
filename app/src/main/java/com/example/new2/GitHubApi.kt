package com.example.new2

import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubApi {
    @GET("search/repositories")
    suspend fun searchRepositories(@Query("q") query: String): RepoResponse
}
