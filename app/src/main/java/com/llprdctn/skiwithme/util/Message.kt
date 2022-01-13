package com.llprdctn.skiwithme.util

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.llprdctn.skiwithme.R

data class Message(
    val title: String,
    val content: String,
    val icon: Int = R.drawable.ic_ski
)
