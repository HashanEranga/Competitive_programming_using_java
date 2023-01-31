package com.hashan.solid.d.solution;

public class DependencyInversionDemo {
    public static void main(String[] args) {
        WeatherSource[] weatherSources = {new AccWeatherApi(), new BbcWeatherApi()};
        WeatherAggregator weatherAggregator = new WeatherAggregator(weatherSources);
        System.out.println("Average temperature : " + weatherAggregator.getTemperature());
    }
}
