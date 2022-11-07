package com.fabrizio.navigationcompose.navigation

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.fabrizio.DetailScreen
import com.fabrizio.navigationcompose.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    // Nested Navigation
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route
            )
        {
            DetailScreen(navController = navController)
        }
    }
}