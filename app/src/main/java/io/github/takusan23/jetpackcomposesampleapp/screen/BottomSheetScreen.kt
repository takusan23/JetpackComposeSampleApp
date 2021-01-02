package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import io.github.takusan23.jetpackcomposesampleapp.ui.BottomSheetList
import io.github.takusan23.jetpackcomposesampleapp.ui.CenterColumn

/**
 * BottomSheetサンプル
 * */
@ExperimentalMaterialApi
@Composable
fun BottomSheetScreen() {
    // BottomSheetを表示させるかどうか
    val bottomSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.HalfExpanded)

    BottomSheetList(
        bottomSheetState = bottomSheetState,
        content = {
            CenterColumn {
                Button(onClick = {
                    bottomSheetState.show()
                }) {
                    Text(text = "表示")
                }
            }
        }
    )
}