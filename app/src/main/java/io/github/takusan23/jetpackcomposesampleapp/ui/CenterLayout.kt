package io.github.takusan23.jetpackcomposesampleapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * 真ん中のColumn。真ん中にしただけでほかは普通の[_root_ide_package_.androidx.compose.foundation.layout.Column]
 * */
@Composable
fun CenterColumn(content: @Composable ColumnScope.() -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        content = content
    )
}

/**
 * 真ん中のRow。真ん中にしただけでほかは普通の[_root_ide_package_.androidx.compose.foundation.layout.Row]
 * */
@Composable
fun CenterRow(content: @Composable() (RowScope.() -> Unit)) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        content = content
    )
}