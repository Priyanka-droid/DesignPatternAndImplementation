package ProxyDesignPattern;

import java.util.List;

// internal wrapper :third party api class 
public class WeatherThirdPartyApi implements WeatherApi {

    private WeatherThirdParty w;

    WeatherThirdPartyApi(WeatherThirdParty w) {
        this.w = w;
    }

    @Override
    public Double getTemp(String city) {
        return w.getTemp(city);
    }

    @Override
    public List<String> listCities() {
        return w.listCities();
    }

}
