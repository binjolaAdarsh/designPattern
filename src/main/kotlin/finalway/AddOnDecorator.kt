package finalway

/**
 *  this is also a tea type but abstract
 * by creating this as abstract we get the power of adding the behavior in tea
 * at runtime but how? well if we want to add some new topping into existing tea
 * we simply create new Topping class and extend with this class (AddOnDecorator)
for eg
 ToppingX(addInto:Tea):AddOnDecorator {
    // initialize the tea variable of AddOnDecorator class with addInto
    // override the cost method  and description method over here

Why we are passing tea into new Topping so that we can get its variables
like we can get its cost,description etc
}
 */

abstract class AddOnDecorator:Tea() {
    open lateinit var tea: Tea
    abstract override var  description: String
}