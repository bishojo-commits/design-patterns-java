package com.bishojo.designpatterns.observer_buildin.test;

import com.bishojo.designpatterns.observer_buildin.data.TemperatureData;
import com.bishojo.designpatterns.observer_buildin.display.CurrentTemperatureDisplay;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeatherStationTest extends AbstractStreamTest {

    private final TemperatureData temperatureData = new TemperatureData();
    private final CurrentTemperatureDisplay temperatureDisplay = new CurrentTemperatureDisplay();

    @Test
    @DisplayName("testPropertyChangedDisplayed")
    public void testPropertyChangedDisplayed() {
        temperatureData.addObserver(temperatureDisplay);
        temperatureData.setTemperature(40.00F);

        Assertions.assertEquals(
                "Temperature changed from " + 30.00F +
                        " to " + 40.00F + ".",
                outContent.toString().trim()
        );
    }
}
