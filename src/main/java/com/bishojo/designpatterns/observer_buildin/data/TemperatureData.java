package com.bishojo.designpatterns.observer_buildin.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TemperatureData {

    private float temperature = 30.00f;
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addObserver(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener("temperature", propertyChangeListener);
    }

    public void setTemperature(float temperature) {
        float unchangedTemperature = this.temperature;
        this.temperature = temperature;
        propertyChangeSupport.firePropertyChange("temperature", unchangedTemperature, this.temperature);
    }

    public float getTemperature() {
        return temperature;
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }
}
