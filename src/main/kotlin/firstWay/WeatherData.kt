package firstWay

import firstWay.displays.*
import secondWay.displays.GetWeatherData
import secondWay.displays.StatisticsDisplay
import secondWay.displays.ThirdPartyWeatherService

/*
We have weatherData class
suppose that temperature,humidity and pressure methods are already implemented
somewhere
 */
class WeatherData {
    private var weatherService: GetWeatherData = ThirdPartyWeatherService()

    private val currentConditionDisplay = CurrentConditionDisplay()
    private val forecastDisplay = ForeCastDisplay()
    private val statisticsDisplay = StatisticsDisplay()

    /*
    this is called when ever the weather measurement updated
    our job is to implement this method so that it updates 3 displays
    (current condition,weather state,forecast)
     */
    fun measurementChanged() {
        val temperature = weatherService.recentTemperature()
        val humidity = weatherService.recentHumidity()
        val pressure = weatherService.recentPressure()
        currentConditionDisplay.update(temperature, humidity, pressure)
        forecastDisplay.update(temperature, humidity, pressure)
        statisticsDisplay.update(temperature, humidity, pressure)
//        otherDisplay.update(temperature, humidity, pressure)
    }

}

/* problems in this code
 1.by coding to concrete implementation we have no way to add or remove other display
2. we are using the same method signature for all display update
 */