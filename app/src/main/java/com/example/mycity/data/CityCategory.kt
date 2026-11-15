package com.example.mycity.data

/** Kategori rekomendasi di kota (Klaten). */
enum class CityCategory(
    val title: String,
    val subtitle: String,
    val emoji: String
) {
    WISATA_ALAM("Wisata Air & Alam", "Umbul, rawa, dan udara segar", "🏞️"),
    CANDI_BUDAYA("Candi & Budaya", "Warisan sejarah dan tradisi", "🛕"),
    KULINER_KERAJINAN("Kuliner & Kerajinan", "Oleh-oleh dan karya warga lokal", "🍴")
}
