import firstWay.GingerWithMilkTea
import firstWay.MilkTea

fun main(args: Array<String>) {
    var milkTea=MilkTea()
    println("${milkTea.description} , ${milkTea.cost()}Rs")
    var gingerWithMilkTea=GingerWithMilkTea()
    println("${gingerWithMilkTea.description} , ${gingerWithMilkTea.cost()}Rs")
}