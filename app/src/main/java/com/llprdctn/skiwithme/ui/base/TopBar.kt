package com.llprdctn.skiwithme.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.llprdctn.skiwithme.R

@Composable
fun CustomTopBar(
    name: String = "Lukas"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),

        ) {
        Text(text = "Hello, $name", fontSize = 20.sp)



        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "-5°C", fontSize = 20.sp)

            Spacer(modifier = Modifier.size(5.dp))

            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_wb_sunny_24),
                contentDescription = "Weather",
                tint = Color.Black,
                modifier = Modifier.size(36.dp)
            )
        }

    }
}
