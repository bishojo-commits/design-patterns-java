package com.bishojo.designpatterns.observer.test;

import com.bishojo.designpatterns.observer.data.WeatherData;
import com.bishojo.designpatterns.observer.display.CurrentConditionsDisplay;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeatherStationTest extends AbstractStreamTest {

    private final WeatherData weatherData = new WeatherData();
    private final CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

    @Test
    @DisplayName("testWeatherDataChangesDisplayedCurrent")
    public void testWeatherDataChangesDisplayedCurrent() {

        weatherData.setMeasurementData(90, 40, 1023);

        Assertions.assertEquals(
                "Current conditions: " + weatherData.getTemperature() + "F degrees and"
                        + weatherData.getHumidity() + "% humidity",
                outContent.toString().trim()
        );
    }
}
