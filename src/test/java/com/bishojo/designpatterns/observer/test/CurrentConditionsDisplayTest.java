package com.bishojo.designpatterns.observer.test;

import com.bishojo.designpatterns.observer.data.WeatherData;
import com.bishojo.designpatterns.observer.display.CurrentConditionsDisplay;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CurrentConditionsDisplayTest extends AbstractStreamTest {

    private final WeatherData weatherData = new WeatherData();
    private final CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

    @Test
    @DisplayName("testConstructorInitializesWeatherData")
    public void testConstructorInitializesWeatherData() {
        Assertions.assertEquals(display.getWeatherData(), weatherData);
    }

    @Test
    @DisplayName("testConstructorRegistersObserver")
    public void testConstructorRegistersObserver() {
        Assertions.assertEquals(weatherData.getObservers().size(), 1);
    }

    @Test
    @DisplayName("testUpdateMethodSetsMeasurementData")
    public void testUpdateMethodSetsMeasurementData() {
        display.update(80, 40, 1000);

        Assertions.assertEquals(80, display.getTemperature());
        Assertions.assertEquals(40, display.getHumidity());
    }

    @Test
    @DisplayName("testDisplayDataPrintsOutData")
    public void testDisplayDataPrintsOutData() {
        display.display();

        Assertions.assertEquals(
                "Current conditions: " + display.getTemperature() + "F degrees and"
                        + display.getHumidity() + "% humidity",
                outContent.toString().trim()
        );
    }
}
