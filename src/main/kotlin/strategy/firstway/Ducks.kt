package strategy.firstway


abstract class Duck {

    open fun quack() {
        println("quack!! quack!!")
    }

    fun swim() {
        println("swimming.. like a charm :)")
    }

    // each duck type will have its own display way
    abstract fun display()

    fun fly() {
        println("I can fly now .. wheee...")
    }
    // other methods
}

class RedDuck : Duck() {
    override fun display() {
        println(" I am Red Duck")
    }
}

class BlackDuck : Duck() {
    override fun display() {
        println(" I am Black Duck")
    }
}


class RubberDuck : Duck() {
    override fun quack(){
        println("queek queek rubber sound!!")
    }
    override fun display() {
        println(" I am Rubber Duck")
    }
}
fun callActions(duckType: Duck){
    duckType.apply {
        display()
        quack()
        swim()
        fly()
    }
}