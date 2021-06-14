package com.bishojo.designpatterns.observer_buildin;

import com.bishojo.designpatterns.observer_buildin.data.TemperatureData;
import com.bishojo.designpatterns.observer_buildin.display.CurrentTemperatureDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        TemperatureData temperatureData = new TemperatureData();
        CurrentTemperatureDisplay currentTemperatureDisplay = new CurrentTemperatureDisplay();

        temperatureData.addObserver(currentTemperatureDisplay);
        temperatureData.setTemperature(28.00f);
    }
}
