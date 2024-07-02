package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import view.Home
import view.SegundaTela


@Composable

fun Navigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Home"

    ){
        composable(
            route = "Home"
        ){
            Home(navController = navController)
        }

        composable(
            route = "SegundaTela/{nome}/{idade}",
            arguments = listOf(
                navArgument("nome"){type = NavType.StringType},
                navArgument("idade"){type = NavType.StringType}
            )
        ){  backStackEntry->

            val nome = backStackEntry.arguments?.getString("nome") ?: ""
            val idade = backStackEntry.arguments?.getString("idade") ?: ""

            SegundaTela(nome = nome, idade = idade, navController = navController)
        }

    }


}