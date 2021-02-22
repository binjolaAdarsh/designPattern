package finalway


// using decorator pattern

fun main(args: Array<String>) {

    var milkTea=MilkTea() // normal tea with milk
    println("${milkTea.description} , ${milkTea.cost()}Rs")

    // add topping
    val withHoney=Honey(milkTea)
    println("${withHoney.description} , ${withHoney.cost()}Rs")

    val withGinger = Ginger(milkTea)
    println("${withGinger.description} , ${withGinger.cost()}Rs")

    val withGingerAndHoney = Honey(withGinger)
    println("${withGingerAndHoney.description} , ${withGingerAndHoney.cost()}Rs")
}
