package com.example.roomentityrelationships

import com.example.roomentityrelationships.entities.Director
import org.junit.Before
import org.junit.Test

class DirectorTest {
    private lateinit var director: Director

    @Before
    fun setUp() {
        director = Director("Mike Litoris", "Jake Wharton School")
    }

    @Test
    fun directorTest() {
        assert(director.schoolName == "Jake Wharton School")
    }
}