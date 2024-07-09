package com.example.jettipapp.reactivestore

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
}