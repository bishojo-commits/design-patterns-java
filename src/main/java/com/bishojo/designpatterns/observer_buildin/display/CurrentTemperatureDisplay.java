package com.bishojo.designpatterns.observer_buildin.display;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentTemperatureDisplay implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Temperature changed from " + evt.getOldValue() +
                " to " + evt.getNewValue() + ".");
    }
}
