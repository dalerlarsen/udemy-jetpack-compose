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
) {
    val fullName: String
        get() = "$firstName $lastName"

    fun currentAge(): Int {
        return LocalDate.now().year - dob.year
    }

    // function to validate a gmail email address
    fun isGmail(): Boolean {
        return email.endsWith("@gmail.com")
    }

    fun isOldEnoughToViewBenefits(): Boolean {
        return currentAge() >= 18 && canViewBenefits
    }
}