package io.github.takusan23.jetpackcomposesampleapp.ui

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * 動画説明文みたいに展開できるようになるやつ
 *
 * @param isShow 展開するか
 * @param showButtonClick 展開ボタン押した時
 * */
@Composable
fun ExpandingText(isShow: Boolean, showButtonClick: () -> Unit) {
    Text(text = "展開できます。豆先輩")
    if (isShow) {
        // 展開時のUI
        Text(text = """
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
            豆
        """.trimIndent())
        IconButton(onClick = { showButtonClick() }) {
            Icon(Icons.Default.ExpandLess)
        }
    } else {
        // 格納時のUI
        IconButton(onClick = { showButtonClick() }) {
            Icon(Icons.Default.ExpandMore)
        }
    }
}