package com.example.diceroller

import org.junit.Test

import org.junit.Assert.assertTrue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generatesNumber() {
        val sidesNumber = 6
        val dice = Dice(sidesNumber)
        val rollResult: Int = dice.roll()
        assertTrue( "The result of roll dice is not between 1 and 6",
            rollResult in 1..sidesNumber )
    }

}