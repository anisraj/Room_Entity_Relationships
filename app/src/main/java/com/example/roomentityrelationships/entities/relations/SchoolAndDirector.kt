package com.example.roomentityrelationships.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomentityrelationships.entities.Director
import com.example.roomentityrelationships.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)