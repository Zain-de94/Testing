package com.example.testing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testing.Forms.Customer
import com.example.testing.Forms.Insurance
import com.example.testing.Forms.NewLoan


@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {

        composable(route = Screen.MainScreen.route) {

            MainScreen(navController = navController)


        }
        composable(route = Screen.NewLoan.route) {
            NewLoan()
        }

        composable(route = Screen.Customer.route)
        {
            Customer()
        }
        composable(route = Screen.Insurance.route) {
            Insurance()
        }


    }

}

@Composable
fun MainScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),contentAlignment = Alignment.Center
    ) {
        Column {

        Button(onClick = { navController.navigate(Screen.NewLoan.route) }) {

            Text(text = "New Loan")

        }

            Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate(Screen.Customer.route) }) {

            Text(text = "Customer")

        }

            Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate(Screen.Insurance.route) }) {

            Text(text = "Insurance")

        }


    }
    }


}