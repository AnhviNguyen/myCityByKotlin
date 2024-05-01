package com.example.project4.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import coil.compose.rememberAsyncImagePainter
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.project4.model.Place
import com.example.project4.utils.MyCityContentType

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecomendenPlaceListScreen(
    idCate: Int?,
    navController: NavController,
    allPlaces: List<Place>,
    function: () -> Unit,
) {
    val filteredPlaces = if (idCate != null) {
        allPlaces.filter { place -> place.idCategory == idCate }
    } else {
        allPlaces
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = MyCityContentType.ListRecomendedPlaces.title,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = null)
                    }
                }
            )
        },
    ) {
        paddingValues ->
        if (filteredPlaces.isNotEmpty()) {
            LazyColumn(
                modifier = Modifier
                    .padding(paddingValues),
            ) {
                items(filteredPlaces) { place ->
                    RecommendedPlaceListItem(place, navController = navController)
                }
            }
        } else {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "No places found for this category.")
            }
        }
    }
}

@Composable
fun RecommendedPlaceListItem(
    place: Place,
    navController: NavController,
) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp)
        .clickable {
            navController.navigate("${MyCityContentType.RecomendedPlacesDetail.route}/${place.id}")
        }) {
        Image(
            painter = rememberAsyncImagePainter(model = place.imageUrl),
            contentDescription = null,
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Inside
        )
        Spacer(Modifier.width(20.dp))
        Text(place.name)
    }
}








