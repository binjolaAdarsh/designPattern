package factory.secondway

import factory.firstway.Pizza

abstract class PizzaStore {
    fun orderPizza(type:String):Pizza{
        val pizza:Pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
    abstract fun createPizza(type:String):Pizza
}