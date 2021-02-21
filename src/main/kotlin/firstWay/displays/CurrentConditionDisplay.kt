package firstWay.displays


class CurrentConditionDisplay {
    var temperature = 0.0f
    var humidity = 0.0f
    var pressure = 0.0f

    fun update(temp: Float, humidity: Float, pressure: Float) {
        temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    // contains how to display to users
    fun display() {
        println("CurrentConditionDisplay:- temperature = $temperature, humidity = $humidity, pressure = $pressure")
    }
}