package com.fajarnasrullah.stretchup.core.model.auth

import androidx.compose.runtime.Immutable

@Immutable
data class Auth(
    val uid: String,
    val email: String,
)
