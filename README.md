# JetpackComposeSampleApp

Jetpack Composeで遊んでみました。楽しい

<p align="center">
<img src="https://imgur.com/yOqCVUa.png" width="200">
<img src="https://imgur.com/zF3k6ek.png" width="200">
<img src="https://imgur.com/tY1hy1L.png" width="200">
<img src="https://imgur.com/vUjMTkK.png" width="200">
<img src="https://imgur.com/hMkcsTA.png" width="200">
<img src="https://imgur.com/dDDg7VN.png" width="200">
<img src="https://imgur.com/KqnWd5w.png" width="200">
</p>

## ダウンロード

https://github.com/takusan23/JetpackComposeSampleApp/releases/tag/1.0

## Jetpack Composeの書き方

多分内部で値を持つより、引数に出してあげたほうがいいらしい？

```java
// 内部で値を保持している例。これだと他から値にアクセスできない。
@Composable
fun CountUp() {
    val count = remember { mutableStateOf(0) }
    Row(
        modifier = Modifier.padding(10.dp), // スペース確保
        verticalAlignment = Alignment.CenterVertically, // まんなかに
    ) {
        Text(
            text = "押した回数 ${count.value}",
        )
        IconButton(onClick = {
            // カウントアップ
            count.value++
        }) {
            Icon(imageVector = Icons.Outlined.Add)
        }
    }
}
```


```java
// カウント回数保持はこれをおいたCompose側で行う。
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

/**
 * カウンター画面
 * */
@Composable
fun CounterScreen() {
    val count = remember { mutableStateOf(0) }
    CountUp(count = count.value, counterClick = { count.value++ })
}
```
