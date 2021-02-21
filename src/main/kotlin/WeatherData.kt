/*
We have weatherData class


 */
class WeatherData {
    fun getTemperature() {}
    fun getHumidity() {

    }

    fun getPressure() {

    }

    /*
    this is called when ever the weather measurement updated
    our job is to implement this method so that it updates 3 displays
    (current condition,weather state,forecast)
     */
    fun measurementChanged() {

    }

    /*
    also we need to implement 3display types that use  the weatherData
    1 current conditions display,statistics display, forecast display
    these must be updated each time weatherData is new measurement

    the system must be expandable other developers can create new custom display
    user can add/remove as many display as they want. for now lets create for 3 display types
     */
}