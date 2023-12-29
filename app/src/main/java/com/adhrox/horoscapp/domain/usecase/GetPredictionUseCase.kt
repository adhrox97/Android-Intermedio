package com.adhrox.horoscapp.domain.usecase

import com.adhrox.horoscapp.domain.Repository
import com.adhrox.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sing: String): PredictionModel?{
        return repository.getPrediction(sing)
    }
}