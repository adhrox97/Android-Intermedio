package com.adhrox.horoscapp.data.network.response

import com.adhrox.horoscapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test
import kotlin.math.sign

class PredictionResponseTest{

    @Test
    fun `toDomain should return a correct PredictionModel`(){
        //Given
        val predictionResponse = HoroscopeMotherObject.anyResponse

        //When
        val predictionModel = predictionResponse.toDomain()

        //Then
        predictionModel.sign shouldBe predictionResponse.sign
        predictionModel.horoscope shouldBe  predictionResponse.horoscope

    }
}