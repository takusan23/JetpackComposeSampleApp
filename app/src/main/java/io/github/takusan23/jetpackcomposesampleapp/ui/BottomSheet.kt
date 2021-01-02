package io.github.takusan23.jetpackcomposesampleapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Comment
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


/**
 * BottomSheetとリスト表示。
 *
 * 注意点としては他のレイアウトを表示する場合は[content]の関数内に入れる必要があります。
 *
 * @param bottomSheetState BottomSheetを操作するのに必要。[_root_ide_package_.androidx.compose.material.rememberModalBottomSheetState(initialValue = )]参照
 * 引数にとった理由はほかからでも操作できるように
 * @param content BottomSheet以外のレイアウト。
 * */
@ExperimentalMaterialApi
@Composable
fun BottomSheetList(bottomSheetState: ModalBottomSheetState, content: @Composable () -> Unit) {

    ModalBottomSheetLayout(
        sheetState = bottomSheetState,
        sheetElevation = 10.dp,
        sheetShape = RoundedCornerShape(10.dp, 10.dp, 0.dp, 0.dp),
        sheetContent = {
            LazyColumn(content = {
                this.items((0..20).toList()) { index ->
                    TextButton(onClick = {

                    }) {
                        Text(text = "List：$index")
                    }
                }
            })
        },
        content = {
            // モーダル以外のレイアウト
            content()
        }
    )
}

