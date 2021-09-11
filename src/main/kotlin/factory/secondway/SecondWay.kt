package factory.secondway

/**
 *  by this approach we can create different types of pizza store shops based on their taste and location
 *  IndiaPizzaStore > PizzaStore
 *  IndiaPizzaStore is responsible for creating the pizza
 */
fun main (){
    val store:PizzaStore =IndiaPizzaStore()
    store.orderPizza("chehhese")

}