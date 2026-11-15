package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.data.CityCategory
import com.example.mycity.data.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CityViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(CityUiState())
    val uiState: StateFlow<CityUiState> = _uiState.asStateFlow()

    fun updateCurrentCategory(category: CityCategory) {
        _uiState.update { it.copy(currentCategory = category, currentPlace = null) }
    }

    fun updateCurrentPlace(place: Place) {
        _uiState.update { it.copy(currentPlace = place) }
    }
}
