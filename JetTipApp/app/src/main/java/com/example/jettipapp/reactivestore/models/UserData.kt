package com.example.jettipapp.reactivestore.models

import java.time.LocalDate

data class UserData(
    val userId: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val dob: LocalDate,
    val isAccountManager: Boolean = false,
    val canViewBenefits: Boolean = false,
)