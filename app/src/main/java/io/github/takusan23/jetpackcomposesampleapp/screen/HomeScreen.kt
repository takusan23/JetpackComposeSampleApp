package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

/** 一番最初に表示する画面。 */
@Composable
fun HomeScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = """
            | Jetpack Composeのサンプル集
            | - Android Studio Version
            |   - Android Studio Arctic Fox | 2020.3.1 Canary 3
        """.trimMargin())
    }
}