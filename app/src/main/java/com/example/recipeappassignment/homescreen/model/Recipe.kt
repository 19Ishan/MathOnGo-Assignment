package com.example.recipeappassignment.homescreen.model

data class Recipe(
    val aggregateLikes: Int,
    val cheap: Boolean,
    val cookingMinutes: Any,
    val creditsText: String,
    val dairyFree: Boolean,
    val extendedIngredients: List<ExtendedIngredient>,
    val gaps: String,
    val glutenFree: Boolean,
    val healthScore: Int,
    val license: String,
    val lowFodmap: Boolean,
    val preparationMinutes: Any,
    val pricePerServing: Double,
    val sourceName: String,
    val sustainable: Boolean,
    val vegan: Boolean,
    val vegetarian: Boolean,
    val veryHealthy: Boolean,
    val veryPopular: Boolean,
    val weightWatcherSmartPoints: Int
)