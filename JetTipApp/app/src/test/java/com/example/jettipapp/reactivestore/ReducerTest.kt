package com.example.jettipapp.reactivestore

import com.example.jettipapp.reactivestore.models.UpdateStatus
import com.example.jettipapp.reactivestore.models.UserData
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class ReducerTest {
    private val testState = State(
        accountId = "1234"
    )
    private val reducer by lazy {
        Reducer()
    }

    @Test
    fun `when action is LoadAccountData state is updated with null sideEffect`() {
        // Arrange
        val expectedState = testState.copy(isLoading = true)
        val expectedSideEffect = null

        // Act
        val result = reducer.reduce(testState, Action.LoadAccountData)

        // Assert
        assertEquals(expectedState, result.state)
        assertEquals(expectedSideEffect, result.sideEffect)
    }

    @Test
    fun `when action is AccountDataLoaded state is updated with user and sideEffect OpenAccountDetailsScreen`() {
        // Arrange
        val userData = TestData.user1
        val expectedState = testState.copy(user = userData, isLoading = false)
        val expectedSideEffect = SideEffect.OpenAccountDetailsScreen

        // Act
        val result = reducer.reduce(testState, Action.AccountDataLoaded(userData))

        // Assert
        assertEquals(expectedState, result.state)
        assertEquals(expectedSideEffect, result.sideEffect)
    }

    @Test
    fun `when action is SetFeatureToggleX state is updated with featureXToggleEnabled`() {
        // Arrange
        val isEnabled = true
        val expectedState = testState.copy(featureXToggleEnabled = isEnabled)

        // Act
        val result = reducer.reduce(testState, Action.SetFeatureToggleX(isEnabled))

        // Assert
        assertEquals(expectedState, result.state)
        assertEquals(null, result.sideEffect)
    }

    @Test
    fun `when action is UpdateData state is updated with isUpdating`() {
        // Arrange
        val expectedState = testState.copy(isUpdating = true)

        // Act
        val result = reducer.reduce(testState, Action.UpdateData)

        // Assert
        assertEquals(expectedState, result.state)
        assertEquals(null, result.sideEffect)
    }

    @Test
    fun `when action is UpdateDataCompleted state is updated with isUpdating and updateStatus and sideEffect OpenUpdateSuccessScreen`() {
        // Arrange
        val updateStatus = UpdateStatus.SUCCESS
        val expectedState = testState.copy(isUpdating = false, updateStatus = updateStatus)
        val expectedSideEffect = SideEffect.OpenUpdateSuccessScreen

        // Act
        val result = reducer.reduce(testState, Action.UpdateDataCompleted(updateStatus))

        // Assert
        assertEquals(expectedState, result.state)
        assertEquals(expectedSideEffect, result.sideEffect)
    }

}