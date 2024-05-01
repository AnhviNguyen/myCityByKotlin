package com.example.project4.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.project4.data.MyCityData
import com.example.project4.model.Place
import com.example.project4.utils.MyCityContentType

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlaceDetailScreen(
    idPlace: Int?,
    navController: NavController,
    function: () -> Unit,
) {
    val place: Place? = if (idPlace != null) {
        MyCityData.getPlaces().firstOrNull { it.id == idPlace }
    } else {
        null
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = MyCityContentType.RecomendedPlacesDetail.title) },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = null)
                    }
                }
            )
        }
    ) {
       Column(
           modifier = Modifier
               .fillMaxSize()
               .verticalScroll(rememberScrollState())
               .padding(horizontal = 16.dp, vertical = 16.dp)
       ) {
           if (place != null) {
               Image(
                   painter = rememberAsyncImagePainter(model = place.imageUrl),
                   contentDescription = null,
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(300.dp),
                   contentScale = ContentScale.FillWidth

               )
           }
           Spacer(modifier = Modifier.height(16.dp))
           if (place != null) {
               Text(
                   text = place.description,
                   style = MaterialTheme.typography.bodyLarge,
               )
           }
       }
    }
}
