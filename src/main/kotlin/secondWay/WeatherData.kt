package secondWay

import firstWay.displays.*
import secondWay.displays.CurrentConditionDisplay
import secondWay.displays.ForeCastDisplay
import secondWay.displays.GetWeatherData
import secondWay.displays.ThirdPartyWeatherService

/*
We have weatherData class
suppose that temperature,humidity and pressure methods are already implemented
somewhere
 */
class WeatherData : Subject {
    private var weatherService: GetWeatherData = ThirdPartyWeatherService()
    private var temperature = weatherService.recentTemperature()
    private var humidity = weatherService.recentHumidity()
    private var pressure = weatherService.recentPressure()

    val observerList = mutableListOf<Observer>()

    /*
    this is called when ever the weather measurement updated
    our job is to implement this method so that it updates 3 displays
    (current condition,weather state,forecast)
     */
    fun measurementChanged() {

        temperature = weatherService.recentTemperature()
        humidity = weatherService.recentHumidity()
        pressure = weatherService.recentPressure()
        notifyEveryone()
//        otherDisplay.update(temperature, humidity, pressure)
    }

    override fun registerToService(o: Observer) {
        observerList.add(o)
    }

    override fun unregisterFromService(o: Observer) {
        if (observerList.isNotEmpty())
            observerList.remove(o)
    }

    override fun notifyEveryone() {
        observerList.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

}

/* problems in this code
 1.by coding to concrete implementation we have no way to add or remove other display
2. we are using the same method signature for all display update
 */