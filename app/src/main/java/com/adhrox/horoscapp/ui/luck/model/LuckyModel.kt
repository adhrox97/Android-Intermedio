package com.adhrox.horoscapp.ui.luck.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LuckyModel(
    @DrawableRes val image: Int,
    @StringRes val text: Int
)