package com.bishojo.designpatterns.bridge;

import com.bishojo.designpatterns.bridge.workshop.Workshop;

public class Bike extends Vehicle {

    public Bike(Workshop production, Workshop assembly) {
        super(production, assembly);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike is getting manufactured...");
        production.work();
        assembly.work();
    }
}
