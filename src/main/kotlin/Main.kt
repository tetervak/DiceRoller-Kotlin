import ca.tetervak.diceroller.model.DiceGame
import ca.tetervak.diceroller.model.RollData
import kotlin.random.Random

fun main() {
    println("Hello Dice Game!")

    println("== simpleGame ===")
    val simpleGame = DiceGame()
    println("before roll: $simpleGame")
    repeat(3){
        simpleGame.roll()
        println("rolled: $simpleGame")
    }
    simpleGame.reset()
    println("after reset: $simpleGame")

    val fancyGame1 = DiceGame(4)
    println("=== fancyGame1 ===")
    repeat(3){
        fancyGame1.roll()
        println("rolled: $fancyGame1")
    }

    val fancyGame2 = DiceGame(numberOfDice = 5, Random(10))
    println("=== fancyGame2 ===")
    repeat(3){
        fancyGame2.roll()
        println("rolled: $fancyGame2")
    }

    val fancyGame3 = DiceGame(RollData(listOf(3,4,1,2,6)))
    println("=== fancyGame3 ===")
    println("constructed: $fancyGame3")
}
