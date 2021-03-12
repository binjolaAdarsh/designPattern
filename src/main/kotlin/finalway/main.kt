package finalway


// using decorator pattern
// we can add new functionality into existing object without changing it

fun main(args: Array<String>) {

    val milkTea=MilkTea() // normal tea with milk
    println("${milkTea.description} , ${milkTea.cost()}Rs")

    // add topping
    val withHoney=Honey(milkTea)
    println("${withHoney.description} , ${withHoney.cost()}Rs")

    val withGinger = Ginger(milkTea)
    println("${withGinger.description} , ${withGinger.cost()}Rs")

    val withGingerAndHoney = Honey(withGinger)
    println("${withGingerAndHoney.description} , ${withGingerAndHoney.cost()}Rs")
}
