package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.takusan23.jetpackcomposesampleapp.ui.CenterColumn
import io.github.takusan23.jetpackcomposesampleapp.ui.CountUp

/**
 * カウンター画面
 * */
@Composable
fun CounterScreen() {
    val count = remember { mutableStateOf(0) }
    CountUp(count = count.value, counterClick = { count.value++ })
}