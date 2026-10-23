package com.juannieto.facebookproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PostAction(
    modifier: Modifier = Modifier,
    isLiked: Boolean = false,
    onLikeClick: () -> Unit = {},
    onCommentClick: () -> Unit = {},
    onShareClick: () -> Unit = {},
) {
    Column(modifier = modifier.fillMaxWidth()) {
        HorizontalDivider(color = Color(0xFFCCD0D5), thickness = 0.5.dp)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            LikeButton(
                modifier = Modifier.weight(1f),
                isLiked = isLiked,
                onClick = onLikeClick,
            )
            CommentButton(
                modifier = Modifier.weight(1f),
                onClick = onCommentClick,
            )
            ShareButton(
                modifier = Modifier.weight(1f),
                onClick = onShareClick,
            )
        }

        HorizontalDivider(color = Color(0xFFCCD0D5), thickness = 0.5.dp)
    }
}

@Preview(showBackground = true)
@Composable
fun PostActionPreview() {
    PostAction()
}
