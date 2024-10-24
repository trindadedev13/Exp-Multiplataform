package dev.trindadedev.exp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

import dev.trindadedev.exp.ui.screens.MainScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Exp",
    ) {
        MainScreen()
    }
}