package io.github.takusan23.jetpackcomposesampleapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * カウンター。内部では数えてないので、数えるのはこれをおいたComposeに託します。
 *
 * @param count 何回目か
 * @param counterClick カウンター押したときに呼ばれる
 * */
@Composable
fun CountUp(count: Int, counterClick: () -> Unit) {
    Row(
        modifier = Modifier.padding(10.dp), // スペース確保
        verticalAlignment = Alignment.CenterVertically, // まんなかに
    ) {
        Text(
            text = "押した回数 $count",
        )
        IconButton(onClick = {
            // カウントアップ
            counterClick()
        }) {
            Icon(imageVector = Icons.Outlined.Add)
        }
    }
}
