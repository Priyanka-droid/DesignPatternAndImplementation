package ProxyDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// proxy class 
public class CachedWeatherApi implements WeatherApi{

    private Map<String, Double> cachedWeatherMap= new HashMap<String, Double>();
    private WeatherThirdPartyApi w;
    private List<String> cachedCityList=new ArrayList<String>();
    public CachedWeatherApi(WeatherThirdPartyApi w){
        this.w=w;
    }
    @Override
    public Double getTemp(String city) {
        Double temp=cachedWeatherMap.get(city);
        if(temp==null)
        { temp=w.getTemp(city);
            cachedWeatherMap.put(city, temp);
        }
        return temp;
         
    }

    @Override
    public List<String> listCities() {
        if(cachedCityList.isEmpty()){
            cachedCityList.addAll(w.listCities());
            
        }
        return cachedCityList;
        
    }
    
}
