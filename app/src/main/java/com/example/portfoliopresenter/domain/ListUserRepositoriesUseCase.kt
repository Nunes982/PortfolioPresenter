package com.example.portfoliopresenter.domain

import com.example.portfoliopresenter.core.UseCase
import com.example.portfoliopresenter.data.model.Repo
import com.example.portfoliopresenter.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}

