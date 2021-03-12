package secondWay

/**
 * here we are adding booleans to the parent class and making cost method
 * non abstract that means this cost method have implementation of cost.
 * What it calculates than? well it calculates the toppings price and return the
 * total topping price additions
 * this type of way will have multiple if else conditions in the main cost method
 */
abstract class Tea {
    var description = "unknown chai"

    var hasGinger:Boolean =false
    var hasHoney:Boolean =false
    var gingerCost = 3
    var honeyCost = 4
    open fun cost():Int{
        var finalCost =0
        if(hasGinger){
            finalCost += gingerCost
        }
        if(hasHoney){
            finalCost+=honeyCost
        }
        return finalCost
    }

}

class BlackTea() : Tea() {
    init {
        description = "Black Tea"
    }
    // unlike the first way we dont manually add and calculate the cost of topping here
    // rather we only know the black tea cost and for calculating the topping cost
    // we delegate the flow to the top base level class
    override fun cost(): Int {
        return 5 + super.cost()
    }
}

class MilkTea() : Tea() {
    init {
        description = "Milk Tea"
    }
    override fun cost(): Int {
        return 7 + super.cost()
    }
}
