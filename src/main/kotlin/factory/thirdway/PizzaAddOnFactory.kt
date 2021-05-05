package factory.thirdway

public interface PizzaAddOnFactory {
    fun createDough():Dough
    fun createSauce():Sauce
    fun createCheese():Cheese
    fun createVegie():List<Vegie>
    fun createPepperoni():Pepperoni
    fun createCalm():Calm
}

class NyPizzaAddOnFactory:PizzaAddOnFactory{
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return BlackSauce()
    }

    override fun createCheese(): Cheese {
       return GravyCheese()
    }

    override fun createVegie(): List<Vegie> {
        return listOf(Tomato(),Onion())
    }

    override fun createPepperoni(): Pepperoni {
       return DilutedPepperoni()
    }

    override fun createCalm(): Calm {
       return FreshCalm()
    }

}