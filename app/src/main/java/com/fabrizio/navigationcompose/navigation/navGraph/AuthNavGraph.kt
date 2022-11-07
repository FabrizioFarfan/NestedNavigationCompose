package com.fabrizio.navigationcompose.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.fabrizio.LoginScreen
import com.fabrizio.navigationcompose.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {

    // Nested Navigation Graph
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE

    ){
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}