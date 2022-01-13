package com.llprdctn.skiwithme.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.llprdctn.skiwithme.R

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxWidth(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "SKI WITH ME",
            fontSize = 45.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 30.dp)
        )

        Spacer(modifier = Modifier.size(30.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_ski),
            contentDescription = "Skiing",
            modifier = Modifier
                .padding(20.dp)
                .size(300.dp)
                .clip(CircleShape)
                .border(
                    1.5.dp,
                    MaterialTheme.colors.secondary,
                    CircleShape
                )
        )


    }
}
