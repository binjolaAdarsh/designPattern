package strategy.finalway

import strategy.finalway.behaviours.*


abstract class Duck {
    fun swim() {
        println("swimming.. like a charm :)")
    }

    // each duck type will have its own display way
    abstract fun display()

    abstract var quackBehaviour:QuackBehaviour/*= NoSound()*/ // setting default behaviour as No sound
    abstract var flyBehaviour:FlyBehaviour/*= NoFly()*/ // setting default behaviour as cant fly

    fun performFly(){
        flyBehaviour.fly()
    }
    fun performQuack(){
        quackBehaviour.quack()
    }
    // other methods
}

class RedDuck : Duck() {



    override fun display() {
        println(" I am Red Duck")
    }

    override var quackBehaviour: QuackBehaviour = Quack()
    override var flyBehaviour: FlyBehaviour = FlyFast()

}

class BlackDuck : Duck(){
    override fun display() {
        println(" I am Black Duck")
    }
    override var quackBehaviour: QuackBehaviour = Quack()
    override var flyBehaviour: FlyBehaviour = FlySlow()
}


class RubberDuck : Duck() {
    override fun display() {
        println(" I am Rubber Duck")
    }
    override var quackBehaviour: QuackBehaviour = Queek()
    override var flyBehaviour: FlyBehaviour = NoFly()
}
