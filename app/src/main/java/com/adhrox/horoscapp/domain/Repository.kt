package com.adhrox.horoscapp.domain

import com.adhrox.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}