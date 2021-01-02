package io.github.takusan23.jetpackcomposesampleapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

/**
 * メニュー一覧
 *
 * @param clickMenu メニュー押した時。引数は押した位置
 * */
@Composable
fun MenuUI(clickMenu: (Int) -> Unit) {

    Column(
        modifier = Modifier.padding(5.dp)
    ) {
        // とっぷ
        MenuItem(
            text = "ホーム / Home",
            imageVector = Icons.Outlined.Home,
            click = { clickMenu(0) },
        )
        // Tab
        MenuItem(
            text = "タブ / Tab",
            imageVector = Icons.Outlined.Tab,
            click = { clickMenu(1) },
        )
        // Snackbar
        MenuItem(
            text = "スナックバー / Snackbar",
            imageVector = Icons.Outlined.BorderBottom,
            click = { clickMenu(2) },
        )
        // 真ん中に表示
        MenuItem(
            text = "gravitiy=center",
            imageVector = Icons.Outlined.CenterFocusStrong,
            click = { clickMenu(3) },
        )
        // カラーコード変換
        MenuItem(
            text = "カラーコード / Color Code",
            imageVector = Icons.Outlined.FormatPaint,
            click = { clickMenu(4) }
        )
        // BottomSheet
        MenuItem(
            text = "BottomSheet",
            imageVector = Icons.Outlined.VerticalAlignTop,
            click = { clickMenu(5) }
        )
        // カウンター
        MenuItem(
            text = "カウンター",
            imageVector = Icons.Outlined.Add,
            click = { clickMenu(6) }
        )
        // 表示、非表示サンプル
        MenuItem(
            text = "表示、非表示 / Visibility",
            imageVector = Icons.Outlined.Visibility,
            click = { clickMenu(7) }
        )
        // 丸める
        MenuItem(
            text = "かどまる",
            imageVector = Icons.Outlined.RoundedCorner,
            click = { clickMenu(8) }
        )
        // 動的に色を変えてみる
        MenuItem(
            text = "動的テーマ / Dynamic themes",
            imageVector = Icons.Outlined.Colorize,
            click = { clickMenu(9) }
        )
    }
}

/**
 * メニューのボタン一つ一つ
 *
 * @param click メニューを押した時
 * @param imageVector アイコン。[Icons.Default.Android]等を参照
 * @param text メニューの文字列
 * */
@Composable
fun MenuItem(text: String, imageVector: ImageVector, click: () -> Unit) {
    TextButton(onClick = { click() }) {
        Icon(imageVector = imageVector)
        Text(
            text = text,
            modifier = Modifier.weight(1f).padding(10.dp)
        )
    }
}