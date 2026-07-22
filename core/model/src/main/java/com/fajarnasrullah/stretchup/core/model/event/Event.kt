package com.fajarnasrullah.stretchup.core.model.event

import androidx.compose.runtime.Immutable

@Immutable
data class Event(
    val id: String,
    val title: String,
    val description: String,
    val imageUrl: String,
    val location: String,
    val eventTime: Long
)
