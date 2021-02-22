package finalway

class Honey(override var tea: Tea):AddOnDecorator(){
    private val honeyCost=4
    override var description: String = "${tea.description} , Honey"

    override fun cost(): Int {
        return tea.cost() + honeyCost
    }
}
class Ginger(override var tea: Tea):AddOnDecorator(){
    private val gingerCost=3
    override var description: String = "${tea.description} , Ginger"

    override fun cost(): Int {
        return tea.cost() + gingerCost
    }
}