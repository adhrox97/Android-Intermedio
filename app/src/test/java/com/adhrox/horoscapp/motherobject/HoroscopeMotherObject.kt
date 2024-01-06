package com.adhrox.horoscapp.motherobject

import com.adhrox.horoscapp.data.network.response.PredictionResponse
import com.adhrox.horoscapp.domain.model.HoroscopeInfo

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
    HoroscopeInfo.Aries,
    HoroscopeInfo.Cancer,
    HoroscopeInfo.Aquario,
    HoroscopeInfo.Geminis,
    HoroscopeInfo.capricornio,
    HoroscopeInfo.Leo,
    HoroscopeInfo.Libra,
    HoroscopeInfo.Escorpio,
    HoroscopeInfo.Piscis,
    HoroscopeInfo.Sagitario,
    HoroscopeInfo.Tauro,
    HoroscopeInfo.Virgo
    )
}