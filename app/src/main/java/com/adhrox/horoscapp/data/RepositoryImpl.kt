package com.adhrox.horoscapp.data

import android.util.Log
import com.adhrox.horoscapp.data.network.HoroscopeApiService
import com.adhrox.horoscapp.data.network.response.PredictionResponse
import com.adhrox.horoscapp.domain.Repository
import com.adhrox.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("adhrox", "Ha ocurrido un error ${it.message}") }
        return null
    }
}