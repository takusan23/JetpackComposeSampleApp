package io.github.takusan23.jetpackcomposesampleapp.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.unit.dp
import io.github.takusan23.jetpackcomposesampleapp.ui.*

/**
 * 動的にテーマを変えてみる
 *
 * @param themeClick 色のボタンを押した時。それに合う色が引数に入っています。
 * */
@Composable
fun DynamicThemeScreen(
    themeClick: (Colors) -> Unit,
) {
    // デフォルト
    val defaultTheme = if (isDarkMode(context = AmbientContext.current)) DarkColors else LightColors

    CenterColumn {
        Button(
            modifier = Modifier.padding(5.dp),
            onClick = { themeClick(blueTheme) }
        ) {
            Text(text = "青")
        }
        Button(modifier = Modifier.padding(5.dp),
            onClick = { themeClick(redTheme) }
        ) {
            Text(text = "赤")
        }
        Button(modifier = Modifier.padding(5.dp),
            onClick = { themeClick(greenTheme) }
        ) {
            Text(text = "緑")
        }
        Button(modifier = Modifier.padding(5.dp),
            onClick = { themeClick(defaultTheme) }
        ) {
            Text(text = "デフォルト")
        }
    }

}