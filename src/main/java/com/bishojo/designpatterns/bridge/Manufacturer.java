package com.bishojo.designpatterns.bridge;

import com.bishojo.designpatterns.bridge.workshop.Assembly;
import com.bishojo.designpatterns.bridge.workshop.Production;

public class Manufacturer {
    public static void main(String[] args) {
        Vehicle car = new Car(new Production(), new Assembly());
        car.manufacture();

        Vehicle bike = new Bike(new Production(), new Assembly());
        bike.manufacture();
    }
}
