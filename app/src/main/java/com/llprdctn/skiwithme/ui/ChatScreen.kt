package com.llprdctn.skiwithme.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.llprdctn.skiwithme.R
import com.llprdctn.skiwithme.util.Message

@Preview
@Composable
fun ChatScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 75.dp),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn{
            items(30) { index ->
                MessageRow(msg = Message(
                    title = "Chat number: $index",
                    content = "Skiing"
                )
                )
            }
        }
    }
}


@Composable
fun MessageRow(msg: Message) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(all = 8.dp),

        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = msg.icon),
            contentDescription = msg.title,
            modifier = Modifier
                .padding(12.dp)
                .size(30.dp)
                .clip(CircleShape)
        )
        
        Column(modifier = Modifier
            .padding(start = 12.dp)) {
            Text(

                text = msg.title
                )

            Spacer(modifier = Modifier.height(4.dp))

            Surface(shape = MaterialTheme.shapes.medium, elevation = 5.dp) {
                Text(
                    text = msg.content,
                    modifier = Modifier.padding(all = 4.dp)
                )

            }

        }




    }
}