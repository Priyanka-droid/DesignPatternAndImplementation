package ProxyDesignPattern;

import java.util.List;

/**
 * WeatherApi
 */
public interface WeatherApi {
    List<String> listCities();

    Double getTemp(String city);

}