package strategy.finalway.behaviours

interface FlyBehaviour{
    fun fly()
}

interface  QuackBehaviour{
    fun quack()
}

class FlyFast:FlyBehaviour{
    override fun fly() {
        println("I can fly fast....")
    }
}

class  FlySlow:FlyBehaviour{
    override fun fly() {
        println("Its hard to fly but i am flying slowly...")
    }
}

class NoFly:FlyBehaviour{
    override fun fly() {
        println("Oops i cant fly")
    }
}

class Quack:QuackBehaviour{
    override fun quack() {
        println("Quack!! Quack!!")
    }
}

class Queek:QuackBehaviour{
    override fun quack() {
        println("Queek!! Qeek!!")
    }
}
class NoSound:QuackBehaviour{
    override fun quack() {
        println("Silent!!")
    }
}