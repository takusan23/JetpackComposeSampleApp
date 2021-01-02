package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Android
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * 真ん中に表示するサンプル
 * */
@Composable
fun CenterContentScreen() {
    Column {
        Card(
            modifier = Modifier.padding(10.dp).fillMaxWidth().height(100.dp),
            backgroundColor = Color.Cyan,
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "まんなかに居座る Row")
                Icon(imageVector = Icons.Outlined.Android)
            }
        }
        Card(
            modifier = Modifier.padding(10.dp).fillMaxWidth().height(100.dp),
            backgroundColor = Color.Cyan,
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "まんなかに居座る Column")
                Icon(imageVector = Icons.Outlined.Android)
            }
        }
    }
}