package mutipleCommandWay


fun main(){
        val kitchenLight:Light=KitchenLight()
        val livingRoomLight:Light=LivingRoomLight()
            val kitchenLightOnCommand = LightOnCommand(kitchenLight)
            val kitchenLightOffCommand = LightOffCommand(kitchenLight)

            val livingLightOnCommand = LightOnCommand(livingRoomLight)
            val livingLightOffCommand = LightOffCommand(livingRoomLight)
        val remote = RemoteWithMultipleCommands()
    remote.setCommand(0,kitchenLightOnCommand,offCommand = kitchenLightOffCommand)
    remote.setCommand(0,kitchenLightOnCommand,offCommand = kitchenLightOffCommand)
    remote.offButtonWasPushed(0)
    remote.onButtonWasPushed(0)
}