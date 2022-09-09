import ca.tetervak.diceroller.model.DiceGame
import kotlin.random.Random

fun main() {
    println("Hello Dice Game!")

    println("simpleGame")
    val simpleGame = DiceGame()
    println(simpleGame)
    repeat(3){
        simpleGame.roll()
        println(simpleGame)
    }
    simpleGame.reset()
    println(simpleGame)

    val fancyGame1 = DiceGame(4)
    println("fancyGame1")
    repeat(3){
        fancyGame1.roll()
        println(fancyGame1)
    }

    val fancyGame2 = DiceGame(numberOfDice = 5, Random(10))
    println("fancyGame2")
    repeat(3){
        fancyGame2.roll()
        println(fancyGame2)
    }
}
