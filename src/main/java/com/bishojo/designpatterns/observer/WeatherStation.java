package com.bishojo.designpatterns.observer;

import com.bishojo.designpatterns.observer.data.WeatherData;
import com.bishojo.designpatterns.observer.display.CurrentConditionsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurementData(90, 40, 1023);
        weatherData.setMeasurementData(80, 50, 1060);
    }
}
