package factory.thirdway

abstract class PizzaStore {
    fun orderPizza(type:String):Pizza{
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
    abstract fun createPizza(type: String):Pizza
}

class NyPizzaStore:PizzaStore(){
    override fun createPizza(type: String): Pizza {
        var pizza:Pizza?=null
        val addOnFactory:PizzaAddOnFactory= NyPizzaAddOnFactory()
        if(type == "cheeze"){
            pizza =  CheezePizza(addOnFactory)
            pizza.name = "Cheeze pizza"
        }else {
            pizza = NonCheezePizza(addOnFactory)
            pizza.name = "Non cheeze pizza"
        }
        return pizza
    }

}