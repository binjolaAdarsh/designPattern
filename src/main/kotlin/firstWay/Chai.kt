package firstWay

abstract class Tea {
    var description = "unknown chai"
    abstract fun cost(): Int
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

class GingerWithMilkTea() : Tea() {
    init {
        description = "milk with ginger Tea"
    }
    override fun cost(): Int {
        return 10
    }
}

class GingerWithBlackTea() : Tea() {
    init {
        description = "milk with ginger chai"
    }
    override fun cost(): Int {
        return 8
    }
}

