package firstWay
// parent class for all tea type
abstract class Tea {
    var description = "unknown chai"
    abstract fun cost(): Int
}

// commonly tea type
class BlackTea() : Tea() {
    init {
        description = "Black Tea"
    }
    override fun cost(): Int {
        return 5 // return price of black tea
    }
}
// other tea type
class MilkTea() : Tea() {
    init {
        description = "Milk Tea"
    }
    override fun cost(): Int {
        return 7    // returns the price of milk tea
    }
}
// other tea type of milk tea only added with with ginger
class GingerWithMilkTea() : Tea() {
    init {
        description = "milk with ginger Tea"
    }

    // here we have to calculate the price of this type of tea manually (adding ginger)
    // in future if ginger price or milk price changes we have to change over here
    override fun cost(): Int {
        return 10 // return price of milk tea with added ginger
    }
}
// other black tea with ginger
class GingerWithBlackTea() : Tea() {
    init {
        description = "milk with ginger chai"
    }

    // manually add the black tea price and ginger price then return it
    override fun cost(): Int {
        return 8 //returns the price of black tea with ginger
    }
}

