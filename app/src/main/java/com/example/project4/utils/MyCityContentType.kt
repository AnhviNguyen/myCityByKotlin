package com.example.project4.utils

sealed class MyCityContentType(val title : String, val route: String) {
    object ListCategories: MyCityContentType (title = "My City", route = "list_cate")
    object ListRecomendedPlaces: MyCityContentType (title = "Categories", route = "list_place")
    object RecomendedPlacesDetail: MyCityContentType (title = "Recommended Place", route = "place_detail")

    fun withArg(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach {arg ->
                append("/$args")
            }
        }
    }
}