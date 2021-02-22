package finalway

abstract class AddOnDecorator:Tea() {
    open lateinit var tea: Tea
    abstract override var  description: String
}