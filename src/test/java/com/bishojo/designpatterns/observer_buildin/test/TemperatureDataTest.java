package com.bishojo.designpatterns.observer_buildin.test;

import com.bishojo.designpatterns.observer_buildin.data.TemperatureData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.beans.PropertyChangeListener;

public class TemperatureDataTest {

    private final TemperatureData temperatureData = new TemperatureData();
    private final PropertyChangeListener listener = Mockito.mock(PropertyChangeListener.class);

    @Test
    @DisplayName("testObserverAdded")
    public void testObserverAdded() {
        temperatureData.addObserver(listener);

        Assertions.assertTrue(
                temperatureData.getPropertyChangeSupport().hasListeners("temperature")
        );
    }

    @Test
    @DisplayName("testNewPropertySet")
    public void testNewPropertySet() {
        temperatureData.setTemperature(23.00F);

        Assertions.assertEquals(temperatureData.getTemperature(), 23.00F);
    }
}
