package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FormatPaint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.takusan23.jetpackcomposesampleapp.ui.CenterColumn
import java.lang.Exception

/**
 * カラーコードをパースしてみよう
 * */
@Composable
fun ColorCodeScreen() {
    // カラーコード
    val colorCode = remember { mutableStateOf("#757575") } // たちみどろいどの色

    // エラーかどうか
    val isError = remember { mutableStateOf(false) }

    // テキストボックスで入力した色
    val color = try {
        // カラーコード入力中 == 途中までしか入力していない == 色に変換できない == エラー！
        isError.value = false
        Color(android.graphics.Color.parseColor(colorCode.value))
    } catch (e: Exception) {
        isError.value = true
        Color.Red
    }

    // Columnを真ん中にしたもの
    CenterColumn {
        // テキストボックス
        OutlinedTextField(
            modifier = Modifier.padding(10.dp),
            value = colorCode.value,
            onValueChange = { colorCode.value = it },
            label = { Text(text = if (isError.value) "変換できませんでした / parse error" else "#??????") },
            errorColor = Color.Red,
            isErrorValue = isError.value,
        )
        // アイコン
        Icon(
            modifier = Modifier.padding(10.dp),
            imageVector = Icons.Outlined.FormatPaint,
            tint = color,
        )
        // コード解説
        Text(
            modifier = Modifier.padding(10.dp),
            color = color,
            text = """ Color(android.graphics.Color.parseColor("${colorCode.value}")) """
        )
    }
}