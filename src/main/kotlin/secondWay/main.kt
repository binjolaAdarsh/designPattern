import secondWay.displays.StatisticsDisplay
import secondWay.WeatherData
import secondWay.displays.CurrentConditionDisplay
import secondWay.displays.ForeCastDisplay

/*
we will use observer pattern
it defines 1 to many dependency between objects so that when one changes
all its dependents are notified and updated automatically

with the observer pattern we can have the power of loose coupling
2 object can interact but have very other knowledge of each other

some important points
1) the only thing the subject knows about an observer is that it implements a certain interface
2) we can add new observer at any time
3) we never need to modify the subject to add new type of observer
4) we can reuse subjects or observers independently of each other
5) changes to either the subject or an observer will not affect the other

DESIGN PRINCIPLE covered =  strive for loosely coupled designs between objects that interact
 */
fun main(args: Array<String>) {

    val weatherData = WeatherData()
    weatherData.measurementChanged()// till now no one is registered

    // creating new display type and registering it to weatherData
    val currentConditionDisplay = CurrentConditionDisplay(weatherData)
    // change happened update the displays (only 1 will get updated)
    weatherData.measurementChanged()
    // adding 2 new displays and registering them to weatherData service
    val forecastDisplay = ForeCastDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)

    weatherData.measurementChanged()
    // statistics display dont want any new update now so unregistered it
    weatherData.unregisterFromService(statisticsDisplay)
    // this will update the displays (only 2 display will now get update because)
    // statistics display is already unregistered
    weatherData.measurementChanged()

}