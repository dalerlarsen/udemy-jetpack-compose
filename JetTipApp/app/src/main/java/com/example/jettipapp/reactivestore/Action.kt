package com.example.jettipapp.reactivestore

import com.example.jettipapp.reactivestore.models.UpdateStatus
import com.example.jettipapp.reactivestore.models.UserData

sealed class Action {
    object LoadAccountData : Action()

    data class AccountDataLoaded(val userData: UserData) : Action()

    data class SetFeatureToggleX(val isEnabled: Boolean) : Action()

    object UpdateData : Action()

    data class UpdateDataCompleted(val updateStatus: UpdateStatus) : Action()
}