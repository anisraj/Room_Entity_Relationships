package com.example.roomentityrelationships.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomentityrelationships.entities.School
import com.example.roomentityrelationships.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)
