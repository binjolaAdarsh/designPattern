package factory.thirdway

abstract class Pizza {

     var  name :String?=null
     var  dough :Dough?=null
     var  sauce :Sauce?=null
     var  vagie :List<Vegie>?=null
     var  cheese :Cheese?=null
     var  pepperoni :Pepperoni?=null
     var  calm :Calm?=null

    abstract  fun prepare()

    fun bake(){
        println("bake for 20 min at 293")
    }
    fun cut(){
        println("cutting the pizza")
    }

    fun box(){
        println("place the pizza in box")
    }

}


class CheezePizza(var factory:PizzaAddOnFactory):Pizza(){
    override fun prepare() {
        dough = factory.createDough()
        cheese = factory.createCheese()
        calm = factory.createCalm()
        pepperoni = factory.createPepperoni()
        sauce = factory.createSauce()
        vagie = factory.createVegie()
    }

}

class NonCheezePizza(var factory:PizzaAddOnFactory):Pizza(){
    override fun prepare() {
        dough = factory.createDough()
        cheese = factory.createCheese()
        calm = factory.createCalm()
        pepperoni = factory.createPepperoni()
        sauce = factory.createSauce()
        vagie = factory.createVegie()
    }

}