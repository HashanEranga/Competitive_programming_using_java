package com.hashan.solid.d.solution;

public class AccWeatherApi implements WeatherSource{
    @Override
    public double getTemperatureToCelcius() {
        return toCelcius(getTemperatureToFarenheit());
    }

    private double toCelcius(double temperatureToFarenheit) {
        return (temperatureToFarenheit - 32) / 1.8f;
    }

    private double getTemperatureToFarenheit() {
        return 120;
    }
}
