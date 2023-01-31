package com.hashan.solid.d.problem;

public class WeatherAggregator {
    private final AccWeather accWeather = new AccWeather();
    private final BbcWeather bbcWeather = new BbcWeather();

    public double getTemperature(){
        return (toCelcius(accWeather.getTemperatureFarenheit()) + bbcWeather.getTemperatureCelcuis())/2;
    }

    private double toCelcius(double temperatureFarenheit) {
        return (temperatureFarenheit - 32) / 1.8f;
    }
}
