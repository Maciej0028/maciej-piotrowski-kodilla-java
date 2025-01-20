package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double averageTemperature() {
        double average = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }
        return average / temperatures.getTemperatures().size();
    }

    public double medianTemperature() {
        List<Double> list = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(list);
        if (list.size() % 2 != 0) {
            return list.get(list.size() / 2);
        } else {
            return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        }
    }
}
