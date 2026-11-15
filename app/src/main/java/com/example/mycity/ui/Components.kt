package com.example.mycity.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.mycity.data.Place
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Kotak berwarna berisi emoji; pengganti foto sementara. */
@Composable
fun EmojiBadge(
    emoji: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 28.sp
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.primaryContainer),
        contentAlignment = Alignment.Center
    ) {
        Text(text = emoji, fontSize = fontSize)
    }
}

/**
 * Menampilkan foto tempat dari res/drawable (nama file = place.imageName).
 * Jika file foto belum ada, otomatis memakai emoji sebagai cadangan.
 */
@Composable
fun PlaceImage(
    place: Place,
    modifier: Modifier = Modifier,
    emojiSize: TextUnit = 28.sp
) {
    val context = LocalContext.current
    val resId = remember(place.imageName) {
        context.resources.getIdentifier(place.imageName, "drawable", context.packageName)
    }
    if (resId != 0) {
        Image(
            painter = painterResource(resId),
            contentDescription = place.name,
            contentScale = ContentScale.Crop,
            modifier = modifier.clip(RoundedCornerShape(12.dp))
        )
    } else {
        EmojiBadge(emoji = place.emoji, modifier = modifier, fontSize = emojiSize)
    }
}
