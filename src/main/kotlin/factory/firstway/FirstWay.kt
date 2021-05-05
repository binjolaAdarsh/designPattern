package factory.firstway

fun main (args:Array<String>){
    val pizzaStore= PizzaStore(SimplePizzaFactory())
    pizzaStore.orderPizza("cheese")

}
class PizzaStore(private val factory: SimplePizzaFactory){
    fun orderPizza(type:String){
       val pizza =  factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
    }
}




