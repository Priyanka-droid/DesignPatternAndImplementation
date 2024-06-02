### Proxy Design Pattern

In proxy design pattern a proxy class is created that controls access to real object, and provides additional functionality to the object.

Components in the code:

1. WeatherThirdParty: A replica of a third party api\
2. WeatherApi: An interface with some methods from WeatherThirdParty that are used in app\
3. WeatherThirdPartyApi: This class implements WeatherApi interface\
4. CachedWeatherApi: A proxy class that implements WeatherApi interface, and it has reference to WeatherThirdPartyApi class and it provides additional functionality of caching on WeatherThirdPartyApi object\
5. ProxyDesignPattern: Client code that uses Proxy class  



