package finalway

abstract class Tea {
   open var description = "unknown chai"

    abstract  fun cost():Int
}

class BlackTea() : Tea() {
    init {
        description = "Black Tea"
    }
    override fun cost(): Int {
        return 5
    }
}

class MilkTea() : Tea() {
    init {
        description = "Milk Tea"
    }
    override fun cost(): Int {
        return 7
    }
}
