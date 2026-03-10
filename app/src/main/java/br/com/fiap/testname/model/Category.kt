package br.com.fiap.testname.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import br.com.fiap.testname.R

data class Category(
    val id: Int = 0,
    val name: String = "Name",
    @DrawableRes val image: Int? = R.drawable.no_photo,
    val background: Color = Color.Gray
)
