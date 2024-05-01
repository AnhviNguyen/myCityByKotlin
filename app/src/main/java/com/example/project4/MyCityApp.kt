package com.example.project4

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.project4.data.MyCityData
import com.example.project4.ui.screens.CategoriesListScreen
import com.example.project4.ui.screens.PlaceDetailScreen
import com.example.project4.ui.screens.RecomendenPlaceListScreen
import com.example.project4.utils.MyCityContentType


@Composable
fun navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MyCityContentType.ListCategories.route ){
        composable(route = MyCityContentType.ListCategories.route){
            CategoriesListScreen(
                categories = MyCityData.getData(),
                navController = navController,
            )
        }

        composable(
            route = MyCityContentType.ListRecomendedPlaces.route + "/{idCate}",
            arguments = listOf(
                navArgument("idCate"){
                    type = NavType.IntType
                }
            )
            ){entry ->
                RecomendenPlaceListScreen(
                    idCate = entry.arguments?.getInt("idCate"), navController = navController , allPlaces = MyCityData.getPlaces()) {
            }
        }

        composable(
            route = MyCityContentType.RecomendedPlacesDetail.route + "/{idPlace}",
            arguments = listOf(
                navArgument("idPlace"){
                    type = NavType.IntType
                }
            )
        ){entry ->
                PlaceDetailScreen(idPlace = entry.arguments?.getInt("idPlace"), navController =navController) {
            }
        }
    }
}


