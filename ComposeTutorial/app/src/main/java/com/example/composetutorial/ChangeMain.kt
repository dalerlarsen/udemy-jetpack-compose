package com.example.composetutorial


fun main() {
    calculateChange("14.95", "15.0")
    calculateChange("28.32", "200.0")
    calculateChange("51.11", "75.0")
    calculateChange("138.78", "500.0")

}

fun calculateChange(priceStr: String, cashStr: String) {
    val denominations = listOf(100.0, 50.0, 20.0, 10.0, 5.0, 1.0, 0.25, 0.10, 0.05, 0.01)
    val denominationNames = listOf(
        "HUNDRED",
        "FIFTY",
        "TWENTY",
        "TEN",
        "FIVE",
        "ONE",
        "QUARTER",
        "DIME",
        "NICKEL",
        "PENNY",
    )

    println("---------------------------------")
    println("Calculate change: price=$priceStr cash=$cashStr")
    val price = priceStr.toDouble()
    val cash = cashStr.toDouble()

    var changeAmount = cash - price
    println(changeAmount)

    val change = mutableMapOf<String, Int>()

    denominations.forEachIndexed { index, denomination ->
        val count = (changeAmount / denomination).toInt()
        if (count > 0) {
            change[denominationNames[index]] = count
            changeAmount -= count * denomination
        }
    }

    println(change)
    println()
}
