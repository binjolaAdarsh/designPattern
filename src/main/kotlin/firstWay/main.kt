import firstWay.GingerWithMilkTea
import firstWay.MilkTea

/**
 * in this first type of approach we have to create separate class for different
 * topping with different type of combinations
 * this type of way can lead to numerous number of classes that leads to
 * maintenance disaster
 */
fun main(args: Array<String>) {
    val milkTea=MilkTea()
    println("${milkTea.description} , ${milkTea.cost()}Rs")
    val gingerWithMilkTea=GingerWithMilkTea()
    println("${gingerWithMilkTea.description} , ${gingerWithMilkTea.cost()}Rs")
}