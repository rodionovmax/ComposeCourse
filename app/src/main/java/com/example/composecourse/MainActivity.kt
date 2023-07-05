package com.example.composecourse

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.example.composecourse.optimization3.CustomGrid
import com.example.composecourse.optimization3.FeedViewModel
import com.example.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCourseTheme {
                val navController = rememberNavController()
//                NavHost(navController = navController, startDestination = "home") {
//                    composable("home") {
//                        Box(
//                            modifier = Modifier.fillMaxSize(),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Button(onClick = {
//                                navController.navigate("detail")
//                            }) {
//                                Text(text = "To detail")
//                            }
//                        }
//                    }
//                    composable(
//                        route = "detail",
//                        deepLinks = listOf(
//                            navDeepLink {
//                                uriPattern = "https://pl-coding.com/{id}"
//                                action = Intent.ACTION_VIEW
//                            }
//                        ),
//                        arguments = listOf(
//                            navArgument("id") {
//                                type = NavType.IntType
//                                defaultValue = -1
//                            }
//                        )
//                    ) { entry ->
//                        val id = entry.arguments?.getInt("id")
//                        Box(
//                            modifier = Modifier.fillMaxSize(),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Text(text = "The id is $id")
//                        }
//                    }
//                }

                val viewModel = viewModel<FeedViewModel>()
                val feeds = viewModel.feeds
                
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    CustomGrid(
                        feeds = feeds,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Button(onClick = viewModel::rearrangeFeeds) {
                        Text(text = "Shuffle feeds")
                    }
                }
            }
        }
    }
}

