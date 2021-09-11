class Light {
    fun on() {
        println("light is on now")
    }

    fun off() {
        println("light is off now")
    }
}

interface Command {
    fun execute()
}

class LightOnCommand(val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}

class RemoteControl() {
    private var command: Command? = null
    fun setCommand(command: Command) {
        this.command = command
    }

    fun buttonPressed() {
        command?.execute()
    }
}

fun main(args: Array<String>) {
    val light = Light()
    val lightOnCommand = LightOnCommand(light)
    val remote = RemoteControl()
    remote.setCommand(lightOnCommand)
    remote.buttonPressed()
}

