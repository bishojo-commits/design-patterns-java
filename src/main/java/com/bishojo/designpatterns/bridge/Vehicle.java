package com.bishojo.designpatterns.bridge;

import com.bishojo.designpatterns.bridge.workshop.Workshop;

public abstract class Vehicle {

    protected Workshop production;
    protected Workshop assembly;

    protected Vehicle(Workshop production, Workshop assembly) {
        this.production = production;
        this.assembly = assembly;
    }

    public abstract void manufacture();
}
