package io.github.takusan23.jetpackcomposesampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import io.github.takusan23.jetpackcomposesampleapp.screen.*
import io.github.takusan23.jetpackcomposesampleapp.ui.*

class MainActivity : AppCompatActivity() {
    @ExperimentalAnimationApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // 動的にテーマを変えてみる
            val defaultTheme = if (isDarkMode(AmbientContext.current)) DarkColors else LightColors
            val dynamicTheme = remember { mutableStateOf(defaultTheme) }

            MaterialTheme(
                // 色の設定
                colors = dynamicTheme.value
            ) {

                // 選択したメニュー。by remember{ } でもいい
                val selectedIndex = remember { mutableStateOf(0) }

                // ドロワー開けるか
                val scaffoldState = rememberScaffoldState()

                Scaffold(
                    scaffoldState = scaffoldState,
                    // どろわー
                    drawerContent = {
                        // ドロワーにメニュー追加
                        MenuUI(clickMenu = {
                            selectedIndex.value = it
                            scaffoldState.drawerState.close() // ドロワー収納
                        })
                    },
                    drawerShape = RoundedCornerShape(0.dp, 10.dp, 10.dp, 0.dp),// 左上、左下は丸くしない
                    // あぷりばー
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "Jetpack Compose サンプル",
                                )
                            },
                            navigationIcon = {
                                IconButton(onClick = { scaffoldState.drawerState.open() }) {
                                    Icon(imageVector = Icons.Filled.Menu)
                                }
                            }
                        )
                    },
                ) {
                    // gravitiy = center
                    CenterColumn {
                        // 画面を切り替える
                        when (selectedIndex.value) {
                            0 -> HomeScreen()
                            1 -> TabScreen()
                            2 -> SnackbarScreen(scaffoldState)
                            3 -> CenterContentScreen()
                            4 -> ColorCodeScreen()
                            5 -> BottomSheetScreen()
                            6 -> CounterScreen()
                            7 -> ExpandingTextScreen()
                            8 -> ImageRoundScreen()
                            9 -> DynamicThemeScreen(themeClick = { dynamicTheme.value = it })
                            10 -> AnimationScreen()
                        }
                    }
                }
            }
        }
    }
}
