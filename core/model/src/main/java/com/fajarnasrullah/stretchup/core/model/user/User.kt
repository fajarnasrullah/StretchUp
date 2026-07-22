package com.fajarnasrullah.stretchup.core.model.user

import androidx.compose.runtime.Immutable
import com.fajarnasrullah.stretchup.core.model.enums.Gender
import com.fajarnasrullah.stretchup.core.model.enums.UserRole


@Immutable
data class User(
    val id: String,

    val fullName: String,

    val email: String,

    val photoUrl: String?,

    val gender: Gender,

    val role: UserRole,

    val createdAt: Long
)
