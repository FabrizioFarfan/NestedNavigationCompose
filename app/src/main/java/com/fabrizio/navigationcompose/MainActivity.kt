package com.fabrizio.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fabrizio.navigationcompose.navigation.SetupNavGraph
import com.fabrizio.navigationcompose.ui.theme.NavigationComposeTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationComposeTheme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}