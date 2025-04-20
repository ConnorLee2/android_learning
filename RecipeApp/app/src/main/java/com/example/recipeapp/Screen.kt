package com.example.recipeapp

sealed class Screen(val route:String) {
    data object RecipeScreen: Screen(route = "recipeScreen")
    data object DetailScreen: Screen(route = "detailScreen")
}