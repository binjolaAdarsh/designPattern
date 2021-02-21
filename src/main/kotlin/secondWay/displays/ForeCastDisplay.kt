package secondWay.displays

import secondWay.Observer
import secondWay.WeatherData


class ForeCastDisplay(var weatherData: WeatherData) :Observer,DisplayElement {

    var temperature = 0.0f
    var humidity = 0.0f
    var pressure = 0.0f

   override fun update(temp: Float, humidity: Float, pressure: Float) {
        temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    // contains how to display to users
  override  fun display() {
        println("ForeCastDisplay:- temperature = $temperature, humidity = $humidity, pressure = $pressure")
    }

    init {
        weatherData.registerToService(this)
    }
}