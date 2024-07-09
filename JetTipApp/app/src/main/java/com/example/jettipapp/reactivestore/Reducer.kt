package com.example.jettipapp.reactivestore

class Reducer {

    fun reduce(state: State, action: Action) : ReducerResult {
        return when (action) {
            Action.LoadAccountData -> ReducerResult(
                state.copy(isLoading = true)
            )
            is Action.AccountDataLoaded -> ReducerResult(
                state.copy(user = action.userData, isLoading = false),
                SideEffect.OpenAccountDetailsScreen
            )
            is Action.SetFeatureToggleX -> ReducerResult(
                state.copy(featureXToggleEnabled = action.isEnabled)
            )
            Action.UpdateData -> ReducerResult(
                state.copy(isUpdating = true)
            )
            is Action.UpdateDataCompleted -> ReducerResult(
                state.copy(isUpdating = false, updateStatus = action.updateStatus),
                SideEffect.OpenUpdateSuccessScreen
            )
        }
    }
}