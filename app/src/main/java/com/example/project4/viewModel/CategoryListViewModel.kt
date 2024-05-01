package com.example.project4.viewModel

import androidx.lifecycle.ViewModel
import com.example.project4.data.MyCityData
import com.example.project4.model.Category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
//
//class CategoryListViewModel() : ViewModel(){
//    private val _uiState = MutableStateFlow(
//        CategoriesUiState(
//            cateList = MyCityData.getData(),
//            currentCate = MyCityData.getData().getOrElse(0) {
//                MyCityData.defaultCategory
//            }
//        )
//    )
//    val uiState: StateFlow<CategoriesUiState> = _uiState
//
//    fun updateCurrentCate(selectedCategory: Category) {
//        _uiState.update {
//            it.copy(currentCate = selectedCategory)
//        }
//    }
//
//    fun navigateToListPage() {
//        _uiState.update {
//            it.copy(isShowingListPage = true)
//        }
//    }
//
//
//    fun navigateToDetailPage() {
//        _uiState.update {
//            it.copy(isShowingListPage = false)
//        }
//    }
//
//}
//
//data class CategoriesUiState(
//    val cateList: List<Category> = emptyList(),
//    val currentCate: Category = MyCityData.defaultCategory,
//    val isShowingListPage: Boolean = true
//)