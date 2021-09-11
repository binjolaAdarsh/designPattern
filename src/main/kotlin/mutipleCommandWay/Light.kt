package mutipleCommandWay

import Command

 abstract class Light{
     abstract  fun getDescription():String
 open fun on(){
        println("${getDescription()} lights on")
    }
 open fun off(){
        println("${getDescription()} light off")
    }
}
class KitchenLight:Light(){
    override fun getDescription():String {
        return "kitchen"
    }
}

class LivingRoomLight:Light(){
    override fun getDescription():String {
        return "living room"
    }
}

class LightOnCommand(val light: Light):Command{
    override fun execute() {
        light.on()
    }
}

class LightOffCommand(val light: Light):Command{
    override fun execute() {
        light.off()
    }
}
