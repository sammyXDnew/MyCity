package com.example.mycity.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mycity.R

/** Tujuan di NavHost (layar kompak & medium). */
enum class MyCityScreen { Categories, Places, Detail }

@Composable
fun MyCityApp(
    windowWidth: WindowWidthSizeClass,
    viewModel: CityViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    if (windowWidth == WindowWidthSizeClass.Expanded) {
        ExpandedLayout(uiState = uiState, viewModel = viewModel)
    } else {
        NavigationLayout(uiState = uiState, viewModel = viewModel)
    }
}

/** HP (Compact) dan tablet portrait (Medium): satu layar per langkah, dengan Navigation. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun NavigationLayout(uiState: CityUiState, viewModel: CityViewModel) {
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val route = backStackEntry?.destination?.route ?: MyCityScreen.Categories.name
    val appName = stringResource(R.string.app_name)

    val title = when (route) {
        MyCityScreen.Places.name -> uiState.currentCategory.title
        MyCityScreen.Detail.name -> uiState.currentPlace?.name ?: appName
        else -> appName
    }
    val canNavigateBack = navController.previousBackStackEntry != null

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(title) },
                navigationIcon = {
                    if (canNavigateBack) {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = stringResource(R.string.back)
                            )
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        // Di tablet (Medium) konten dibatasi lebarnya dan dipusatkan.
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.TopCenter
        ) {
            NavHost(
                navController = navController,
                startDestination = MyCityScreen.Categories.name,
                modifier = Modifier
                    .fillMaxHeight()
                    .widthIn(max = 640.dp)
            ) {
                composable(MyCityScreen.Categories.name) {
                    CategoryListScreen(
                        categories = uiState.categories,
                        selectedCategory = null,
                        onCategoryClick = { category ->
                            viewModel.updateCurrentCategory(category)
                            navController.navigate(MyCityScreen.Places.name)
                        }
                    )
                }
                composable(MyCityScreen.Places.name) {
                    PlaceListScreen(
                        places = uiState.places,
                        selectedPlace = null,
                        onPlaceClick = { place ->
                            viewModel.updateCurrentPlace(place)
                            navController.navigate(MyCityScreen.Detail.name)
                        }
                    )
                }
                composable(MyCityScreen.Detail.name) {
                    CompactPlaceDetail(place = uiState.currentPlace)
                }
            }
        }
    }
}

/** Tablet landscape / layar lebar (Expanded): tiga panel berdampingan. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ExpandedLayout(uiState: CityUiState, viewModel: CityViewModel) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text(stringResource(R.string.app_name)) })
        }
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            CategoryListScreen(
                categories = uiState.categories,
                selectedCategory = uiState.currentCategory,
                onCategoryClick = viewModel::updateCurrentCategory,
                modifier = Modifier.width(280.dp)
            )
            VerticalDivider()
            PlaceListScreen(
                places = uiState.places,
                selectedPlace = uiState.currentPlace,
                onPlaceClick = viewModel::updateCurrentPlace,
                modifier = Modifier.weight(1f)
            )
            VerticalDivider()
            PlaceDetailScreen(
                place = uiState.currentPlace,
                emptyMessage = stringResource(R.string.select_place_hint),
                modifier = Modifier.weight(1.3f)
            )
        }
    }
}
