package com.adhrox.horoscapp.domain.model

import com.adhrox.horoscapp.R

sealed class HoroscopeInfo(val img: Int, val name: Int){
    object Aries: HoroscopeInfo(R.drawable.aries, R.string.aries)
}