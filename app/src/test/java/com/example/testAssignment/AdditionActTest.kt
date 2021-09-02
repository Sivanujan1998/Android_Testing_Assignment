package com.example.testAssignment

import org.junit.Test
import org.junit.Assert.*;

class AdditionActTest{

    @Test
    fun addition_for_two_positive_numbers(){
        val additionActivity = Addition()
        assertEquals(60,additionActivity.addNumbers(20,40))
    }

    @Test
    fun addition_for_two_negative_numbers(){
        val additionActivity = Addition()
        assertEquals(-60,additionActivity.addNumbers(-20,-40))
    }

    @Test
    fun addition_for_positive_and_negative_numbers(){
        val additionActivity = Addition()
        assertEquals(-20,additionActivity.addNumbers(20,-40))
    }
}