package com.example.jettipapp.reactivestore

sealed class SideEffect {
    object OpenAccountDetailsScreen : SideEffect()
    object OpenUpdateSuccessScreen : SideEffect()
}