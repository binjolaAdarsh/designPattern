package factory.secondway

import factory.firstway.Pizza

/**
 * every new pizza store class will extend the PizzaStore class and create its own pizza
 */
abstract class PizzaStore {
    fun orderPizza(type:String):Pizza{
        val pizza:Pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
    // child class is resposible to create their own type of pizza
    abstract fun createPizza(type:String):Pizza
}