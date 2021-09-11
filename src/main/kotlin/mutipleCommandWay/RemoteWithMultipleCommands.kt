package mutipleCommandWay

import Command

class RemoteWithMultipleCommands {
   private val buttonsCount =4
    private     val offCommands: Array<Command> = Array(buttonsCount) { NoCommand() }
    private val onCommands: Array<Command> = Array(buttonsCount) { NoCommand() }

    fun setCommand( slot:Int,onCommand:Command,offCommand: Command){
        if(slot>buttonsCount-1)
        {
            print("wrong slot")
            return
        }
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }
    fun onButtonWasPushed(slot:Int){
        onCommands[slot].execute()
    }
    fun offButtonWasPushed(slot:Int){
        offCommands[slot].execute()
    }
}