package com.fajarnasrullah.stretchup.data

data class Exercise(
    val id: String,
    val title: String,
    val author: String,
    val category: String,
    val detail: List<String>,
    val focus: List<String>
)
