package ProxyDesignPattern;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

//external third party library mock.
public class WeatherThirdParty {

    private Map<String, Double> weatherMap = new HashMap<String, Double>();

    public WeatherThirdParty() {
        weatherMap.put("mumbai", 45.89);
        weatherMap.put("delhi", 52.5);
        weatherMap.put("bangalore", 28.1);

    }

    public List<String> listCities() {
        System.out.println("fetching from third party....");
        return new ArrayList<String>(weatherMap.keySet());
    }

    public Double getTemp(String city) {
        System.out.println("fetching from third party....");
        return weatherMap.get(city.toLowerCase());
    }
}
