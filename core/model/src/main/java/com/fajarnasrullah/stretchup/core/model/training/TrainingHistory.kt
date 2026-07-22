package com.fajarnasrullah.stretchup.core.model.training

import androidx.compose.runtime.Immutable

@Immutable
data class TrainingHistory(
    val id: String,

    val userId: String,

    val courseId: String,

    val completedAt: Long,

    val durationMinute: Int
)
