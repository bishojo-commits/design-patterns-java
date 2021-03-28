package com.bishojo.designpatterns.observer.data;

import com.bishojo.designpatterns.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);

        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }

    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurementData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.measurementsChanged();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
