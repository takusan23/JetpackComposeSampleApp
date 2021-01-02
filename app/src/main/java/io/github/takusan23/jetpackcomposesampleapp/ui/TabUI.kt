package io.github.takusan23.jetpackcomposesampleapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Android
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * タブレイアウト
 *
 * @param selectTabIndex 選択するタブを入れてね
 * @param tabClick タブを押した時
 * */
@Composable
fun TabLayout(selectTabIndex: Int, tabClick: (Int) -> Unit) {
    TabRow(
        modifier = Modifier.padding(10.dp),
        selectedTabIndex = selectTabIndex,
        backgroundColor = Color.Transparent,
    ) {
        Tab(selected = selectTabIndex == 0, onClick = {
            tabClick(0)
        }) {
            Icon(imageVector = Icons.Outlined.Android)
            Text(text = "Android 9")
        }
        Tab(selected = selectTabIndex == 1, onClick = {
            tabClick(1)
        }) {
            Icon(imageVector = Icons.Outlined.Android)
            Text(text = "Android 10")
        }
        Tab(selected = selectTabIndex == 2, onClick = {
            tabClick(2)
        }) {
            Icon(imageVector = Icons.Outlined.Android)
            Text(text = "Android 11")
        }
    }
}