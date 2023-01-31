package com.hashan.solid.d.problem;

public class DependancyInversionDemo {
    public static void main(String[] args) {
        WeatherAggregator weatherAggregator = new WeatherAggregator();
        System.out.println(weatherAggregator.getTemperature());
    }
}
