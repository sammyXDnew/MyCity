package com.example.mycity.data

/** Satu tempat/rekomendasi. Foto diambil dari res/drawable lewat imageName; emoji dipakai bila foto belum ada. */
data class Place(
    val id: Int,
    val name: String,
    val location: String,
    val description: String,
    val category: CityCategory,
    val emoji: String,
    /** Nama file foto di res/drawable tanpa ekstensi, mis. umbul_ponggok. Kosong/tidak ada = pakai emoji. */
    val imageName: String
)
