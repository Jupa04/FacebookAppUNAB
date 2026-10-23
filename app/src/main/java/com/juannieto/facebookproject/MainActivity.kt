package com.juannieto.facebookproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.juannieto.facebookproject.ui.theme.FacebookProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FacebookProjectTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    val myNavController = rememberNavController()

                    NavHost(
                        navController = myNavController,
                        startDestination = "login",
                        modifier = Modifier.fillMaxSize(),
                    ) {
                        composable(route = "login") {
                            FacebookLoginScreen(myNavController)
                        }
                        composable(route = "register") {
                            FacebookRegisterScreen(myNavController)
                        }
                        composable(route = "feed") {
                            FeedScreen()
                        }
                    }
                }
            }
        }
    }
}
