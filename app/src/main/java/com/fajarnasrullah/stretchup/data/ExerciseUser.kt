package com.fajarnasrullah.stretchup.data


data class ExerciseUser(
    val userId: String,
    val exerciseId: String,
    val exercise: Exercise,
    val time: String
)
