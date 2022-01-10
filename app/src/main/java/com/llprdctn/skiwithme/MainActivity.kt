package com.llprdctn.skiwithme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.llprdctn.skiwithme.ui.theme.SkiWithMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Greeting()
                Home()

            }
        }
    }
}

@Composable
fun Greeting(
    name: String = "Lukas"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(text = "Hello, $name")

        Icon(
            painter = painterResource(id =R.drawable.ic_baseline_menu_24),
            contentDescription = "Menu",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
    }
}


@Composable
fun Home() {
    Column(
        Modifier
            .background(Color.Red)
            .fillMaxHeight()
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
        )
    }
}


@Composable
fun BottomMenu() {

    Box(modifier = Modifier.background(Color.Gray)
        .padding(20.dp)
        )


    Row (
        horizontalArrangement = Arrangement.SpaceBetween
    ){

    }
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SkiWithMeTheme {
        Home()
    }
}