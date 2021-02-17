package strategy.secondway


abstract class Duck {
    fun swim() {
        println("swimming.. like a charm :)")
    }

    // each duck type will have its own display way
    abstract fun display()

    // other methods
}
// creating different interface for fly  and which ever duck wants to fly will implement this
interface Flyable{
    fun fly()
}
// creating different interface for Quack sound which ever duck want to generate Quack sound will implement this
interface Quackable{
    fun quack()
}

class RedDuck : Duck(),Flyable,Quackable {
    override fun display() {
        println(" I am Red Duck")
    }

    override fun fly() {
        println("I can fly now... Wheee....")
    }

    override fun quack() {
        println("Quack!! Quack!!")
    }
}

class BlackDuck : Duck(),Flyable,Quackable {
    override fun display() {
        println(" I am Black Duck")
    }

    override fun fly() {
        println("I can fly now... Wheee....")
    }

    override fun quack() {
        println("Quack!! Quack!!")
    }
}


class RubberDuck : Duck(),Flyable,Quackable {
    override fun quack(){
        println("queek queek rubber sound!!")
    }
    override fun display() {
        println(" I am Rubber Duck")
    }

    override fun fly() {
        println("oops i cant fly!!!!")
    }
}
