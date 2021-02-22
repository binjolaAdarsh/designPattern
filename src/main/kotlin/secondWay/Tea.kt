package secondWay

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
