package com.example.testing

sealed class Screen(val route : String) {

    object MainScreen : Screen("main_screen")
    object NewLoan :Screen("new_loan")
    object Insurance : Screen("insurance")
    object Customer : Screen("customer")


}
