package com.example.project4.model

data class Category(
    val id: Int,
    val categoryName: String,
    val imageCate: Int,
    val recommendedPlaces: List<Place>
)
