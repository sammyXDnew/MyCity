package com.example.mycity.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycity.R
import com.example.mycity.data.Place

@Composable
fun PlaceDetailScreen(
    place: Place?,
    emptyMessage: String,
    modifier: Modifier = Modifier
) {
    if (place == null) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = emptyMessage,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
        return
    }

    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        PlaceImage(
            place = place,
            emojiSize = 72.sp,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Text(text = place.name, style = MaterialTheme.typography.headlineMedium)
        Text(
            text = "📍 ${place.location}",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.primary
        )
        Text(text = place.description, style = MaterialTheme.typography.bodyLarge)
    }
}

/** Dipakai layar kompak: pesan kosong = tempat tidak ditemukan. */
@Composable
fun CompactPlaceDetail(place: Place?, modifier: Modifier = Modifier) {
    PlaceDetailScreen(
        place = place,
        emptyMessage = stringResource(R.string.place_not_found),
        modifier = modifier
    )
}
