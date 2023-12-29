package com.adhrox.horoscapp.data.providers

import com.adhrox.horoscapp.domain.model.HoroscopeInfo
import com.adhrox.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
            return listOf(
                Aries,
                Cancer,
                Aquario,
                Geminis,
                capricornio,
                Leo,
                Libra,
                Escorpio,
                Piscis,
                Sagitario,
                Tauro,
                Virgo
            )
    }
}