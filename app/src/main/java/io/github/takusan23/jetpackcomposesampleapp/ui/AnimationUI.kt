package io.github.takusan23.jetpackcomposesampleapp.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Adb
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate

/**
 * アニメーションさせながら複数のアイコンたちを表示させる
 *
 * @param isShow 表示させるかどうか
 * @param showClick 表示ボタン押した時
 * */
@ExperimentalAnimationApi
@Composable
fun VisibilityAnimationSample(
    isShow: Boolean,
    showClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        AnimatedVisibility(visible = isShow) {
            // この中に書いたやつがアニメーションされながら表示される
            Column {
                // 10個ぐらい
                repeat(10) {
                    Icon(imageVector = Icons.Outlined.Adb, modifier = Modifier.rotate(90f * it))
                }
            }
        }
        // 表示、非表示切り替え
        Button(onClick = { showClick() }) {
            Text(text = "アニメーションさせながら表示")
        }
    }
}