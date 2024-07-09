package com.example.jettipapp.reactivestore

import com.example.jettipapp.reactivestore.models.UserData
import java.time.LocalDate

object TestData {
    val user1 = UserData(
        userId = "123",
        firstName = "John",
        lastName = "Doe",
        email = "John.Doe@gmail.com",
        dob = LocalDate.parse("1998-01-02")
    )

    val user2 = UserData(
        userId = "456",
        firstName = "Jane",
        lastName = "Doe",
        email = "Jane.Doe@yahoo.com",
        dob = LocalDate.parse("1999-02-03")
    )
}