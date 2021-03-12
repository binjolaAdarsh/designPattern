import secondWay.MilkTea

// using inheritance

fun main(args: Array<String>) {
    val milkTea= MilkTea()
    println("${milkTea.description} , ${milkTea.cost()}Rs")
    milkTea.hasHoney =true
    milkTea.hasGinger =true
    println("${milkTea.description} , ${milkTea.cost()}Rs")

}

/*
    Problems
    1 if price changes for toppings will make us to change the code
    2 new toppings will force us to create new methods and change the cost method in super class
    3 we may have new type of Tea (Green Tea) so it might be inappropriate to add honey in green  tea but it still having that
      behaviour coz Green tea is subclass of tea
    4 what if the customer want 2 extra honey dips in tea
 */
