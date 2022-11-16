package com.example.roomentityrelationships.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey(autoGenerate = false)
    var studentName: String,
    val semester: Int,
    val schoolName: String
)
