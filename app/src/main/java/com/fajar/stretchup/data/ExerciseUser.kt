package com.fajar.stretchup.data


data class ExerciseUser(
    val userId: String,
    val exerciseId: String,
    val exercise: Exercise,
    val time: String
)
