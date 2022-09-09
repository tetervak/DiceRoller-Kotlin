package ca.tetervak.diceroller.model

// All saved rolls
class RollingHistory() {

    private val _rolls = mutableListOf<RollData>()

    val rolls get() : List<RollData> = _rolls

    val count get() = _rolls.size

    fun add(rollData: RollData) {
        _rolls.add(rollData)
    }

    val total: Int
        get() {
            var sum = 0
            for (item in rolls) {
                sum += item.total
            }
            return sum
        }

}
