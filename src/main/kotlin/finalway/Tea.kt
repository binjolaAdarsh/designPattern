package finalway

abstract class Tea {
   open var description = "unknown chai"
    // every child will implement and create its logic
    abstract  fun cost():Int
}

class BlackTea() : Tea() {
    init {
        description = "Black Tea"
    }
    override fun cost(): Int {
        return 5    // simply return black tea cost
    }
}

class MilkTea() : Tea() {
    init {
        description = "Milk Tea"
    }
    override fun cost(): Int {
        return 7   // simply return milk tea cost
    }
}
