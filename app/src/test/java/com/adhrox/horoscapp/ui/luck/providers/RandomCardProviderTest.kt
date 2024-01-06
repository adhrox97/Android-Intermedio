package com.adhrox.horoscapp.ui.luck.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{

    @Test
    fun `getRandomCard should return a random card`(){
        //Given
        val randomCard = RandomCardProvider()

        //when
        val card = randomCard.getLucky()

        //Then
        assertNotNull(card)

    }
}