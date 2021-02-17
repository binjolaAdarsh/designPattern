package strategy

// we have a game of ducks in which we have different types of ducks
// suppose there is a common class for ducks which contains all common functionalities

fun main (args:Array<String>){
    val redDuck=RedDuck()
    redDuck.apply {
     quack()
     swim()
    }
}
abstract class Duck {

    fun quack(){
        println("quack!! quack!!")
    }

    fun swim(){
        println("swimming.. like a charm :)")
    }

    // each duck type will have its own display way
    abstract  fun display()


    // other methods
}

class RedDuck: Duck() {
    override fun display() {
        println(" I am Red Duck")
    }
}

class BlackDuck: Duck() {
    override fun display() {
        println(" I am Black Duck")
    }
}
