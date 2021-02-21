package secondWay

/*
this is for  publishers(newspaper creator)
each subject can have many observer
 */
interface  Subject{
    fun registerToService(o:Observer)
    fun unregisterFromService(o:Observer)
    fun notifyEveryone()
}

/*
this is for subscribers(people who read newspaper)
 */
interface Observer{
    fun update(temp:Float,humidity:Float,pressure:Float)
}
