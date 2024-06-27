package com.example.recipeappassignment.homescreen.repository

import com.example.recipeappassignment.homescreen.model.PopularRecipes
import com.example.recipeappassignment.homescreen.service.IPopularRecipesService
import javax.inject.Inject

interface IPopularRecipesRepository {
    suspend fun getAllPopularRecipes(): String
}

class PopularRecipesRepository @Inject constructor(
    val service: IPopularRecipesService
) : IPopularRecipesRepository {
    override suspend fun getAllPopularRecipes(): String {
        return service.getAllPopularRecipes("a85719282e844b3fab4ef996a64ffb53")
    }
}