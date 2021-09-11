package factory.firstway
//this class is responsible for creating a pizza based on type provided
 class SimplePizzaFactory{
     fun createPizza(type: String):Pizza{
        var pizza:Pizza?=null  // parent class reference
        if(type == "cheese"){  // if type is cheese then return cheese pizza
            pizza =CheezePizza()
        }else if (type == "peporoni"){
            pizza =PeproniPizza()
        }
        return pizza!!
    }
}