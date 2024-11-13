//package com.bibekgupta.cryptocurrencyapp.presentation
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import com.bibekgupta.cryptocurrencyapp.presentation.coin_detail.components.CoinDetailScreen
//import com.bibekgupta.cryptocurrencyapp.presentation.coin_list.components.CoinListScreen
//import com.bibekgupta.cryptocurrencyapp.ui.theme.CryptoCurrencyAppTheme
//import dagger.hilt.android.AndroidEntryPoint
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.rememberNavController
//import androidx.navigation.compose.composable
//
//@AndroidEntryPoint
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            CryptoCurrencyAppTheme {
//                Surface(
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    val navController = rememberNavController()
//
//                    NavHost(
//                        navController = navController,
//                        startDestination = Screen.CoinListScreen.route
//                    ){
//                        composable(
//                            route = Screen.CoinListScreen.route
//                        ){
//                            CoinListScreen(navController)
//                        }
//                        composable(
//                            route = Screen.CoinDetailScreen.route + "/{coinId}"
//                        ){
//                           CoinDetailScreen()
//                        }
//                    }
//
//                }
//            }
//        }
//    }
//}


package com.bibekgupta.cryptocurrencyapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import com.bibekgupta.cryptocurrencyapp.presentation.coin_detail.components.CoinDetailScreen
import com.bibekgupta.cryptocurrencyapp.presentation.coin_list.components.CoinListScreen
import com.bibekgupta.cryptocurrencyapp.ui.theme.CryptoCurrencyAppTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoCurrencyAppTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    Scaffold(
                        contentWindowInsets = androidx.compose.foundation.layout.WindowInsets.systemBars,
                        content = { paddingValues ->
                            NavHost(
                                navController = navController,
                                startDestination = Screen.CoinListScreen.route,
                                modifier = Modifier.padding(paddingValues)
                            ) {
                                composable(route = Screen.CoinListScreen.route) {
                                    CoinListScreen(navController)
                                }
                                composable(route = Screen.CoinDetailScreen.route + "/{coinId}") {
                                    CoinDetailScreen()
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}
