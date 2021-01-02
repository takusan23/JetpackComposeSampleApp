package io.github.takusan23.jetpackcomposesampleapp.screen

import android.widget.Toast
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.AmbientContext
import io.github.takusan23.jetpackcomposesampleapp.ui.CenterColumn
import kotlinx.coroutines.launch

/**
 * Sanackbar表示
 * @param scaffoldState Snackbarを表示する際に必要
 * */
@ExperimentalMaterialApi
@Composable
fun SnackbarScreen(scaffoldState: ScaffoldState) {
    val scope = rememberCoroutineScope()
    val context = AmbientContext.current

    // 真ん中なColumn
    CenterColumn {
        OutlinedButton(onClick = {
            scope.launch {
                val result = scaffoldState.snackbarHostState.showSnackbar(
                    message = "Snackbar表示",
                    actionLabel = "押せます",
                    duration = SnackbarDuration.Short,
                )
                // 押せたかどうか
                if (result == SnackbarResult.ActionPerformed) {
                    Toast.makeText(context, "押せました！", Toast.LENGTH_SHORT).show()
                }
            }
        }) {
            Text(text = "Snackbar表示")
        }
    }

}