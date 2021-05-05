package factory.firstway
public class SimplePizzaFactory{
    public fun createPizza(type: String):Pizza{
        var pizza:Pizza?=null
        if(type == "cheese"){
            pizza =CheezePizza()
        }else if (type == "peporoni"){
            pizza =PeproniPizza()
        }
        return pizza!!
    }
}