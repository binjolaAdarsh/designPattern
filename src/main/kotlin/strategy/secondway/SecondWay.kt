package strategy.secondway



/*
* the second approach can be using interface
* we could take the fly () out of Duck superclass make it Flyable interface
* and now which ever the Duck wants to fly will implement fly interface
* */
fun main (args:Array<String>){
    val redDuck: RedDuck = RedDuck()
    redDuck.apply {
        display()
        quack()
        swim()
        fly()
    }
    val rubberDuck =  RubberDuck()
    rubberDuck.apply {
        display()
        quack()
        swim()
        fly()
    }

}

// the problem with this interface way is that will be  duplicate code every where(in other duck class "i can fly now ... Wheee....")
//if we want to change the fly behaviour then we have change it in multiple class

/*

In this we have discussed 3 design principle

1.Identify the aspects of your application that vary and separate them from what stays the same.

2.Program to an interface ,not an implementation

3.Favor composition over inheritance

*/
