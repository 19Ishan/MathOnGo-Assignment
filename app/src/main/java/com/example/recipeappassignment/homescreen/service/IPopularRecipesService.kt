package com.example.recipeappassignment.homescreen.service

import com.example.recipeappassignment.homescreen.model.PopularRecipes
import retrofit2.http.GET
import retrofit2.http.Query


interface IPopularRecipesService {

    @GET("complexSearch")
    suspend fun getAllPopularRecipes(@Query("apiKey") apiKey: String): String

}

//https://api.spoonacular.com/recipes/random