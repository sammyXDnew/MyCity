package com.example.mycity.ui

import com.example.mycity.data.CityCategory
import com.example.mycity.data.LocalPlacesDataProvider
import com.example.mycity.data.Place

data class CityUiState(
    val categories: List<CityCategory> = CityCategory.entries,
    val currentCategory: CityCategory = CityCategory.WISATA_ALAM,
    val currentPlace: Place? = null
) {
    /** Daftar tempat untuk kategori yang sedang dipilih. */
    val places: List<Place>
        get() = LocalPlacesDataProvider.getPlacesByCategory(currentCategory)
}
