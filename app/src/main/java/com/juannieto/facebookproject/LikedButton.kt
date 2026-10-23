package com.juannieto.facebookproject

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LikedButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    LikeButton(
        modifier = modifier,
        isLiked = true,
        onClick = onClick,
    )
}

@Preview(showBackground = true)
@Composable
fun LikedButtonPreview() {
    LikedButton()
}
