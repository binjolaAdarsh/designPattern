package firstWay.displays

interface GetWeatherData {
    fun recentTemperature(): Float
    fun recentHumidity(): Float
    fun recentPressure(): Float
}

class ThirdPartyWeatherService : GetWeatherData {
    override fun recentTemperature(): Float {
        val someTemperatures = floatArrayOf(30.0f, 29.6f, 40.3f, 45.5f)
        return someTemperatures.random()
    }

    override fun recentHumidity(): Float {
        val someHumidity = floatArrayOf(8.0f, 8.29f, 7.64f, 5.87f)
        return someHumidity.random()
    }

    override fun recentPressure(): Float {
        val somePressure = floatArrayOf(67f, 102f, 49.6f, 89.86f)
        return somePressure.random()
    }
}
