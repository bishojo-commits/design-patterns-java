package com.bishojo.designpatterns.observer.test;

import com.bishojo.designpatterns.observer.Observer;
import com.bishojo.designpatterns.observer.data.WeatherData;
import com.bishojo.designpatterns.observer.display.CurrentConditionsDisplay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class WeatherDataTest {

    private final WeatherData weatherData = new WeatherData();
    private final WeatherData weatherDataEmpty = new WeatherData();
    private ArrayList<Observer> observers = new ArrayList<>();
    private final CurrentConditionsDisplay display = Mockito.mock(CurrentConditionsDisplay.class);

    @Test
    @DisplayName("testConstructorInitializesObserverArrayList")
    public void testObserverInitialized() {

        Assertions.assertEquals(weatherData.getObservers(), observers);
    }

    @Test

    @DisplayName("testObserverRegistered")
    public void testObserverRegistered() {
        weatherData.registerObserver(display);
        Assertions.assertEquals(weatherData.getObservers().size(), 1);
    }

    @Test
    @DisplayName("testObserverRemoved")
    public void testObserverRemoved() {
        weatherData.removeObserver(display);
        Assertions.assertEquals(weatherData.getObservers().size(), 0);
    }

    @Test
    @DisplayName("testObserverNotRemovedIfArrayListEmpty")
    public void testObserverNotRemoved() {
        weatherDataEmpty.removeObserver(display);
        Assertions.assertEquals(weatherDataEmpty.getObservers().size(), 0);
    }

    @Test
    @DisplayName("testNotifyObservers")
    public void testObserverNotified() {
        weatherData.registerObserver(display);
        weatherData.registerObserver(display);

        weatherData.notifyObservers();

        verify(display, times(2)).update(0, 0, 0);
    }

    @Test
    @DisplayName("testMeasurementDataSet")
    public void testMeasurementDataSet() {
        weatherData.setMeasurementData(80,40, 1000);

        Assertions.assertEquals(80, weatherData.getTemperature());
        Assertions.assertEquals(40, weatherData.getHumidity());
        Assertions.assertEquals(1000, weatherData.getPressure());
    }
}
