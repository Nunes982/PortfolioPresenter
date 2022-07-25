package com.example.portfoliopresenter.data.repositories

import com.example.portfoliopresenter.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}