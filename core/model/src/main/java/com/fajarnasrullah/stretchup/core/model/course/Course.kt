package com.fajarnasrullah.stretchup.core.model.course

import androidx.compose.runtime.Immutable
import com.fajarnasrullah.stretchup.core.model.enums.Difficulty

@Immutable
data class Course (
    val id: String,

    val title: String,

    val description: String,

    val thumbnailUrl: String,

    val difficulty: Difficulty,

    val durationMinutes: Int,

    val trainerId: String
)