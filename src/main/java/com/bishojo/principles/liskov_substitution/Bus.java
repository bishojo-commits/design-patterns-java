package com.bishojo.principles.liskov_substitution;

public class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 50;
    }

    @Override
    int getCubicCapacity() {
        return 10000;
    }

    String getType() {
        return "Schoolbus";
    }
}
