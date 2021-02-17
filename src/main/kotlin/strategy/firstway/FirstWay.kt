package strategy.firstway



// we have a game of ducks in which we have different types of ducks
// suppose there is a common class for ducks which contains all common functionalities

//now requirement came to add feature of fly for ducks

fun main (args:Array<String>){
    val redDuck: Duck = RedDuck()
        callActions(redDuck)
    // when i create rubber duck and call its actions i see the problem then
     val rubberDuck: Duck =  RubberDuck()
    callActions(rubberDuck)
}


// the problem with adding  new feature in the base class is new feature cant be implemented to all subclasses like rubberDuck here
// we can solve this by making overriding the fly function in  rubberDuck class like we are doing for the quack ()
// but what will happen when we will hack woodDuck in future  that doesnt fly or make sound
// lets do it in 2nd way


