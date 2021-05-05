package factory.secondway

import factory.firstway.Pizza

class IndiaPizzaStore :PizzaStore(){
    override fun createPizza(type: String): Pizza {
       if(type == "cheese"){
           return IndiaCheezePizza()
       }else
           return IndiaVegiePizza()
    }
}
class IndiaCheezePizza:Pizza(){
    override fun prepare() {
        println("prepare india cheese pizza")
    }

    override fun bake() {
        println("bake india cheese pizza")
    }

    override fun cut() {
        println("cut india cheese pizza")
    }

    override fun box() {
        println("box india cheese pizza")
    }

}
class IndiaVegiePizza:Pizza(){
    override fun prepare() {
        println("prepare india Vegie pizza")
    }

    override fun bake() {
        println("bake india Vegie pizza")
    }

    override fun cut() {
        println("cut india Vegie pizza")
    }

    override fun box() {
        println("box india Vegie pizza")
    }

}