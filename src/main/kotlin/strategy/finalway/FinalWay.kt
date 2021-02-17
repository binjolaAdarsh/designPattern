package strategy.finalway

import strategy.finalway.behaviours.FlySlow

/*
 *now in this way we will use one of the design principle and that is "Identify the aspects of your application that vary and
 *  separate them from what stays the same" -> this means that take part that vary and encapsulate them,so later you can alter/extend the parts that
 * vary without affecting those that dont
 *
 * fly and quack behaviour changes to we will encapsulate them
 * here we also want to achive dynamic changing in behavior that can be done by implementing one Design Principle and that is
 * "Program to an interface ,not an implementation
 */

fun main (args:Array<String>){
    val redDuck: Duck = RedDuck()

    redDuck.apply {
        display()
        performQuack()
        swim()
        performFly()
    }
    val rubberDuck =  RubberDuck()
    rubberDuck.apply {
        display()
        performQuack()
        swim()
        performFly()
    }
//    now redDuck flySlow
    println("changing redDuck fly behaviour")
    redDuck.flyBehaviour=FlySlow()
    redDuck.performFly()

}

// the main advantage of this approach is that we can change any duck behaviour at runtime for eg flyBehaviour = FlySlow()
// if we want to change the logic of any behaviour then we only have to change one file
