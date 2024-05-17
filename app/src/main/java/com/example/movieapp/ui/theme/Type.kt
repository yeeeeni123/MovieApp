package com.example.movieapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.example.movieapp.R


private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)

private val spoqarRegular= FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)

private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

val Typography = androidx.compose.material.Typography(
    defaultFontFamily = spoqarRegular,
    h1 = TextStyle(
        fontFamily = spoqaBold,
        fontWeight = FontWeight.Normal,
        fontSize = 60.sp
    ),
    h2 = TextStyle(
        fontFamily = spoqaBold,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp
    ),
    h3= TextStyle(
        fontFamily = spoqaBold,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h4= TextStyle(
        fontFamily = spoqaThin,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp
    )
    ,
    h5= TextStyle(
        fontFamily = spoqaBold,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    h6= TextStyle(
        fontFamily = spoqarRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = spoqarRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = spoqarRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    body1 = TextStyle(
        fontFamily = spoqaBold,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    body2 = TextStyle(
        fontFamily = spoqarRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    caption = TextStyle(
        fontFamily = spoqarRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)

val Typography.h5Title: TextStyle
    @Composable get() = Typography.h5.copy(
        fontSize = 24.sp
    )

val Typography.dialogButton: TextStyle
    @Composable get() = Typography.button.copy(
        fontSize = 24.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = Typography.button.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = Typography.button.copy(
        textDecoration = TextDecoration.Underline
    )