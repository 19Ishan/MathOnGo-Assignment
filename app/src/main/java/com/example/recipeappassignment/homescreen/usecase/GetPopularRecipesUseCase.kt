package com.example.recipeappassignment.homescreen.usecase

import com.example.recipeappassignment.homescreen.model.PopularRecipes
import com.example.recipeappassignment.homescreen.repository.IPopularRecipesRepository
import javax.inject.Inject

interface IGetPopularRecipesUseCase {
    suspend operator fun invoke(): String
}

class GetPopularRecipesUseCase @Inject constructor(
    val repo: IPopularRecipesRepository
) : IGetPopularRecipesUseCase {
    override suspend fun invoke(): String {
        return repo.getAllPopularRecipes()
    }
}