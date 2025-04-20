package com.example.recipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// www.themealdb.com/api/json/v1/1/categories.php

@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
): Parcelable

data class CategoriesResponse(
    val categories: List<Category>
)