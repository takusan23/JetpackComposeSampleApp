package io.github.takusan23.jetpackcomposesampleapp.ui

import android.content.Context
import android.content.res.Configuration
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * [MaterialTheme]に渡すテーマ。コードでテーマの設定ができるってマジ？
 * */

/** ダークモード。OLED特化 */
val DarkColors = darkColors(
    primary = Color.White,
    secondary = Color.Black,
)

/** ライトテーマ */
val LightColors = lightColors(
    primary = Color(android.graphics.Color.parseColor("#FF6200EE")),
    primaryVariant = Color(android.graphics.Color.parseColor("#FF3700B3")),
    secondary = Color(android.graphics.Color.parseColor("#FFFFFF")),
)

/** 青基調 */
val blueTheme = lightColors(
    primary = Color(android.graphics.Color.parseColor("#0277bd")),
    primaryVariant = Color(android.graphics.Color.parseColor("#58a5f0")),
    secondary = Color(android.graphics.Color.parseColor("#004c8c")),
)

/** 赤基調 */
val redTheme = lightColors(
    primary = Color(android.graphics.Color.parseColor("#c2185b")),
    primaryVariant = Color(android.graphics.Color.parseColor("#8c0032")),
    secondary = Color(android.graphics.Color.parseColor("#fa5788")),
)

/** 緑基調 */
val greenTheme = lightColors(
    primary = Color(android.graphics.Color.parseColor("#1b5e20")),
    primaryVariant = Color(android.graphics.Color.parseColor("#003300")),
    secondary = Color(android.graphics.Color.parseColor("#4c8c4a")),
)

/** ダークモードかどうか */
@Composable
fun isDarkMode(context: Context): Boolean {
    val conf = context.resources.configuration
    val nightMode = conf.uiMode and Configuration.UI_MODE_NIGHT_MASK
    return nightMode == Configuration.UI_MODE_NIGHT_YES // ダークモードなら true
}