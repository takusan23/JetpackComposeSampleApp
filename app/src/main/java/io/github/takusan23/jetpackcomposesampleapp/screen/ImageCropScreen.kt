package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Slider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Android
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.takusan23.jetpackcomposesampleapp.ui.CenterColumn

/**
 * 写真を丸くする。別に写真である必要はない
 * */
@Composable
fun ImageRoundScreen() {
    // スライダーの値
    val cropValue = remember { mutableStateOf(1f) }

    // 角を丸めるやつ
    val crop = RoundedCornerShape((cropValue.value * 50).dp)

    CenterColumn {
        Image(
            modifier = Modifier.width(100.dp).height(100.dp).clip(crop).background(Color.Blue),
            imageVector = Icons.Outlined.Android,
        )
        Slider(
            value = cropValue.value,
            onValueChange = { cropValue.value = it }
        )
    }
}