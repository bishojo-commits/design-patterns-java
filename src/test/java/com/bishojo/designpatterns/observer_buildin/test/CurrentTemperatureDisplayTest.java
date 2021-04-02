package com.bishojo.designpatterns.observer_buildin.test;

import com.bishojo.designpatterns.observer_buildin.display.CurrentTemperatureDisplay;
import com.bishojo.designpatterns.test.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.beans.PropertyChangeEvent;

public class CurrentTemperatureDisplayTest extends AbstractStreamTest {

    private final PropertyChangeEvent changeEvent = Mockito.mock(PropertyChangeEvent.class);
    private final CurrentTemperatureDisplay temperatureDisplay = new CurrentTemperatureDisplay();

    @Test
    @DisplayName("testPropertyChangedDisplayed")
    public void testPropertyChangedDisplayed() {
        temperatureDisplay.propertyChange(changeEvent);

        Assertions.assertEquals(
                "Temperature changed from " + changeEvent.getOldValue() +
                        " to " + changeEvent.getNewValue() + ".",
                outContent.toString().trim()
        );
    }
}
