package com.llprdctn.skiwithme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.llprdctn.skiwithme.ui.BottomNavigationBar
import com.llprdctn.skiwithme.ui.Navigation
import com.llprdctn.skiwithme.ui.theme.SkiWithMeTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            Scaffold(
                bottomBar = {
                    BottomNavigationBar(
                        items = listOf(
                            BottomNavItem(
                                name = "Home",
                                route = "home",
                                icon = Icons.Default.Home
                            ),
                            BottomNavItem(
                                name = "Chat",
                                route = "chat",
                                icon = Icons.Default.Notifications
                            ),
                            BottomNavItem(
                                name = "Settings",
                                route = "settings",
                                icon = Icons.Default.Settings
                            )
                        ),
                        navController = navController,
                        onItemClick = {
                            navController.navigate(it.route)
                        }
                    )
                }
            ) {
                Navigation(navController = navController)

            }


        }
    }
}

@Composable
fun CustomTopBar(
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

@Preview
@Composable
fun Home() {
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

@Preview
@Composable
fun BottomMenu() {
    BottomNavigation(
        Modifier
            .fillMaxWidth()
            .height(50.dp),
        backgroundColor = Color.LightGray,
        elevation = 10.dp,
    ) {
        BottomNavigationItem(
            selected = false,
            onClick = {  },
            icon = { Icon(Icons.Filled.Favorite, contentDescription = null)},
            label = { Text(text = "Test")}
        )
        BottomNavigationItem(
            selected = false,
            onClick = {  },
            icon = { Icon(Icons.Filled.Favorite, contentDescription = null)},
            label = { Text(text = "Test")}
        )
        BottomNavigationItem(
            selected = false,
            onClick = {  },
            icon = { Icon(Icons.Filled.Favorite, contentDescription = null)},
            label = { Text(text = "Test")}
        )


    }


}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SkiWithMeTheme {

    }
}