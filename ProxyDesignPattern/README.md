### Proxy Design Pattern

In proxy design pattern a proxy class is created that controls access to real object, and provides additional functionality to the object.

Components in the code:

WeatherThirdParty: A replica of a third party api\
WeatherApi: An interface with some methods from WeatherThirdParty that are used in app\
WeatherThirdPartyApi: This class implements WeatherApi interface\
CachedWeatherApi: A proxy class that implements WeatherApi interface, and it has reference to WeatherThirdPartyApi class and it provides additional functionality of caching on WeatherThirdPartyApi object\
ProxyDesignPattern: Client code that uses Proxy class  



