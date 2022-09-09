package ca.tetervak.diceroller.model

import kotlin.random.Random

// Rolls dice objects and calculates the total of the roll
class DiceGame(
    val numberOfDice: Int = DEFAULT_NUMBER_OF_DICE,
    private val random: Random = Random.Default
) {
    companion object {
        const val DEFAULT_NUMBER_OF_DICE: Int = 3
    }

    private val dice: List<Dice>;

    init{
        dice = List(numberOfDice) {
            Dice(Dice.DEFAULT_INIT_VALUE, random)
        }
    }


    var isRolled: Boolean = false
        private set

    val rollData: RollData?
    get(){
        return if(isRolled){
            RollData(
                dice.map { die -> die.value },
                total
            )
        }else null
    }

    val total: Int
        get() {
            return if (isRolled) {
                var sum = 0
                for (die in dice) {
                    sum += die.value
                }
                sum
            } else 0
        }

    fun roll() {
        for (die in dice) {
            die.roll()
        }
        isRolled = true
    }

    fun reset() {
        for (die in dice) {
            die.reset()
        }
        isRolled = false
    }

    override fun toString() = "DiceGame(isRolled = $isRolled, numberOfDice = $numberOfDice, rollData = ${rollData ?: "empty"})"
}
