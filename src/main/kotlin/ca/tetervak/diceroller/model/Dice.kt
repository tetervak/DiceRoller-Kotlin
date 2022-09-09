package ca.tetervak.diceroller.model

import java.lang.IllegalArgumentException
import kotlin.random.Random

// One die object, for values 1 .. 6
class Dice(
    private val initValue: Int = DEFAULT_INIT_VALUE,
    private val random: Random = Random.Default
) {

    companion object{
        const val DEFAULT_INIT_VALUE: Int = 1
    }

    var value: Int = initValue
        set(n) {
            if (n in 1..6) {
                field = n
            } else {
                throw IllegalArgumentException("Illegal die value $n")
            }
        }

    fun roll() {
        value = 1 + random.nextInt(6)
    }

    fun reset(){
        value = initValue
    }

    override fun toString() = "Die(value = $value)"
}
