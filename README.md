Question 

Suppose there is a service which provide current weather data to us 
we have a WeatherData class that talks to this service and get the updated data
for now we dont have to care for how this class talks to the service

WeatherData class now have updated data and it displays it 
many different ways(current conditions,Weather Stats)

Our task is to use the weatherData to update different display types

also we need to implement 3display types that use  the weatherData
current conditions display, statistics display, forecast display
these must be updated each time weatherData is new measurement

    the system must be expandable other developers can create new custom display
    user can add/remove as many display as they want. for now lets create for 3 display types 
     