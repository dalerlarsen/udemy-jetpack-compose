package com.example.jettipapp.reactivestore

import com.example.jettipapp.reactivestore.models.UpdateStatus
import com.example.jettipapp.reactivestore.models.UserData

data class State(
    val accountId: String,
    val user: UserData? = null,
    val featureXToggleEnabled: Boolean = false,
    val isLoading: Boolean = false,
    val isUpdating: Boolean = false,
    val updateStatus: UpdateStatus = UpdateStatus.UNKNOWN
)