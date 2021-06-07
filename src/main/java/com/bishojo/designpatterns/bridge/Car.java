package com.bishojo.designpatterns.bridge;

import com.bishojo.designpatterns.bridge.workshop.Workshop;

public class Car extends Vehicle {

    public Car(Workshop production, Workshop assembly) {
        super(production, assembly);
    }

    @Override
    public void manufacture() {
        System.out.println("Car is getting manufactured...");
        production.work();
        assembly.work();
    }
}
