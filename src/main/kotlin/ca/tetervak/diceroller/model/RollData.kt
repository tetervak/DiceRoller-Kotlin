package ca.tetervak.diceroller.model

import java.util.*

// The data from one roll
data class RollData(
    val values: List<Int>,
    val total: Int
)
