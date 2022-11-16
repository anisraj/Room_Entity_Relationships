package com.example.roomentityrelationships

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.roomentityrelationships.entities.Student
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private lateinit var student: Student

    @Before
    fun createsStudent() {
        student = Student("Beff Jezos", 2, "Kotlin School")
    }

    @Test
    fun student_write_read() {
        student.studentName = "Anis Jamadar"
        assert(student.studentName == "Anis Jamadar")
    }
}