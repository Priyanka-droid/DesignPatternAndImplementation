package ProxyDesignPattern;

import java.util.List;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        WeatherThirdParty wt= new WeatherThirdParty();
        WeatherThirdPartyApi w= new WeatherThirdPartyApi(wt);
        CachedWeatherApi c= new CachedWeatherApi(w);
        List<String> cityList= c.listCities();
        for (String city : cityList) {
            Double temp =c.getTemp(city);
            System.out.printf("%s:%f\n", city,temp);
        }
        for (String city : cityList) {
            Double temp =c.getTemp(city);
            System.out.printf("%s:%f\n", city,temp);
        }
    }
}
