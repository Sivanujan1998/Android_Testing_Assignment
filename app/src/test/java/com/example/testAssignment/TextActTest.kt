package com.example.testAssignment

import org.junit.Test
import org.junit.Assert.*

class TextActTest{

    @Test
    fun should_return_hello_world(){
        val textActivity = TextActivity()
        assertEquals("Hi Raja",textActivity.Replyme("Raja"))
    }

    @Test
    fun should_not_return_hello_world(){
        val textActivity = TextActivity()
        assertNotEquals("Hi Raja",textActivity.Replyme("Hello"))
    }
}