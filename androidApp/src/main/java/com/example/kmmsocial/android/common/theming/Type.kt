package com.example.kmmsocial.android.common.theming

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontLoadingStrategy
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.kmmsocial.android.R

val Lexend = FontFamily(
    Font(
        R.font.lexend_medium,
        FontWeight.Medium,
        FontStyle.Normal,
        FontLoadingStrategy.OptionalLocal
    ),
    Font(
        R.font.lexend_semi_bold,
        FontWeight.SemiBold,
        FontStyle.Normal,
        FontLoadingStrategy.OptionalLocal
    ),
    Font(
        R.font.lexend_bold,
        FontWeight.Bold,
        FontStyle.Normal,
        FontLoadingStrategy.OptionalLocal
    )
)
val OpenSans = FontFamily(
    Font(
        R.font.open_sans_light,
        FontWeight.Light,
        FontStyle.Normal,
        FontLoadingStrategy.OptionalLocal
    ),
    Font(
        R.font.open_sans_regular,
        FontWeight.Normal,
        FontStyle.Normal,
        FontLoadingStrategy.OptionalLocal
    )
)

val Typography = Typography().copy(
    headlineSmall = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.Bold,
        fontSize = 21.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp
    ),
    titleMedium = TextStyle(
        fontFamily = OpenSans
    ),
    labelSmall = TextStyle(
        fontFamily = OpenSans
    )
)







