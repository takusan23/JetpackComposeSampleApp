package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.takusan23.jetpackcomposesampleapp.ui.ExpandingText

/**
 * 表示、非表示サンプル
 * */
@Composable
fun ExpandingTextScreen() {
    val expanded = remember { mutableStateOf(false) }
    ExpandingText(isShow = expanded.value, showButtonClick = { expanded.value = !expanded.value })
}