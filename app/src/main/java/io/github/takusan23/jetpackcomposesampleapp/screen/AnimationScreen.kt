package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.takusan23.jetpackcomposesampleapp.ui.VisibilityAnimationSample

/**
 * アニメーションするやつのサンプル
 * */
@ExperimentalAnimationApi
@Composable
fun AnimationScreen() {
    val isShow = remember { mutableStateOf(false) }
    VisibilityAnimationSample(isShow = isShow.value, showClick = { isShow.value = !isShow.value })
}