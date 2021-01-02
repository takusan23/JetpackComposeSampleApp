package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.takusan23.jetpackcomposesampleapp.ui.CenterColumn
import io.github.takusan23.jetpackcomposesampleapp.ui.TabLayout

/** タブのサンプル */
@Composable
fun TabScreen() {
    CenterColumn {
        // 選択中タブ
        val selectTabIndex = remember { mutableStateOf(0) }
        TabLayout(
            selectTabIndex = selectTabIndex.value,
            tabClick = { index -> selectTabIndex.value = index }
        )
        Text(text = "選択中：${selectTabIndex.value}")
    }
}